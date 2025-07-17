package Test.first;
abstract class Abs1
{
	void math1()
	{
		System.out.println("Math1");
	}
	abstract void math2();
}
class Abs2 extends Abs1
{
	void math2() {
		System.out.println("Math2 defined in Abs2");
	}
}
public class AbstractClass {
public static void main(String[] args) {
	Abs2 a1=new Abs2();
	a1.math1();
	a1.math2();
}
}
