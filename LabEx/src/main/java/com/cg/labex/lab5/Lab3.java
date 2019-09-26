package com.cg.labex.lab5;

import java.util.Scanner;

public class Lab3 {
	
	public void prime(int n){
		for(int i=2;i<=n;i++) {
			int count=0;
		    for(int j=2;j<i;j++) {
			   if((i%j)==0) {
				  count++;
				  break;	
			   }
		    }
			if(count==0) {
              System.out.println(i);
		}
	}		
		
	}
	public static void main(String args[]) {
		Lab3 obj=new Lab3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		obj.prime(n);
		
	}

}
