package assignment;
class Product
{
	int id,price;
	String name;
	public Product()
	{
		this(3,"ravika");
	}
	public Product(int id,String name)
	{
		this(id,name,4000);
	}
	public Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		System.out.println("Id : "+id+"\nName : "+name+"\nPrice : "+price);
	}
}
public class Assignment15 {
	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product(1,"malvika");
		Product p3=new Product(2,"jagrat",5000);
	}

}
