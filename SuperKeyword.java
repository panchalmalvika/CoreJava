package Test.first;

class Animal
{
	String type="Animal";
}
class Cat extends Animal
{
	String type="Meow...Meow";
	
	void PrintTypes()
	{
		System.out.println("Subclass Type : "+type);
		System.out.println("Superclass Type : "+type);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.PrintTypes();
	}
}
