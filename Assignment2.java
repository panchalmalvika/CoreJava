package assignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		
		if(a>=0 && b>=0)
		{
			System.out.println("Addition : "+(a+b));
			System.out.println("Subtraction : "+(a-b));
			System.out.println("Multiplication : "+(a*b));
		}
		else
		{
			System.out.println("Please enter value greter than 0");
		}
		if(b!=0)
		{
			System.out.println("Division : "+(a/b));
			System.out.println("Module : "+(a%b));
		}
		else 
		{
			System.out.println("Error...");
		}
	}
}
