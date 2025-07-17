package Test.first;

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
	void putadd()
	{
		System.out.println("Addition : "+(a+b));
	}
}
class Sub extends Add
{
	void putsub()
	{
		System.out.println("Subtraction : "+(a-b));
	}
}
class Mul extends Sub
{
	void putmul()
	{
		System.out.println("Multiplication : "+(a*b));
	}
}
class Div extends Mul
{
	void putdiv()
	{
		System.out.println("Division : "+(a/b));
	}
}
class Mod extends Div
{
	void putmod()
	{
		System.out.println("Subtraction : "+(a%b));
	}
}
public class Assignment10_1 {
	public static void main(String[] args) {
		Mod m=new Mod();
		m.geta();
		m.putadd();
		m.putsub();
		m.putmul();
		m.putdiv();
		m.putmod();
	}
}
