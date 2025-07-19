package Test.first;

import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner c=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=c.nextInt();
		do
		{
			sum=sum+n;
			n--;
		}while(n>0);
		System.out.println("Sum : "+sum);
	}
}

