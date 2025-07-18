package Test.first;

class Bax
{
	double width,heigth,depth;
	Bax(double w,double h,double d)
	{
		System.out.println("Parameterized construcor called");
		width=w;
		heigth=h;
		depth=d;
	}
	Bax(Bax b)
	{
		width=b.width;
		heigth=b.heigth;
		depth=b.depth;
	}
	void volume()
	{
		System.out.println("Volume : "+(width*heigth*depth));
	}
	
}

public class Constructor2 {
	public static void main(String[] args) {
	Bax b1=new Bax(2,5,3);
	b1.volume();
	
	Bax b2=new Bax(b1);
	b2.volume();
	}
}
