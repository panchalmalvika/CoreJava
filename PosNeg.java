package Test.first;

import java.util.Scanner;

public class PosNeg {
	public static void main(String[] args) {
	int a;
	Scanner ab=new Scanner(System.in);
	System.out.print("Enter A : ");
	a=ab.nextInt();
	if(a>0)
	{
		System.out.println("a is positive");
	}
	else
	{
		System.out.println("A is negative");
	}
}
}