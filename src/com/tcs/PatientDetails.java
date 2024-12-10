package com.tcs;
import java.util.*;
import java.util.ArrayList;

public class PatientDetails {
	
      Scanner sc=new Scanner(System.in);
      private int PatientId;
      private String PatientName;
      private String Email;
      private int Age;
      private String PatientDOB;
      private String Gender;
      private String WardNumber;
      private String DoctorName;
      private String Address;
      private long ContactNumber;
      private long AadhaarNumber;
      private String bloodGroup;
     private static ArrayList<LabTest> lb=new ArrayList<>();
      
      public PatientDetails(int PatientId, String PatientName, String Email, int Age, String PatientDOB,
                     String Gender, String WardNumber, String DoctorName, String Address, long ContactNumber,
                     long AadhaarNumber,String bloodGroup) {
    	  this.PatientId = PatientId;
          this.PatientName = PatientName;
          this.Email = Email;
          this.Age = Age;
          this.PatientDOB = PatientDOB;
          this.Gender = Gender;
          this.WardNumber = WardNumber;
          this.DoctorName = DoctorName;
          this.Address = Address;
          this.ContactNumber = ContactNumber;
          this.AadhaarNumber = AadhaarNumber;
          this.bloodGroup = bloodGroup;
          this.lb=new ArrayList<>();

         
      }
      public int getPatientId() {
    	  return PatientId;
      }
      public void RegisterForTest(LabTest lt){
      	this.lb.add(lt);
      }
	@Override
	public String toString() {
		return "PatientDetails [PatientId=" + PatientId + ", PatientName=" + PatientName + ", Email="
				+ Email + ", Age=" + Age + ", PatientDOB=" + PatientDOB + ", Gender=" + Gender + ", WardNumber="
				+ WardNumber + ", DoctorName=" + DoctorName + ", Address=" + Address + ", ContactNumber="
				+ ContactNumber + ", AadhaarNumber=" + AadhaarNumber + ", bloodGroup=" + bloodGroup + ",lb=" + lb+"]";
	}
      
//       static void addPatientDetails(Scanner sc) {
//    	  int PatientId=sc.nextInt();
//    	  sc.nextLine();
//    	  String PatientPatientName=sc.nextLine();
//    	  /*while(PatientPatientName.length()>50) {
//    		  System.out.println("Please enter the correct PatientName:");
//    		  PatientPatientName=sc.nextLine();
//    	  }*/
//    	  String Email=sc.next();
//    	  int Age=sc.nextInt();
//    	  sc.nextLine();
//    	  String PatientPatientDOB=sc.nextLine();
//    	  String Gender=sc.next();
//    	  int WardNumber=sc.nextInt();
//    	  sc.nextLine();
//    	  String DoctorName=sc.nextLine();
//    	  String Address=sc.nextLine();
//    	  /*while(Address.length()>100) {
//    		  System.out.println("Please enter the Valid Address:");
//    		  Address=sc.nextLine();
//    	  }*/
//    	  long ContactNumber=sc.nextLong();
//    	  int len=String.valueOf(ContactNumber).length();
//    	  /*while(len>10) {
//    		  System.out.println("Please enter the valid Number:");
//    		  ContactNumber=sc.nextLong();
//    	  }*/
//    	  long AadhaarNumber=sc.nextLong();
//    	  int len1=String.valueOf(AadhaarNumber).length();
//    	  /*while(len1>12) {
//    		  System.out.println("Please enter the valid Aadhaar Number:");
//    		  AadhaarNumber=sc.nextLong();
//    	  }*/
//    	  sc.nextLine();
//    	  String BloodGroup=sc.next();
//    	  DisplayPatientDetails(PatientId,PatientPatientName,Email,Age,PatientPatientDOB,Gender,WardNumber,DoctorName,Address,ContactNumber,AadhaarNumber,BloodGroup);
//    	
//      }
//      public static void DisplayPatientDetails(int PatientId,String PatientNmae,String Email,int Age,String PatientPatientDOB,String Gender,int WardNumber,String DoctorName,String Address,long ContactNumber,long AadhaarNumber,String BloodGroup)
//      {
//    	  System.out.println(PatientId);
//    	  
//      }
}
