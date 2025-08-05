package Test.first;

class Thre
{
	public void ShowMe(String msg)
	{
		System.out.print(msg);
		try
		{
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Thro implements Runnable
{
	Thread t;
	String msg;
	Thre c;
	public Thro(String msg,Thre c)
	{
		this.msg=msg;
		this.c=c;
		t=new Thread(this);
		t.start();
	}
	public void run() {
		synchronized (t) {
			c.ShowMe(msg);
		}
	}
}
public class DemoThread
 {
	public static void main(String[] args) {
		Thre t=new Thre();
		Thro t1=new Thro("Hii\n",t);
		Thro t2=new Thro("I Am Malvika\n",t);
	}
 }