package Test.first;

import java.util.Scanner;

public class pattern6 {
	public static void main(String[] args) {
		int n,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value : ");
		n=sc.nextInt();
		for(i=n;i>=0;i--)
		{
			for(j=0;j<n-i;j++)
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

