package Test.first;

import java.util.Scanner;

public class usinvalue {
		public static void main(String[] args) {
			int a,b,c;
			Scanner abc=new Scanner(System.in);
			System.out.print("Enter A : ");
			a=abc.nextInt();
			System.out.print("Enter B : ");
			b=abc.nextInt();
			c=a+b;
			System.out.println("Addition is : "+c);
			c=a-b;
			System.out.println("Subtraction is : "+c);
			c=a*b;
			System.out.println("Multiplication is : "+c);
			c=a%b;
			System.out.println("Module is : "+c);
			c=a/b;
			System.out.println("Division is : "+c);
		}
	}

