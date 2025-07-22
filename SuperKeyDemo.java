package Test.first;

class Parent
{
	int x=10;
}
class Child extends Parent
{
	int x=20;
	void show()
	{
		System.out.println("X : "+super.x);
	}
}
public class SuperKeyDemo {

	public static void main(String[] args) {
		Child c1=new Child();
		c1.show();
	}
}
