package com.cg.labex.lab5;

import java.util.Scanner;

public class Lab2 {
	
	public int fib(int n) {
		int a=1;
		int b=1;
		int ar[]=new int[n];
		ar[0]=a;
		ar[1]=b;
		int i=2,c=0;
		while(i<n) {
			c=a+b;
			ar[i]=c;
			a=b;
			b=c;
			i++;
		}
		return ar[n-1];
	}
	
	public int recurFib(int n) {
		if(n==0) 
		{
			return 0;
		}
		else if(n==1) 
		{
			return 1;
		}
		else 
		{
			return (recurFib(n-1)+recurFib(n-2));
		}
	}
	public static void main(String args[]) {
		Lab2 obj=new Lab2();
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(obj.fib(n));
		System.out.println(obj.recurFib(n));
	}

}
