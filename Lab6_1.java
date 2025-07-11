package assignment;

import java.util.Scanner;
class A1
{
	int i,j,n,k;
	void geta()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
class A2 extends A1
{
	int i,j,k,n;
	void getb()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=sc.nextInt();
		for(i=n;i>=0;i--)
		{
			for(j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
public class Lab6_1 {
public static void main(String[] args) {
	A2 a=new A2();
	a.geta();
	a.getb();
}
}
