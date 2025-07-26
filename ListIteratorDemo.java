package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		{
			al.add(1);
			al.add("Malvika Panchal");
			al.add(true);
			al.add(90);
			al.add(89);
			al.add(97);
			al.add("Total");
			al.add(250);
			al.add("Finish");
			System.out.println(al);
		}
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(al.get(0));
		System.out.println(al.indexOf(10));
		System.out.println(al.lastIndexOf(10));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.set(5, 200));
		System.out.println(al);
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			litr.set(litr.next()+"Tops");
		}
		System.out.println("----List Iterator---");
		litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}
}