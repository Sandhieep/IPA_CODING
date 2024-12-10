package com.tcs;
import java.util.*;
public class ExceptionHandling {
static int id;
static String name;
static double salary;
static long number;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       Id(sc);
       name(sc);
       salary(sc);
	}
static void Id(Scanner sc) throws Exception{
	 id=sc.nextInt();
		if(id<0) {
			
			throw new Exception("Invalid Id");
		}
		else {
			System.out.println(id);
		}
	}
static void name(Scanner sc) throws Exception {
	name=sc.next();
	try {
		System.out.println(name);
	}catch(InputMismatchException e){
		System.out.println("Enter valid name");
	}
}
static void salary(Scanner sc) throws Exception {
	salary=sc.nextDouble();
		if(salary>12000) {
			System.out.println(salary);
		}
		else {
			throw new Exception("Salary should be graeter tghan 12000");
		}
	}
static void number(Scanner sc) {
	
}
}



