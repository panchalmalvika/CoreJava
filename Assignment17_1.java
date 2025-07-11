package assignment;
class CalValue
{
	void geta(int a)
	{
		System.out.println("Square : "+(a*a));
	}
	void getb(int a,int b)
	{
		System.out.println("Area calculate : "+(a*b));
	}
	void getc(int a)
	{
		System.out.println("Radius : "+(3.14*a*a));
	}
	void getd(double a,double b)
	{
		System.out.println("Triangle area : "+(a*b));
	}
}
public class Assignment17_1 {
	public static void main(String[] args) {
		CalValue c1=new CalValue();
		c1.geta(10);
		c1.getb(10,20);
		c1.getc(5);
		c1.getd(55.55,55.55);
	}
}
