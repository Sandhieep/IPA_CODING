package com.hospital;
public class LabTest {
    private String testName;
    private String testDetails;

    
    public LabTest(String testName, String testDetails) {
        if (!testName.equals("CBC") && !testName.equals("BSL")) {
            throw new IllegalArgumentException("Invalid lab test name. Only 'CBC' and 'BSL' are allowed.");
        }
        this.testName = testName;
        this.testDetails = testDetails;
    }

    @Override
    public String toString() {
        return "LabTest{" +
                "testName='" + testName + '\'' +
                ", testDetails='" + testDetails + '\'' +
                '}';
    }
}
