package assignment;

abstract class cal1
{
	void type1()
	{
		System.out.println("Addition");
	}
	abstract void type2();
}
class cal2 extends cal1
{
	void type2()
	{
		System.out.println("Subtraction");
	}
}

public class Lab10_1 {

	public static void main(String[] args) {
		cal2 c1=new cal2();
		c1.type1();
		c1.type2();
	}
}
