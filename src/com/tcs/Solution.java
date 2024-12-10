package com.tcs;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
//import com.hospital.Patient;
public class Solution {
	public static ArrayList<PatientDetails> arr=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	 /*public PatientDetails() {
	        this.arr = new ArrayList<>();
	 }*/
	public static int readPatientId(String prompt,int length) {
		while(true) {
			System.out.println(prompt);
			int patientid=sc.nextInt();
			try {
			if(String.valueOf(patientid).length()==length) {
				return patientid;
			}
			else {
				//System.out.println("Invalid Patient Id. Please enter exactly " + length + " digits.");
				throw new InputMismatchException();
				//sc.nextLine();
			}
			}catch(InputMismatchException e) {
				System.out.println("Invalid Patient Id. Please enter exactly " + length + " digits.");
				sc.nextLine();

			}
		}
	}
	public static String readString(String prompt,int length) {
		while(true) {
			System.out.println(prompt);
			String patientname=sc.nextLine();
			try {
			if(patientname.length()<=length) {
				return patientname;
			}
			else {
				//System.out.println("Input too long. Please enter a value with at most " + length + " characters.");
				throw new InputMismatchException();
			}
			}catch(InputMismatchException e) {
				System.out.println("Input too long. Please enter a value with at most " + length + " characters.");
			}
		}
	}
	public static String readEmail(String prompt) {
		while(true) {
			System.out.println(prompt);
			String email=sc.next();
			if(email.length()!=0){
            	String regex = "^(.+)@(.+)$";
            	Pattern pattern = Pattern.compile(regex);   
                Matcher matcher = pattern.matcher(email);  
                //System.out.println(email +" : "+ matcher.matches()+"\n");
               boolean rs=matcher.matches();
               if(rs==true)
               {
            	   return email;
               }
               else{
               	 System.out.println("Please enter valid email :");
               }
            }
			else {
				System.out.println("Please enter an Email:");
			}
		}
	}
	public static long readLong(String prompt,int length) {
		while(true) {
			System.out.println(prompt);
			long ca=sc.nextLong();
			try {
			if(String.valueOf(ca).length()==length) {
				return ca;
			}
			else {
				//System.out.println("Invalid Aadhar number. Please enter exactly " + length + " digits.");
				//sc.nextLine();
				throw new InputMismatchException();
			}
			}catch(InputMismatchException e) {
				System.out.println("Invalid Aadhar number. Please enter exactly " + length + " digits.");
				sc.nextLine();
			}
		}
	}
	public static String readString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
   /*public static void LabTestToPatient(int id,LabTest lt) {
		PatientDetails patientid=PatientById(id);
		if(patientid!=null) {
			patientid.RegisterForTest(lt);
			System.out.println("Lab test added successfully.");
		}
		else {
			System.out.println("Patient not found.");
		}
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       
       while(true) {
    		   System.out.println("Hospital Management System");
    		   int choice=sc.nextInt();
    	       sc.nextLine();
       switch(choice) {
       case 1:
    	   //try {
    	   
    	      int PatientId= readPatientId("Enter Patient Id:",7); 
    	  	  String PatientName=readString("Enter Patient Name:",50);
    	  	  sc.nextLine(); 	
    	  	  String Email=readEmail("Enter Email:");    	  	  
    	  	  System.out.println("Enter Age:");
    	  	  int Age=sc.nextInt();   	  	
    	  	  sc.nextLine();
    	  	  System.out.println("Enter Patient DOB:");
    	  	  String PatientDOB=sc.nextLine();
    	  	  System.out.println("Enter Gender:");
    	  	  String Gender=sc.next();    	  	
    	  	  System.out.println("Enter Ward Number:");
    	  	  String WardNumber=sc.next();   	  	
    	  	  System.out.println("Enter Doctor Name:");
    	  	  String DoctorName=sc.nextLine();
    	  	  sc.nextLine();
    	  	  String Address=readString("Enter Address:",100); 
    	  	  sc.nextLine();    	  	
    	  	  long ContactNumber=readLong("Enter Contact Number:",10);    	  	     	  	
    	  	  long AadhaarNumber=readLong("Enter Aadhaar Number:",12);  	  	  
    	  	  System.out.println("Enter Blood Group:");
    	  	  String BloodGroup=sc.next();
    	  	
    	  	  PatientDetails pp=new PatientDetails(PatientId,PatientName,Email,Age,PatientDOB,Gender,WardNumber,DoctorName,Address,ContactNumber,AadhaarNumber,BloodGroup);
    	  	  arr.add(pp);
    	  	  System.out.println("Patient added successfully.");
    	  	  break;
    	   //}//catch (IllegalArgumentException e) {
               //System.out.println("Error: " + e.getMessage());
           //} catch (Exception e) {
              // System.out.println("Error: Invalid date format.");
           //}
    	   //break;
       case 2:
    	   System.out.println("Remove Patient Details by Id:");
    	   int pid=sc.nextInt();
    	   RemovePatientById(pid);
    	   System.out.println("Patient Details Removed Sucessfully");
    	   break;
       case 3:
    	   System.out.println("Please Enter Patient Id to View Details :");
    	   int pid1=sc.nextInt();
    	   PatientDetails ans=PatientById(pid1);
    	   if (ans != null) {
               System.out.println(ans);
           } else {
               System.out.println("Patient not found.");
           }
    	   System.out.println("Patient Details Displayed Successfully");
    	   break;
       case 4:
    	   //System.out.println("Total Number of Patients:");
    	   int total=TotalPatients();
    	   System.out.println("Total Number of Patients is:"+ total);
    	   break;
       case 5:
    	   System.out.println("Display All Patient Details:");
    	   ViewAllPatientDetails();
    	   break;
       case 6:
    	   try {
    	   int id=readPatientId("Enter Patient Registration Id:",7);
    	   PatientDetails patient=PatientById(id);
    	   if(patient!=null) {
    		   System.out.println("Enter Lab Test Name (CBC/BSL):");
        	   String testname=sc.nextLine();
        	   System.out.println("Enter Test Details:");
        	   String testdetails=sc.nextLine();
        	   LabTest lt=new LabTest(testname,testdetails);
        	   patient.RegisterForTest(lt);
   			System.out.println("Lab test added successfully.");
    	   }
    	   else {
    		   throw new IllegalArgumentException();
    	   }
    	   
    	   //LabTestToPatient(id,lt);
    	   }catch(IllegalArgumentException e) {
    		   System.out.println("Error:"+ e.getMessage());
    	   }
    	   break;
    	   
       default:
           System.out.println("Invalid choice. Please try again.");
           break;
       }
    	   
       }
	}
	public static void RemovePatientById(int pid) {
		arr.removeIf(pp->pp.getPatientId()==(pid));
	}
	public static PatientDetails PatientById(int pid1) {
		/*return arr.stream()
                .filter(pp -> pp.getPatientId()==(pid1))
                .findFirst()
                .orElse(null);*/
		for (PatientDetails pp : arr) {
            if (pp.getPatientId()==(pid1)) {
                return pp;
            }
        }
        return null;
	}
	public static int TotalPatients() {
		return arr.size();
	}
	public static void ViewAllPatientDetails() {
		for(PatientDetails pp:arr) {
			System.out.println(pp);
		}
	}
    public static void DisplayPatientDetails(int PatientId,String PatientName,String Email,int Age,String PatientDOB,String Gender,int WardNumber,String DoctorName,String Address,long ContactNumber,long AadhaarNumber,String BloodGroup)
    {
  	  System.out.println("Patient Id:"+ PatientId);
  	  System.out.println("Patient Name:"+ PatientName);
  	  System.out.println("Email:"+ Email);
  	  System.out.println("Age:"+ Age);
  	  System.out.println("Patient DOB"+ PatientDOB);
  	  System.out.println("Gender:"+ Gender);
  	  System.out.println("Ward Number");
  	  System.out.println("Doctor Name:"+ DoctorName);
  	  System.out.println("Address:"+ Address);
  	  System.out.println("Contact Number:"+ ContactNumber);
  	  System.out.println("Aadhaar Number:"+ AadhaarNumber);
  	  System.out.println("Blood Group:"+ BloodGroup);
  	  
  	  
    }

}
