package com.hospital;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatientCollection {
    private List<Patient> patients;
    private Map<String, List<Bills>> patientBills;

    public PatientCollection() {
        this.patients = new ArrayList<>();
        this.patientBills = new HashMap<>();
    }

    
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    
    public boolean removePatient(String registrationId) {
        patientBills.remove(registrationId);
        return patients.removeIf(patient -> patient.getRegistrationId().equals(registrationId));
    }

    
    public Patient getPatientById(String registrationId) {
        for (Patient patient : patients) {
            if (patient.getRegistrationId().equals(registrationId)) {
                return patient;
            }
        }
        return null;
    }

    
    public int getTotalPatients() {
        return patients.size();
    }

    
    public List<Patient> getAllPatients() {
        return new ArrayList<>(patients);
    }

    public void addLabTestToPatient(String registrationId, LabTest labTest) {
        Patient patient = getPatientById(registrationId);
        if (patient != null) {
            patient.addLabTest(labTest);
            System.out.println("Lab test added successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    
    public void addBillToPatient(String registrationId, Bills bill) {
        if (!patientBills.containsKey(registrationId)) {
            patientBills.put(registrationId, new ArrayList<>());
        }
        patientBills.get(registrationId).add(bill);
        System.out.println("Bill added successfully.");
    }

    
    public List<Bills> getBillsByPatientId(String registrationId) {
        return patientBills.getOrDefault(registrationId, new ArrayList<>());
    }

    public static void main(String[] args) {
        PatientCollection collection = new PatientCollection();
        Scanner sca = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Retrieve Patient by ID");
            System.out.println("4. Get Total Number of Patients");
            System.out.println("5. View All Patients");
            System.out.println("6. Add Lab Test to Patient");
            System.out.println("7. Register for Lab Test and Billing");
            System.out.println("8. View Bills by Patient ID");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sca.nextInt();
            sca.nextLine(); 

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Registration ID: ");
                        String registrationId = sca.nextLine();
                        if (registrationId.length() != 7) {
                            throw new IllegalArgumentException("Registration ID must be a 7-digit number.");
                        }
                        System.out.print("Enter Name: ");
                        String name = sca.nextLine();
                        if (name.length() > 50) {
                            throw new IllegalArgumentException("Name cannot exceed 50 characters.");
                        }
                        System.out.print("Enter Email: ");
                        String email ="";
                        if(email.isEmpty()){
                            email=sca.nextLine();
                            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";     
                            Pattern pattern = Pattern.compile(regex);      
                                Matcher matcher = pattern.matcher(email);  
                                 
                                boolean rs=matcher.matches();
                                if(rs==false){
                                    throw new IllegalArgumentException("Invalid Email Format");
                                }
                        }
                        System.out.print("Enter Age: ");
                        String age = sca.nextLine();
                        System.out.print("Enter Blood Group: ");
                        String bloodGroup = sca.nextLine();
                        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
                        String dobString = sca.nextLine();
                        Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobString);
                        System.out.print("Enter Gender (Male/Female/Other): ");
                        String gender = sca.nextLine();
                        System.out.print("Enter Ward Number: ");
                        String wardNumber = sca.nextLine();
                        System.out.print("Enter Doctor Name: ");
                        String doctorName = sca.nextLine();
                        System.out.print("Enter Address: ");
                        String address = sca.nextLine();
                        if (address.length() > 100) {
                            throw new IllegalArgumentException("Address cannot exceed 100 characters.");
                        }
                        System.out.print("Enter Contact Number: ");
                        String contactNumber = sca.nextLine();
                        if (contactNumber.length() != 10) {
                            throw new IllegalArgumentException("Contact Number must be 10 digits.");
                        }
                        System.out.print("Enter Aadhar Number: ");
                        String aadharNumber = sca.nextLine();
                        if (aadharNumber.length() != 12) {
                            throw new IllegalArgumentException("Aadhar Number must be 12 digits.");
                        }

                        Patient patient = new Patient(registrationId, name, email, age, bloodGroup, dob, gender, wardNumber, doctorName, address, contactNumber, aadharNumber);
                        collection.addPatient(patient);
                        System.out.println("Patient added successfully.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Error: Invalid date format.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Registration ID to remove: ");
                    String regIdToRemove = sca.nextLine();
                    boolean removed = collection.removePatient(regIdToRemove);
                    if (removed) {
                        System.out.println("Patient removed successfully.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Registration ID to retrieve: ");
                    String regIdToRetrieve = sca.nextLine();
                    Patient retrievedPatient = collection.getPatientById(regIdToRetrieve);
                    if (retrievedPatient != null) {
                        System.out.println(retrievedPatient);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 4:
                    int totalPatients = collection.getTotalPatients();
                    System.out.println("Total patients: " + totalPatients);
                    break;

                case 5:
                    List<Patient> allPatients = collection.getAllPatients();
                    for (Patient patient : allPatients) {
                        System.out.println(patient);
                    }
                    break;

                case 6:
                    try {
                        System.out.print("Enter Patient Registration ID: ");
                        String regId = sca.nextLine();
                        System.out.print("Enter Lab Test Name (CBC/BSL): ");
                        String testName = sca.nextLine();
                        System.out.print("Enter Test Details: ");
                        String testDetails = sca.nextLine();

                        LabTest labTest = new LabTest(testName, testDetails);
                        collection.addLabTestToPatient(regId, labTest);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 7:
                    try {
                        System.out.print("Enter Patient Registration ID: ");
                        String regId = sca.nextLine();
                        System.out.print("Enter Test Type(General/Full_Checup): ");
                        String testType = sca.nextLine();
                        System.out.print("Enter Category: ");
                        String category = sca.nextLine();
                        System.out.print("Enter Weight: ");
                        int weight = sca.nextInt();
                        System.out.print("Enter Height: ");
                        int height = sca.nextInt();
                        sca.nextLine(); 
                        System.out.print("Enter Mobile Number: ");
                        String mobileNumber = sca.nextLine();
                        double amount = 0;
                        if(testType.equalsIgnoreCase("General")){
                        	amount=1200.00;
                        }
                        else if(testType.equalsIgnoreCase("Full_Checkup")){
                        	amount=2000.00;
                        }

                        Bills bill = new Bills(testType, category, weight, height, mobileNumber, amount);
                        collection.addBillToPatient(regId, bill);
                        System.out.println("Patient Registration for Lab tests is Successful");
                        System.out.println(bill);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 8:
                    System.out.print("Enter Patient Registration ID to view bills: ");
                    String regIdToViewBills = sca.nextLine();
                    List<Bills> billsList = collection.getBillsByPatientId(regIdToViewBills);
                    if (!billsList.isEmpty()) {
                        for (Bills bill : billsList) {
                            System.out.println(bill);
                        }
                    } else {
                        System.out.println("No bills found for the patient.");
                    }
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sca.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
