package Test.first;

import java.util.Scanner;

class A
{
	int a;
	void geta()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
	}
	void puta()
	{
		System.out.println("A : "+a);
	}
}
class B extends A
{
	int b;
	void getb()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void putb()
	{
		System.out.println("B : "+b);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		B b1=new B();
		b1.geta();
		b1.getb();
		b1.puta();
		b1.putb();
	}
}
