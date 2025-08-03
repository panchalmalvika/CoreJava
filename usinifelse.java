package Test.first;

import java.util.Scanner;

public class usinifelse {
	public static void main(String[] args) {
		int a,b;
		Scanner ab=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=ab.nextInt();
		System.out.print("Enter B : ");
		b=ab.nextInt();
		if(a>b)
		{
			System.out.println("a is max");
		}
		else
		{
			System.out.println("b is max");
		}
	}
}
