package com.collection;

public class GenericDemo {

	public static <E> void printArray(E[] inputArray)
	{
		for(E e:inputArray)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer intArray[]= {1,2,3,4,5};
		Double doubleArray[]= {1.1,2.2,3.3,4.4,5.5};
		Character charArray[]= {'J','A','G','R','A','T'};
		String stringArray[]= {"Jagrat","Malvika"};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		printArray(stringArray);
		
	}
	
	
		
	}
