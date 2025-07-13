package assignment;

import java.util.Scanner;

class StudentInfo1
{
	StudentInfo1()
	{
		int rno,j,c,cpp,t,p;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll Number : ");
		rno=sc.nextInt();
		System.out.println("Enter Student Name : ");
		name=sc.next();
		System.out.println("Enter Java Marks : ");
		j=sc.nextInt();
		System.out.println("Enter C++ Marks : ");
		cpp=sc.nextInt();
		System.out.println("Enter C Marks : ");
		c=sc.nextInt();
		t=j+cpp+c;
		p=t/3;
		System.out.println("Total Marks : "+t);
		System.out.println("Percentage : "+p);
		System.out.println("\nStudent Information :\n");
		System.out.println("Student Roll Number : "+rno);
		System.out.println("Student name : "+name);
		System.out.println("Total : "+t);
		System.out.println("Prcentage : "+p);
	}
}
class StudentInfo2 extends StudentInfo1
{
	StudentInfo2()
	{
		int a,b,ans,choice;
		System.out.println("*******************************************************");
		Scanner scc=new Scanner(System.in);
		System.out.print("Enter value : ");
		a=scc.nextInt();
		System.out.println("*******************************************************");
		System.out.print("Enter value : ");
		b=scc.nextInt();
		System.out.println("*******************************************************");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Module");
		System.out.println("*******************************************************");
		System.out.print("Enter your choice : ");
		choice=scc.nextInt();
		System.out.println("*******************************************************");
		switch(choice)
		{
			case 1:
				ans=a+b;
				System.out.println("Addition : "+ans);
				break;
			case 2:
				ans=a-b;
				System.out.println("Subtraction : "+ans);
			case 3:
				ans=a*b;
				System.out.println("Multiplication : "+ans);
				break;
			case 4:
				ans=a/b;
				System.out.println("Division : "+ans);
			case 5:
				ans=a+b;
				System.out.println("Module : "+ans);
				break;
			default:
				System.out.println("Invalid choice");
			 	break;
		}
		System.out.println("*******************************************************");
	}
}
public class Lab9_2 {

	public static void main(String[] args) {
		StudentInfo2 s1=new StudentInfo2();
	}
}
