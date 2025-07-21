package Test.first;
class A11
{
	A11()
	{
		System.out.println("A1 default constructor");
	}
	void show()
	{
		System.out.println("A1 show");
	}
}
class B11 extends A11
{
	B11()
	{
		System.out.println("B1 default constructor");
	}
	void show()
	{
		super.show();
		System.out.println("B1 show");
	}
}
class C11 extends B11
{
	C11()
	{
		System.out.println("C1 default constructor");
	}
	void show()
	{
		super.show();
		System.out.println("C1 show");
	}
}
public class RunTimePoly {
	public static void main(String[] args) {
		C11 c=new C11();
		c.show();
	}
}
