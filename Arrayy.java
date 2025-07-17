package Test.first;

import java.util.Scanner;

public class Arrayy {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array element");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Element : ");
			a[i]=sc.nextInt();
		}
		System.out.println("Array element are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		}
	}
}
