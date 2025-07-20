package Test.first;

import java.util.Scanner;

class Aaa
{
	int a;
	void geta()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
	}
	void puta()
	{
		System.out.println("A : "+a);
	}
}
class Bbb extends Aaa
{
	int b;
	void getb()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void putb()
	{
		System.out.println("B : "+b);
	}
}
class Ccc extends Aaa
{
	int c;
	void getc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter C : ");
		c=sc.nextInt();
	}
	void putc()
	{
		System.out.println("C : "+c);
	}
}
class Ddd extends Aaa
{
	int d;
	void getd()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter d : ");
		d=sc.nextInt();
	}
	void putd()
	{
		System.out.println("D : "+d);
	}
}
public class InheriHierarcy {
	public static void main(String[] args) {
		
	Bbb b1=new Bbb();
	Ccc c1=new Ccc();
	Ddd d1=new Ddd();
	
	b1.geta();
	b1.getb();
	c1.getc();
	d1.getd();
	
	b1.puta();
	b1.putb();
	c1.putc();
	d1.putd();
	
	}
}
