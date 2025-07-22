package Test.first;

import java.util.Scanner;

public class thireemaxcom {
		public static void main(String[] args) {
			int a,b,c;
			Scanner ab=new Scanner(System.in);
			System.out.print("Enter A : ");
			a=ab.nextInt();
			System.out.print("Enter B : ");
			b=ab.nextInt();
			System.out.print("Enter C : ");
			c=ab.nextInt();
			if(a>b)
			{
			    if(a>c)
			    {
			    		System.out.println("A is max");
			    }
			    else
			    {
			    		System.out.println("c is max");
			    }
			}
			else if(b>c)
			{
				System.out.println("b is max");
			}
			else
			{
				System.out.println("c is max");
			}
		}
}


