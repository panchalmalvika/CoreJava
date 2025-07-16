package com.tread;

class Callback
{
	public void call(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class Caller implements Runnable
{
	Thread t;
	String msg;
	Callback c;
	public Caller(String msg,Callback c)
	{
		this.msg=msg;
		this.c=c;
		t=new Thread(this);
		t.start();
	}
	public void run() {
		synchronized (c) {
			c.call(msg);
		}
	}
}
public class ThreadSyncronization {
	public static void main(String[] args) {
		Callback c=new Callback();
		Caller c1=new Caller("hello",c);
		Caller c2=new Caller("Welcome",c);
		Caller c3=new Caller("How are you",c);
	}
}
