package Test.first;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) 
	{
		int id,age;
		long mono;
		String name;
		char grade='A';
		double per;
		boolean operation;
		float height;
		short weight;
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		id=s.nextInt();
		
		System.out.print("Enter Name : ");
		name=s.next();
		
		System.out.print("Enter Age : ");
		age=s.nextInt();
		
		System.out.print("Enter Mobile Number : ");
		mono=s.nextLong();
		
		System.out.print("Enter Height : ");
		height=s.nextFloat();
		 
		System.out.print("Enter Weight : ");
		weight=s.nextShort();
		
		System.out.print("Enter Percentage : ");
		per=s.nextDouble();
		
		System.out.print("You want to Current job in Tops True or False : ");
		operation=s.nextBoolean();
		
		System.out.println("************************************ Display Student Information ************************************");
		
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Mobile Number : "+mono);
		System.out.println("Height : "+height);
		System.out.println("Weight : "+weight);
		System.out.println("Percentage : "+per);
		System.out.println("Your Answer : "+operation);
	}
}
