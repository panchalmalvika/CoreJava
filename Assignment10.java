package Test.first;

import java.util.Scanner;

class Addition
{
	int a,b;
	void geta()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void puta()
	{
		System.out.println("\nA : "+a);
		System.out.println("B : "+b);
		System.out.println("\nAddition : "+(a+b));
	}
}
class Subtraction extends Addition
{
	int a,b;
	void getb()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter A : ");
		a=sc.nextInt();
		
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void putb()
	{
		System.out.println("\nA : "+a);
		System.out.println("B : "+b);
		System.out.println("\nSubtraction : "+(a-b));
	}
}
class Multiplication extends Subtraction
{
	int a,b;
	void getc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter A : ");
		a=sc.nextInt();
		
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void putc()
	{
		System.out.println("\nA : "+a);
		System.out.println("B : "+b);
		System.out.println("\nMultoplication : "+(a-b));
	}
}
class Division extends Multiplication
{
	int a,b;
	void getd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter A : ");
		a=sc.nextInt();
		
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void putd()
	{
		System.out.println("\nA : "+a);
		System.out.println("B : "+b);
		System.out.println("\nDivision : "+(a-b));
	}
}
class Module extends Division
{
	int a,b;
	void gete()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter A : ");
		a=sc.nextInt();
		
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void pute()
	{
		System.out.println("\nA : "+a);
		System.out.println("B : "+b);
		System.out.println("\nModule : "+(a-b));
	}
}
public class Assignment10 {

	public static void main(String[] args) {
		Module a1=new Module();
		a1.geta();
		a1.puta();
		a1.getb();
		a1.putb();
		a1.getc();
		a1.putc();
		a1.getd();
		a1.putd();
		a1.gete();
		a1.pute();		
	}
	
}
