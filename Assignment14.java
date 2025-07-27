package assignment;

import java.util.Scanner;

class Weigthlossc
{
	int a;
	String n,l;
	float h;
	double w;
	void geta()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Do You Want Weight Loss : ");
		l=s.next();
		System.out.print("Enter your Name : ");
		n=s.next();
		System.out.print("Enter Age : ");
		a=s.nextInt();
		System.out.print("Enter Height : ");
		h=s.nextFloat();
		System.out.print("Enter Weight : ");
		w=s.nextDouble();
	}
	void puta()
	{
		System.out.println("Name : "+n+"\nAge : "+a+"\nHeight : "+h+"\nWeight : "+w);	
	}
}
public class Assignment14 {
	public static void main(String[] args) {
		Weigthlossc w1=new Weigthlossc();
		w1.geta();
		w1.puta();
	}
}
