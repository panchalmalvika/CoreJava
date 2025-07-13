package assignment;

import java.util.Scanner;

public class Lab12_1 {

	public static void demo()
	{
		int a;
		Scanner ab=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=ab.nextInt();
		if(a>0)
		{
			System.out.println("if condition True...");
		}
		else
		{
			System.out.println("else condition Is True...");
		}
	}
	public static void main(String[] args) {
		try{
			demo();
		}catch(Exception e) {
			System.out.println("Please Enter Positive value only..");
		}finally {
			System.out.println("Finally called");
		}
		
	}
}
