package Test.first;

class Book
{
	Book()
	{
		System.out.println("Book info");
	}
	Book(String t)
	{
		this();
		System.out.println("Title : "+t);
	}
	Book(String t,String a)
	{
		this();
		System.out.println("Title : "+t+"\nAuthor : "+a);
	}
}
public class Assignment11 {
public static void main(String[] args) {
	Book b=new Book("Bhagwat Gita","Bhaktivedanta Swami Prabhupada");
}
}
