package com.tread;

public class TreadDemo {

	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		t.setPriority(8);
		System.out.println(t);
	}
}
