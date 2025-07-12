package assignment;

import java.util.Scanner;

class A01
{
	void geta()
	{
		int rno;
		String name;
		int j,cpp,c,t;
		double p;
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************************************\n");
		System.out.print("Enter Student Roll Number : ");
		rno=sc.nextInt();
		System.out.print("Enter Student Name : ");
		name=sc.next();
		System.out.print("Enter Java Marks : ");
		j=sc.nextInt();
		System.out.print("Enter C Marks : ");
		c=sc.nextInt();
		System.out.print("Enter C++ Marks : ");
		cpp=sc.nextInt();
		System.out.println("\n*******************************************************\n");
		t=j+cpp+c;
		System.out.println("Total Marks : "+t);
		p=t/3;
		System.out.println("Percentage : "+p);
		System.out.println("\n*******************************************************\n");
	}
}
class A02 extends A01
{
	void getb()
	{
		int rno;
		String name;
		int j,cpp,c,t;
		double p;
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************************************\n");
		System.out.print("Enter Student Roll Number : ");
		rno=sc.nextInt();
		System.out.print("Enter Student Name : ");
		name=sc.next();
		System.out.print("Enter Java Marks : ");
		j=sc.nextInt();
		System.out.print("Enter C Marks : ");
		c=sc.nextInt();
		System.out.print("Enter C++ Marks : ");
		cpp=sc.nextInt();
		System.out.println("\n*******************************************************\n");
		t=j+cpp+c;
		System.out.println("Total Marks : "+t);
		p=t/3;
		System.out.println("Percentage : "+p);
		System.out.println("\n*******************************************************\n");
	}
}
public class Lab9_1 {
 public static void main(String[] args) {
	A02 a1=new A02();
	a1.geta();
	a1.getb();
	A02 a2=new A02();
	a2.geta();
	a2.getb();
}
}
