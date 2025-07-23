package Test.first;

import java.util.Scanner;

public class UsInString {
	public static void main(String[] args) {
		String n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		n1=sc.next();
		System.out.print("Enter Second String : ");
		n2=sc.next();
		System.out.println("\nString Length : "+n1.length());
		System.out.println("\nString 2 Length : "+n2.length());
		n3=n1+n2;
		System.out.println("\nConcate String : "+n3);
	}
}
