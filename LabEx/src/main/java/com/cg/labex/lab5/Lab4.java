package com.cg.labex.lab5;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("First Name");
	String f=sc.nextLine();
	System.out.println("Last Name");
	String l=sc.nextLine();
	try {
		if(f.isEmpty() || l.isEmpty()) {
			throw new NullPointerException();
		   }
		else
			System.out.println(f+" "+l);
	}catch(NullPointerException e) {
		System.out.println("First and Last name should not be empty");
	}
	
  }
}
