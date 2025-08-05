package Test.first;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		int a[]=new int[3];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array value : ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Element : ");
			a[i]=sc.nextInt();
		}
		System.out.println("\nArray element are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		}
		System.out.println("\nAssending order");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] : "+a[i]);
		}
		System.out.println("\nDesending order");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] : "+a[i]);
		}
	}
}
