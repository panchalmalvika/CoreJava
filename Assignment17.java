package assignment;
class Cal
{
	public Cal(int a)
	{
		System.out.println("Square integer : "+(a*a));
	}
	public Cal(float b)
	{
		System.out.println("Square float : "+(b*b));
	}
	public Cal(double c)
	{
		System.out.println("Square Double : "+(c*c));
	}
	public Cal(String d)
	{
		System.out.println("Square String : "+(d+d));
	}
}
public class Assignment17 {
	public static void main(String[] args) {
		Cal c1=new Cal(10);
		Cal c2=new Cal(5.6);
		Cal c3=new Cal(566.64);
		Cal c4=new Cal("Malvika");
	}
}
