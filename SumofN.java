package Test.first;

import java.util.Scanner;

public class SumofN {
	public static void main(String[] args) {
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N : ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
	}
}
