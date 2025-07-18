package Test.first;
class A1
{
	A1()
	{
		System.out.println("A1 default constructor");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B1 default constructor");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("C1 default constructor");
	}
}
public class ConsChaing {
	public static void main(String[] args) {
		C1 c=new C1();
	}
}
