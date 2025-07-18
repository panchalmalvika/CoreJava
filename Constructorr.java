package Test.first;
class Box
{
	//default constructor
	double width,height,depth;
	Box()
	{
		System.out.println("Defaualt constructor called");
		width=3;
		height=4;
		depth=5;
	}
	void volume()
	{
		System.out.println("Volume : "+(width*height*depth));
	}
}
public class Constructorr {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume();
	}
}
