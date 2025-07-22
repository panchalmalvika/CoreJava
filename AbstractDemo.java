package Test.first;

import java.util.Scanner;

abstract class Ademo
{
	void abc()
	{
		int id;
		String name;
		double weight;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Id number : ");
		id=sc.nextInt();
		System.out.print("Enter name : ");
		name=sc.next();
		System.out.print("Enter your weight : ");
		weight=sc.nextDouble();
	}
	abstract void abc2();
}
class Ademo2 extends Ademo
{
	void abc2() {
		System.out.println("Thank you.....");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Ademo2 a1=new Ademo2();
		a1.abc();
		a1.abc2();
	}
}
