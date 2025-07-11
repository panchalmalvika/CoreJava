package assignment;

import java.util.Scanner;

public class Lab5_1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		System.out.print("Enter C : ");
		c=sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Maximum");
			}
			else
			{
				System.out.println("C is Maximum");
			}
		}
		else if(b>c)
		{
			System.out.println("B is Maximum");
		}
		else
		{
			System.out.println("C is Maximum");
		}
	}
}
