package Test.first;
import java.util.Scanner;

class Aa
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
class Bb extends Aa
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
class C extends Bb
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
public class InheriMultilevel {
	public static void main(String[] args) {
		C b1=new C();
		b1.geta();
		b1.getb();
		b1.getc();
		b1.puta();
		b1.putb();
		b1.putc();
	}
}
