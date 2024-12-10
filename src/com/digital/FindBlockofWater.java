package com.digital;
import java.util.*;
public class FindBlockofWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int[] left=new int[n];
        int[] right=new int[n];
        int maxleft=0;
        int maxright=0;
        
        for(int i=0;i<n;i++) {
        	maxleft=max(arr[i],maxleft);
        	left[i]=maxleft;
        }
        for(int i=n-1;i>=0;i--) {
        	maxright=max(arr[i],maxright);
        	right[i]=maxright;
        }
        
        int count=0;
        for(int i=0;i<n;i++) {
        	count+=min(left[i],right[i])-arr[i];
        }
        
        System.out.println(count);
        
        
	}
	 static int max(int val,int maxleft) {
    	if(val>maxleft)
    		return val;
    	else
    		return maxleft;
    }
	 static int min(int val1,int val2) {
	    	if(val1<val2)
	    		return val1;
	    	else
	    		return val2;
	    }

}
