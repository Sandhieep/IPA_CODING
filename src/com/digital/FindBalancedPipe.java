package com.digital;
import java.util.*;
public class FindBalancedPipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        
        int[] input=new int[n];
        int[] output=new int[m];
        
        for(int i=0;i<n;i++) {
        	input[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++) {
        	output[i]=sc.nextInt();
        }
        
        int sum=0;
        int sum1=0;
        for(int i=0;i<n;i++) {
        	sum+=input[i]-r;
        }
        for(int i=0;i<m;i++) {
        	sum1+=output[i]-r;
        }
        if(sum==sum1) {
        	System.out.println("Balanced");
        }
        else {
        	if(sum>sum1) {
            	int ratedcapacity=-1;
            	ratedcapacity*=(sum-sum1)+r;
            	System.out.println(ratedcapacity);           	
            }
        	else if(sum<sum1) {
        		int ratedcapacity=0;
            	ratedcapacity=(sum-sum1)+r;
            	System.out.println(ratedcapacity);  
        	}
        	else {
        		System.out.print("error");
        	}
        }
        
	}

}
