package com.cg.labex.lab5;

import java.util.Scanner;

public class Lab1Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab1 l = new Lab1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice\n1.Red\n2. Yellow\n3. Green");
		int inp = sc.nextInt();
		System.out.println(l.trafficLight(inp));
		sc.close();
		String[] arr = {};
	}

}

