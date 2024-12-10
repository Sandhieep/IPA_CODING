package com.tcs;

public class LabTest {
       private String TestName;
       private String TestDetails;
       
       public LabTest(String TestName,String TestDetails) {
    	   this.TestName=TestName;
    	   this.TestDetails=TestDetails;
       }

	@Override
	public String toString() {
		return "LabTest [TestName=" + TestName + ", TestDetails=" + TestDetails + "]";
	}
       
}
