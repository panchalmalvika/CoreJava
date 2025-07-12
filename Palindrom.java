package assignment;

import java.util.Scanner;

//palindrome
public class Palindrom {

	public static void main(String[] args) {
		String a;
		String b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		a=sc.next();
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equals(b))
		{
			System.out.println("String Is Palindrome");
		}
		else
		{
			System.out.println("String Is Not Palindrome");
		}
	}
}
