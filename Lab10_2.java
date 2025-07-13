package assignment;

interface AB
{
	void ab();
}
interface ABC
{
	void abc();
}
interface ABCD
{
	void abcd();
}
public class Lab10_2 {

	public void ab()
	{
		System.out.println("Mango");
	}
	public void abc()
	{
		System.out.println("Banana");
	}
	public void abcd()
	{
		System.out.println("Orange");
	}
	public static void main(String[] args) {
		Lab10_2 l1=new Lab10_2();
		l1.ab();
		l1.abc();
		l1.abcd();
	}
}
