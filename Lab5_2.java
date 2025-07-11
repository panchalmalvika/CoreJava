package assignment;

public class Lab5_2 {
		int t,p;
		void student()
		{
			System.out.println("*********************************************");
			System.out.println("\t\tStudent Information :");
			System.out.println("\n*********************************************");
		}
		void student(int rno,String name)
		{
			System.out.println("\t\tStudent Roll Number : "+rno);
			System.out.println("\t\tStudent Name : "+name);
			System.out.println("\n*********************************************");
		}
		void  student(int j,int cpp,int c)
		{
			System.out.println("\t\tEnter Java Marks : "+j);
			System.out.println("\t\tEnter C++ Marks : "+cpp);
			System.out.println("\t\tEnter C Marks : "+c);
			System.out.println("\n*********************************************");
		}
		void student(int rno,String name,int j,int cpp,int c)
		{
			System.out.println("\t\tName :"+name);
			System.out.println("\t\tRoll Number : "+rno);
			System.out.println("\t\tJava Marks : "+j);
			System.out.println("\t\tC++ Marks : "+cpp);
			System.out.println("\t\tC Marks : "+c);
			t=j+cpp+c;
			System.out.println("\n*********************************************");
			System.out.println("\t\tTotal Marks : "+t);
			p=t/3;
			System.out.println("\t\tPercentage : "+p);
			System.out.println("\n*********************************************");
			System.out.println();
		}
		public static void main(String[] args) {
			Lab5_2 l1=new Lab5_2();
			l1.student();
			l1.student(001,"Malvika");
			l1.student(90,99,98);
			l1.student();
			l1.student(001,"Malvika",90,99,98);
		}
}
