package Test.first;

class Ap
{
	void start()
	{
		System.out.println("A is called");
	}
}
class Bp extends Ap
{
	void start()
	{
		super.start();
		System.out.println("B is called");
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		Bp a1=new Bp();
		a1.start();
	}
}
