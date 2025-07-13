package assignment;

import java.util.Scanner;

interface payment
{
	void name();
}
interface payment1 extends payment
{
	void amount();
}
public class Lab10_3 {
	public void name()
	{
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name : ");
		name=sc.next();
	}
	public void amount()
	{
		int amount,pin=1234;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Amount That Pay : ");
		amount=sc.nextInt();
		System.out.print("Enter Your Pin : ");
		pin=sc.nextInt();
		while(true) {
			if(pin==1234)
			{
				System.out.println("Your Password Is Corect You can continue Your payment..");
			}
			else
			{
				System.out.println("Sorry Your Password is wrong...");
			}
			System.out.println("You have a successfull payment");
			System.out.println("Thank You For Payment...");
			break;
		}
	}
	public static void main(String[] args) {
		Lab10_3 l1=new Lab10_3();
		l1.name();
		l1.amount();
	}
}
