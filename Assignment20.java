package assignment;

import java.util.Scanner;

class Add
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
		System.out.println("Addition : "+(a+b));
	}
}
class Sub extends Add
{
	void putb()
	{
		System.out.println("Subtraction : "+(a-b));
	}
}
class Mul extends Add
{
	void putc()
	{
		System.out.println("Multiplication : "+(a*b));
	}
}
class Div extends Add
{
	void putd()
	{
		System.out.println("Division : "+(a/b));
	}
}
class Mod extends Add
{
	void pute()
	{
		System.out.println("Module : "+(a%b));
	}
}
public class Assignment20 {
	public static void main(String[] args) {
		Mod m=new Mod();
		Div d=new Div();
		Mul m1=new Mul();
		Sub s=new Sub();
		
		m.geta();
		m.puta();
		s.putb();
		m1.putc();
		d.putd();
		m.pute();
		
	}
}
