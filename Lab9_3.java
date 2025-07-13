package assignment;

class Animal
{
		String type="Wild";
}
class Cat extends Animal
{
	String type="Domestic Animal";
	void type1()
	{
		System.out.println("Sub Class : "+type);
		System.out.println("Super class : "+type);
	}
}
public class Lab9_3 {

	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.type1();
	}
}
