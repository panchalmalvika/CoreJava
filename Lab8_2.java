package assignment;

import java.util.Scanner;
//palindrome code
public class Lab8_2 {

	public static void main(String[] args) {
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		a=sc.next();
		String b="";
		for(int i=0;i<a.length();i++)
		{
			b=a.charAt(i)+b;
		}
		if(a.equals(b))
		{
			System.out.println(a+" String is Palindrom");
		}
		else
		{
			System.out.println(a+" String is Not Palindrome");
		}
	}
}
