package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "Malvika");
		hm.put(102, "Jagrat");
		hm.put(103, "Kamini");
		hm.put(104, "Anisha");
		hm.put(105, "Amit");
		hm.put(106, "Harshad");
		hm.put(107, "Aakruti");
		System.out.println(hm);
		System.out.println(hm.get(101));
		System.out.println(hm.isEmpty());
		System.out.println(hm.entrySet());
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
