package com.cg.labex.lab5;

import java.util.Scanner;

public class Lab5 {
	
		public static void main(String args[]) throws ValAgeException {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age");
			int age=sc.nextInt();
			try {
				if(age<=15)
					throw new ValAgeException("Fine");
				else
					System.out.println("Age : "+age);
			}catch(ValAgeException e) {
				System.out.println("Age of a person should be above 15.");
			}
		}
}
