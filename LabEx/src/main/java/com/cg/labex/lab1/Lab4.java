package com.cg.labex.lab1;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args){
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int base=2;
		for(int i=1;i<num/2;i++){
			if(Math.pow(base,i)==num){
				System.out.println("Number is power of 2");
				return;
			}
		}
		System.out.println("Number is not power of 2");
	}
}
