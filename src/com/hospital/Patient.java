package com.hospital;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient {
    private String registrationId;
    private String name;
    private String email;
    private String age;
    private String bloodGroup;
    private Date dob;
    private String gender;
    private String wardNumber;
    private String doctorName;
    private String address;
    private String contactNumber;
    private String aadharNumber;
    private List<LabTest> labTests;

    
    public Patient(String registrationId, String name, String email, String age, String bloodGroup, Date dob,
                   String gender, String wardNumber, String doctorName, String address, String contactNumber,
                   String aadharNumber) {
      /* if (registrationId.length() != 7) {
            throw new IllegalArgumentException("Registration ID must be a 7-digit number.");
       }
        if (name.length() > 50) {
            throw new IllegalArgumentException("Name cannot exceed 50 characters.");
        }
        if (address.length() > 100) {
            throw new IllegalArgumentException("Address cannot exceed 100 characters.");
        }
        if (contactNumber.length() != 10) {
            throw new IllegalArgumentException("Contact Number must be 10 digits.");
        }
        if (aadharNumber.length() != 12) {
            throw new IllegalArgumentException("Aadhar Number must be 12 digits.");
        }*/
        this.registrationId = registrationId;
        this.name = name;
        this.email = email;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.dob = dob;
        this.gender = gender;
        this.wardNumber = wardNumber;
        this.doctorName = doctorName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.aadharNumber = aadharNumber;
        this.labTests = new ArrayList<>();
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void 
    addLabTest(LabTest labTest) {
        this.labTests.add(labTest);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "registrationId='" + registrationId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", wardNumber='" + wardNumber + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", labTests=" + labTests +
                '}';
    }
}
