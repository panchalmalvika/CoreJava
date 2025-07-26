package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortEmpSalary  implements Comparator<Emp> {

	public int compare(Emp e1, Emp e2) {
		int value=1;
		if(e1.getSalary()>e2.getSalary())
		{
			value=-1;
		}
		else if(e1.getSalary()<e2.getSalary())
		{
			value=1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			value=0;
		}
		return value;
	}
	public static void main(String[] args) {
		ArrayList<Emp> List=new ArrayList<Emp>();
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("malvika");
		e1.setSalary(20000);
		List.add(e1);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("Jagrat");
		e2.setSalary(250000);
		List.add(e2);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("Ravika");
		e3.setSalary(30000);
		List.add(e3);
		
		Emp e4=new Emp();
		e4.setEid(4);
		e4.setEname("Aakruti");
		e4.setSalary(30000);
		List.add(e4);
		
		Emp e5=new Emp();
		e5.setEid(5);
		e5.setEname("Anika");
		e5.setSalary(15000);
		List.add(e5);
		
		Emp e6=new Emp();
		e6.setEid(6);
		e6.setEname("Radha");
		e6.setSalary(10000);
		List.add(e6);
		
		Collections.sort(List,new SortEmpSalary());
		for(Emp e:List)
		{
			System.out.println("EID : "+e.getEid()+"\nENAME : "+e.getEname()+"\nSALARY : "+e.getSalary());
		}
	}

	
}
