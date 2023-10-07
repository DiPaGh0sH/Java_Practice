package com.it.bd;

import java.util.Scanner;

public class Datatype {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name = obj.nextLine();
       System.out.println("Your name is: "+name);
       
       System.out.println("Enter your ID: ");
       int id = obj.nextInt();
       System.out.println("Your ID is: "+id);
       
       System.out.println("Enter your CGPA: ");
       float cgpa = obj.nextFloat();
       System.out.println("Your CGPA is: "+cgpa);
	}

}
