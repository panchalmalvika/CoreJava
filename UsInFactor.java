package Test.first;

import java.util.Scanner;

public class UsInFactor {
	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value : ");
		num=sc.nextInt();
		System.out.println("Factor of "+num+" are : ");
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
