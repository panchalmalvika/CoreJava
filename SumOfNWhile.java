package Test.first;

import java.util.Scanner;

public class SumOfNWhile {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a value : ");
		n=c.nextInt();
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
		System.out.println("Sum : "+sum);
	}
}
