package assignment;

import java.util.Scanner;

public class Lab8_1 {

	public static void main(String[] args) {
		int a[][]=new int [2][2];
		int b[][]=new int [2][2];
		int c[][]=new int [2][2];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two dimension element A : ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("Enter Row "+i+" & Column "+j+" : ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nPrint All Values :");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.println("A["+i+"]["+j+"] = "+a[i][j]);
			}
		}
		System.out.println("\nEnter Two dimension element B : ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("Enter Row "+i+" & Column "+j+" : ");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nPrint All Values :");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.println("B["+i+"]["+j+"] = "+b[i][j]);
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("\nAddition Of Two Dimension :\n");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("\t"+c[i][j]);
			}
			System.out.println();
		}
	}
}
