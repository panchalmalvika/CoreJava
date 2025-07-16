package com.tread;

class NewThread implements Runnable{
Thread t;
public NewThread()
{
	t=new Thread(this,"child Thread");
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
public class ThreadDemo1 {
public static void main(String[] args) {
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
