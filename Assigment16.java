package assignment;
class Addition
{
	void add(int a,int b)
	{
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("Addition of integer : "+(a+b));
	}
	void add(float a,float b)
	{
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("Addition of float : "+(a+b));
	}
	void add(double a,double b)
	{
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("Addition of double : "+(a+b));
	}
	void add(String a,String b)
	{
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("Addition of double : "+(a+b));
	}
}
public class Assigment16 {
	public static void main(String[] args) {
		Addition a1=new Addition();
		a1.add(10,20);
		a1.add(5.5,3.2);
		a1.add(5.55,6.66);
		a1.add("Malvika","Jagrat");
	}
}
