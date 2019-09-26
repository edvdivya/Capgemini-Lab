package com.cg.labex.lab1;

import java.util.Scanner;

public class Lab2 {


	static int num;
	public static int calculateDifference(int n){
		int x=0;
		int y=0;
		for(int i=1;i<=n;i++){
			x=x+i;
		}
		for(int i=1;i<=n;i++){
			int temp=i*i;
			y=y+temp;
		}
		return y-x;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to calculate difference between their squares and sum of squares: ");
		num=sc.nextInt();
		int diff=calculateDifference(num);
		System.out.println(diff);
		
	}

}
