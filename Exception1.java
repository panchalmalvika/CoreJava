package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
		public static void main(String[] args) {
			System.out.println("Start code");
			int a,b,c;
			Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter A : ");
			a=sc.nextInt();
			System.out.print("Enter B : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division : "+c);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught : "+e);
		}
		System.out.println("End code");
		}
		
	}

