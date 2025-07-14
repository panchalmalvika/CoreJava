package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
	{
		int rno;
		String name;
		double per;
		public Student(int rno, String name, double per) {
			this.rno = rno;
			this.name = name;
			this.per = per;
		}
		public String toString() {
			return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
		}
	}
	public class Lab14_3{
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			Student s1=new Student(1,"Malvika",99);
			FileOutputStream fos=new FileOutputStream("Serialization");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			
			FileInputStream fis=new FileInputStream("Serialization");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student s2=(Student) ois.readObject();
			System.out.println(s2);
			ois.close();
		}
}
