package com.digital;
import java.util.*;
public class NonRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       char[] ch=str.toCharArray();
       HashMap<Character,Integer> obj=new HashMap<Character,Integer>();
       for(char c:ch) {
    	   if(obj.get(c)==null) {
    		   obj.put(c, 1);
    	   }
    	   else {
    		   obj.put(c, obj.get(c)+1);
    	   }
       }
       for(char c:ch) {
    	   if(obj.get(c)==1) {
    		   System.out.print(c);
    	   }
       }
       /*int[] arr=new int[256];
       for(int i=0;i<str.length();i++) {
       	   arr[str.charAt(i)]++;
       }
       for(int i=0;i<arr.length;i++) {
       	   if(arr[i]==1) {
       		   System.out.print((char)i);
       	   }
       }*/
       
       
	}

}
/*int[] arr=new int[256];
for(int i=0;i<str.length();i++) {
	   arr[str.charAt(i)]++;
}
for(int i=0;i<arr.length;i++) {
	   if(arr[i]==1) {
		   System.out.print((char)i);
	   }
}*/