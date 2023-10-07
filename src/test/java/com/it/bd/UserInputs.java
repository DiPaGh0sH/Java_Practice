package com.it.bd;

import java.util.Scanner;

public class UserInputs {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
	       System.out.println("Enter your name: ");
	       String name = obj.nextLine();
	       
	       System.out.println("Enter your ID: ");
	       int id = obj.nextInt();
	       
	       System.out.println("Enter your CGPA: ");
	       float cgpa = obj.nextFloat();
	       
	       System.out.println("Your name is: "+name+", Your ID is: "+id+", Your CGPA is: "+cgpa);
	}

}
