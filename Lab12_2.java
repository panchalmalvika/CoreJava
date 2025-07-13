package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab12_2 {
	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter A : ");
			a=sc.nextInt();
			System.out.println("Enter B : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division : "+c);
		}catch(InputMismatchException i)
		{
			System.out.println("Exception called : "+i);
		}catch(ArithmeticException i)
		{
			System.out.println("Exception called : "+i);
		}
	}
}
