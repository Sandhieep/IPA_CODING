package com.digital;
import java.util.*;
public class CountConsecutiveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        int count=0;
        char[] ch= {'a','e','i','o','u'};
        String[] arr=str.split(" ");
        for(int i=0;i<ch.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		if(ch[i]==arr[j].charAt(j) && ch[i]==arr[j].charAt(j+1)) {
        			count++;
        		}

        	}
       }
        System.out.print(count);
	}

}
