package Test.first;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter I : ");
		i=sc.nextInt();
		while(i>0)
		{
			System.out.println("hello");
			i--;
		}
	}
}
