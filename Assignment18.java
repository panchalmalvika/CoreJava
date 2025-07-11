package assignment;

class StudentInfo
{
	void geta(String name)
	{
		System.out.println("Name : "+name);
	}
	void getb(int rno)
	{
		System.out.println("Roll Number : "+rno);
	}
	int t;
	float p;
	void getc(int j,int c,int cpp)
	{
		System.out.println("Java marks : "+j);
		System.out.println("C marks : "+c);
		System.out.println("C++ marks : "+cpp);
		t=j+c+cpp;
		p=t/3;
	}
	void getd()
	{
		
		System.out.println("Total : "+t);
		System.out.println("Percentage : "+p);
	}
}
public class Assignment18 {
	public static void main(String[] args) {
		StudentInfo s1=new StudentInfo();
		s1.geta("Ravika");
		s1.getb(1);
		s1.getc(90,80,79);
		s1.getd();
	}
}
