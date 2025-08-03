class cons
{
	int x,y;
	a()    //default Constructor
	{
		System.out.println("Heeloo");
	}
	 a(int p,int q)//parametrized Constructor
	{
		System.out.println("Parametrized constructor");
		
		x=p;
		y=q;
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	a(a t1)  //Copy Constructor
	{
		System.out.println("copy constructor");
		System.out.println("X : "+t1.x);
		System.out.println("Y : "+t1.y);
	}
}
class abc
{
	public static void main(String a1[])
	{
		a s1 = new a(); 	//Call default Constructor
		a s2=new a(23,56);  //Call parametrized Constructor
		a s3=new a(s2);     //Call copy Constructor
	}
}

