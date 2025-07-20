package Test.first;

import java.util.Scanner;

public class ledderif {
	public static void main(String[] args) {
		int rno,j,cpp,c,t;
		double p;
		String sname;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		sname=sc.next();
		System.out.print("Enter Student Roll No. : ");
		rno=sc.nextInt();
		System.out.print("Java Marks : ");
		j=sc.nextInt();
		System.out.print("C Marks : ");
		c=sc.nextInt();
		System.out.print("C++ Marks : ");
		cpp=sc.nextInt();
		
		t=j+c+cpp;
		p=t/3;
		System.out.println("\n");
		System.out.println("Student Name : "+sname);
		System.out.println("Student Roll No. : "+rno);
		System.out.println("Total : "+t);
		System.out.println("Percentage : "+p);
		
		if(p>=80)
		{
			System.out.println("Distinction");
		}
		else if(p>=70)
		{
			System.out.println("First Class");
		}
		else if(p>=60)
		{
			System.out.println("Second Class");
		}
		else if(p>=50)
		{
			System.out.println("Pass Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
