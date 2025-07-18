package Test.first;

public class CompileTimePoly {

	void test()
	{
		System.out.println("Test with no argument");
	}
	void test(int a)
	{
		System.out.println("Test with one argument");
	}
	void test(int a,int b)
	{
		System.out.println("Test with two argument");
	}
	public static void main(String[] args) {
		CompileTimePoly c=new CompileTimePoly();
		c.test(10);
		c.test(10,20);
		c.test();
	}
}
