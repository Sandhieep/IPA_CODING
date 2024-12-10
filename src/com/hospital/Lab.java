package com.hospital;
public class Lab {
    private String testType;
    private String category;
    private int weight;
    private int height;
    private String mobileNumber;

    
    public Lab(String testType, String category, int weight, int height, String mobileNumber) {
        if (!isValidMobileNumber(mobileNumber)) {
            throw new IllegalArgumentException("Invalid mobile number");
        }
        if(!testType.equalsIgnoreCase("General") && !testType.equalsIgnoreCase("Full_Checkup")){
        	throw new IllegalArgumentException("Invalid Lab type,only General or Full_Checkup are allowed.");
        }
        this.testType = testType;
        this.category = category;
        this.weight = weight;
        this.height = height;
        this.mobileNumber = mobileNumber;
    }

    public String getTestType() {
        return testType;
    }

    public String getCategory() {
        return category;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    private boolean isValidMobileNumber(String mobileNumber) {
        return mobileNumber != null && mobileNumber.matches("\\d{10}");
    }

    @Override
    public String toString() {
        return "Lab{" +
                "testType='" + testType + '\'' +
                ", category='" + category + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
