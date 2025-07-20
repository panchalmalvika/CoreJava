package Test.first;
interface Ifs1
{
	void math1();
}
interface Ifs2
{
	void math2();
}
public class InterfaceDemo implements Ifs1,Ifs2{
	public void math1()
	{
		System.out.println("Math1");
	}
	public void math2()
	{
		System.out.println("Math2");
	}
	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		i.math1();
		i.math2();
	}
	
}
