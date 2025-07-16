package com.tread;
class NewThread2 implements Runnable
{
	Thread t;
	String tname;
	public NewThread2(String tname)
	{
		this.tname=tname;
		t=new Thread(this,tname);
		t.start();
	}
	public void run() {
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}
}
public class ThreadDemo3 {
public static void main(String[] args) {
	new NewThread2("One");
	new NewThread2("Two");
	new NewThread2("Three");
	Thread t=Thread.currentThread();
	System.out.println(t);
	t.setName("My Thread");
	t.setPriority(8);
	System.out.println(t);
	try {
		for(int i=0;i<5;i++)
		{
			System.out.println(t+" : "+i);
			Thread.sleep(1000);
		}
	}catch (Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("Child Thread Exiting");
}

}
