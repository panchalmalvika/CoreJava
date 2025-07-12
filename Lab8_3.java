package assignment;

import java.util.Scanner;

public class Lab8_3 {

	public static void main(String[] args) {
		String a;
		String b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		a=sc.next();
		System.out.print("Enter Another String : ");
		b=sc.next();
		if(a.equals(b))
		{
			System.out.println("Two String is Equal...");
		}
		else
		{
			System.out.println("Two String Not Equal...");
		}
	}
}
