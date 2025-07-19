package Test.first;
class F1
{
	final int a;
	public F1()
	{
		a=10;
	}
}
class F2 extends F1
{
	void show()
	{
		System.out.println("Hello");
	}
}
public class FinalKeyWord {
	public static void main(String[] args) {
		F2 f=new F2();
		f.show();
	}

}
