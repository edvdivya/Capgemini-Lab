package com.cg.labex.lab1;

import java.util.Scanner;

public class Lab3 {


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int num=sc.nextInt();
		int c=0;
		int a=0;
		int b=0;
		for(int i=0;num>0;i++)
		{
			a=num%10;
			num=num/10;
			b=num%10;
			if(a<b){
				System.out.println("Not an increasing number");
				return;
			}
			else
				c++;
		}
		if(c>0){
			System.out.println("An increasing number");
		}
		
	}

}
