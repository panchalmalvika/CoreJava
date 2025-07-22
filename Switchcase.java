package Test.first;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		int a,b,ans,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************************************");
		System.out.print("Enter value : ");
		a=sc.nextInt();
		System.out.println("*******************************************************");
		System.out.print("Enter value : ");
		b=sc.nextInt();
		System.out.println("*******************************************************");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Module");
		System.out.println("*******************************************************");
		System.out.print("Enter your choice : ");
		choice=sc.nextInt();
		System.out.println("*******************************************************");
		switch(choice)
		{
			case 1:
				ans=a+b;
				System.out.println("Addition : "+ans);
				break;
			case 2:
				ans=a-b;
				System.out.println("Subtraction : "+ans);
			case 3:
				ans=a*b;
				System.out.println("Multiplication : "+ans);
				break;
			case 4:
				ans=a/b;
				System.out.println("Division : "+ans);
			case 5:
				ans=a+b;
				System.out.println("Module : "+ans);
				break;
			default:
				System.out.println("Invalid choice");
			 	break;
		}
		System.out.println("*******************************************************");
	}
}
