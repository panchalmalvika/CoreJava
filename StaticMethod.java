package Test.first;

public class StaticMethod {
	static int a=10;
	static int b;
	{
		System.out.println("Block 1");
	}
	static void math(int x)
	{
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	static
	{
		System.out.println("Static block intialized:");
		b=a*4;
	}
	//simplile block are first called in output then default constructor called
	public StaticMethod()
	{
		System.out.println("default constructor called");
	}
	{
		System.out.println("block 2");
	}
	public static void main(String[] args) {
		System.out.println("main method called");
		math(12);
		StaticMethod s=new StaticMethod();
	}
}
