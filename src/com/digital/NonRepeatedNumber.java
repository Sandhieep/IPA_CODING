package com.digital;
import java.util.*;
public class NonRepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        boolean[] bool=new boolean[10];
        
        for(int i=n1;i<=n2;i++) {
        	int num=i;
        	Arrays.fill(bool, false);
        	while(num>0) {
        		if(bool[num%10]==true) {
        			break;
        		}
        		else {
        			bool[num%10]=true;
        			num/=10;
        		}
        	}
        	if(num==0) {
        		count++;
        	}
        }
        System.out.print(count);
	}

}
