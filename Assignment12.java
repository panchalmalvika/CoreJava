package Test.first;

class Vehical
{
	Vehical(String m)
	{
		System.out.println("Vehical Model  : "+m);
	}
}
class Car extends Vehical
{
	String model;
	Car()
	{
		this("Car","sqourpio");
	}
	Car(String m,String v)
	{
		super(v);
		System.out.println("Car Model : "+m);
	}
}
public class Assignment12 {
	public static void main(String[] args) {
		Car c=new Car();
	}
}
