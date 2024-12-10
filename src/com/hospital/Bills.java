package com.hospital;
public class Bills extends Lab {
    private double amount;

    
    public Bills(String testType, String category, int weight, int height, String mobileNumber, double amount) {
        super(testType, category, weight, height, mobileNumber);
        this.amount = amount;
    }

    public double getAmount() {
    	return amount;
    }

    @Override
    public String toString() {
        return "Bills{" +
                "testType='" + getTestType() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", mobileNumber='" + getMobileNumber() + '\'' +
                ", amount=" + amount +
                '}';
    }
}
