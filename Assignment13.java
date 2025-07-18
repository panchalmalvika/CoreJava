package Test.first;

class Student1
{
	int rno;
	String name;
	public Student1()
	{
		System.out.println("Hello");
	}
	public Student1(int rno)
	{
		this();
	}
	public Student1(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
		System.out.println("Roll Number : "+rno+" \nName : "+name);
	}
}
public class Assignment13 {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1(11);
		Student1 s3=new Student1(1,"Malvika");
	}
}
