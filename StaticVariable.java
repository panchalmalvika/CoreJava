package Test.first;

import java.util.Scanner;

public class StaticVariable {

	static int a;
	Scanner sc=new Scanner(System.in);
	void geta()
	{
		System.out.print("Enter A : ");
		a=sc.nextInt();
	}
	void puta()
	{
		System.out.println("A : "+a);
	}
	public static void main(String[] args) {
		StaticVariable S1=new StaticVariable();
		StaticVariable S2=new StaticVariable();
		StaticVariable S3=new StaticVariable();
		S1.geta();
		S2.geta();
		S3.geta();
		S1.puta();
		S1.puta();
		S1.puta();
	}
}
