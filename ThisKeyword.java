package Test.first;
class Student
{
	int rno;
	String sname;
	public Student()
	{
		System.out.println("Default constructor called");
	}
	public Student(int rno,String sname)
	{
		this();
		System.out.println("Parameterized constructor called");
		this.rno=rno;
		this.sname=sname;
	}
	void show()
	{
		System.out.println("Roll No : "+rno);
		System.out.println("Student Name : "+sname);
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		Student s1=new Student(1,"Malvika");
		s1.show();
	}
}
