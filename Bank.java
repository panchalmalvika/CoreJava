package com.exception;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		double amount;
		int choice;
		System.out.println("*********************************************************************************************************************************************");
		CheckingAccount c=new CheckingAccount(111,"Jagrat",10000);
		System.out.println("*********************************************************************************************************************************************");
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("*********************************************************************************************************************************************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("*********************************************************************************************************************************************");
			System.out.print("Enter Your Choice : ");
			choice=sc.nextInt();
			System.out.println("*********************************************************************************************************************************************");
			 
			if(choice==1)
			{
				System.out.print("Enter Deposit Amount : ");
				amount=sc.nextDouble();
				c.deposit(amount);
				System.out.println("*********************************************************************************************************************************************");
			}
			else if(choice==2)
			{
				System.out.print("Enter Withdrawl Amount : ");
				amount=sc.nextDouble();
				try {
					c.withdraw(amount);
					System.out.println("*********************************************************************************************************************************************");
				}catch(InSufficientFund i) {
					System.out.println("Sorry You Need Another "+i.getAmount()+"Rs. To Withdraw");
					System.out.println("*********************************************************************************************************************************************");
				}
			}
			else if(choice==3)
			{
				c.checkBalance();
				System.out.println("*********************************************************************************************************************************************");
			}
			else if(choice==4)
			{
				System.out.println("Thank You For Using Our Service");
				System.out.println("*********************************************************************************************************************************************");
				break;
			}
			else
			{
				System.out.println("Invalid Choice. Please Try Again..");
				System.out.println("*********************************************************************************************************************************************");
			}
		}
		
	}
}
