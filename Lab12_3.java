package assignment;

import java.util.Scanner;

public class Lab12_3 {

	public static void main(String[] args) {
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
