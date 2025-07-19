package Test.first;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args) {
		int a,b;
		Scanner ab=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=ab.nextInt();
		if(a%2==0)
		{
			System.out.println("a is even");
		}
		else
		{
			System.out.println("A is odd");
		}
	}
}
