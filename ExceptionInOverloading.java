package com.exception;

import java.util.InputMismatchException;

class Ex1
{
	void show() throws ArithmeticException
	{
		
	}
}
class Ex2 extends Ex1
{
	/*void show() throws Exception
	{
		//not approved because Exception are parent class than the other class ex(InputmismatchException,etc) 
	}*/
}
class Ex3 extends Ex2
{
	void show() throws InputMismatchException
	{
		
	}
}
public class ExceptionInOverloading {

}
