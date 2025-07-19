package Test.first;

import java.util.Scanner;

public class Example
{
	public static void main(String[] args) {
		String name;
		int choise,order = 0,quantity,total = 0,yes=1,no=0,total1=0;
		System.out.println("\n********************************************************* WELCOME TO FAST FOOD CENTER ****************************************************************");
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\t\t\t\t\t\t\t   Please Enter Your Name : ");
		name=sc.next();
		System.out.println("\n\t\t\t\t\t\t\t\tHello "+name);
		System.out.println("\n\t\t\t\t\t\t\tWhat would you like to order ?");
		System.out.println("\n*********************************************************************** MENU *****************************************************************");
		System.out.println("\n\t\t\t\t\t\t\t\t1. Dosa");
		System.out.println("\n\t\t\t\t\t\t\t\t2. Samosa");
		System.out.println("\n\t\t\t\t\t\t\t\t3. Burger");
		System.out.println("\n\t\t\t\t\t\t\t\t4. Pizza");
		System.out.println("\n\t\t\t\t\t\t\t\t5. Vada Pav");
		System.out.println("\n\t\t\t\t\t\t\t\t6. Pani Puri");
		System.out.println("\n**********************************************************************************************************************************************");
		System.out.print("\n\t\t\t\t\t\t\tPlease Enter Your Choise : ");
		choise=sc.nextInt();
		if(choise==1)
		{
			System.out.println("\n\t\t\t\t\t\t1. Cheese Dosa\t\tPrize = 150 Rs./Psc.");
			System.out.println("\n\t\t\t\t\t\t2. Masala Dosa\t\tPrize = 120 Rs./Psc.");
			System.out.println("\n\t\t\t\t\t\t3. Maisur Dosa\t\tPrize = 130 Rs./Psc.");
			System.out.println("\n\t\t\t\t\t\t4. Chula Dosa\t\tPrize = 200 Rs./Psc.");
			System.out.println("\n**********************************************************************************************************************************************");
			System.out.print("\n\t\t\t\t\t\tEnter Which Dosa Do You like to Order ?  ");
			order=sc.nextInt();
			if(order==1)
			{
				System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
				quantity=sc.nextInt();
				total=quantity*150;
			}
			if(order==2)
			{
				System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
				quantity=sc.nextInt();
				total=quantity*120;
			}
			if(order==3)
			{
				System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
				quantity=sc.nextInt();
				total=quantity*130;
			}
			if(order==4)
			{
				System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
				quantity=sc.nextInt();
				total=quantity*200;
			}
		}
		else if(choise==2)
			{
				System.out.println("\n\t\t\t\t\t\t1. Cheese Samosa\t\tPrize = 50 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t2. Normal Samosa\t\tPrize = 30 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t3. Chinese Samosa\t\tPrize = 50 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t4. Panir Samosa\t\t\tPrize = 40 Rs./Psc.");
				System.out.println("\n**********************************************************************************************************************************************");
				System.out.print("\n\t\t\t\t\t\tEnter Which Samosa Do You like to Order ?  ");
				order=sc.nextInt();
				if(order==1)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total=quantity*50;
				}
				if(order==2)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total=quantity*30;
				}
				if(order==3)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total=quantity*50;
				}
				if(order==4)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total=quantity*40;
				}
			}
			else if(choise==3)
				{
					System.out.println("\n\t\t\t\t\t\t1. Panir Burger\t\t\tPrize = 150 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t2. Alu Matar Burger\t\tPrize = 120 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t3. Kito Burger\t\t\tPrize = 100 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t4. Cheese Burger\t\tPrize = 200 Rs./Psc.");
					System.out.println("\n**********************************************************************************************************************************************");
					System.out.print("\n\t\t\t\t\t\tEnter Which Burger Do You like to Order ?  ");
					order=sc.nextInt();
					if(order==1)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total=quantity*150;
					}
					if(order==2)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total=quantity*120;
					}
					if(order==3)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total=quantity*100;
					}
					if(order==4)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total=quantity*200;
					}
				}
			else if(choise==4)
					{
						System.out.println("\n\t\t\t\t\t\t1. Margrita Pizza\t\tPrize = 200 Rs./Psc.");
						System.out.println("\n\t\t\t\t\t\t2. 7 Drop Pizza \t\tPrize = 250 Rs./Psc.");
						System.out.println("\n\t\t\t\t\t\t3. Garlic Pizza\t\tPrize = 120 Rs./Psc.");
						System.out.println("\n\t\t\t\t\t\t4. Panir Pizza\t\tPrize = 200 Rs./Psc.");
						System.out.println("\n**********************************************************************************************************************************************");
						System.out.print("\n\t\t\t\t\t\tEnter Which Pizza Do You like to Order ?  ");
						order=sc.nextInt();
						if(order==1)
						{
							System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
							quantity=sc.nextInt();
							total=quantity*200;
						}
						if(order==2)
						{
							System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
							quantity=sc.nextInt();
							total=quantity*250;
						}
						if(order==3)
						{
							System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
							quantity=sc.nextInt();
							total=quantity*120;
						}
						if(order==4)
						{
							System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
							quantity=sc.nextInt();
							total=quantity*200;
						}
					}
			else if(choise==5)
			{
			System.out.println("\n\t\t\t\t\t\t1. Cheese Vada Pav\t\tPrize = 80 Rs./Psc.");
			System.out.println("\n\t\t\t\t\t\t2. Normal Vada Pav\t\tPrize = 40 Rs./Psc.");
			System.out.println("\n**********************************************************************************************************************************************");
			System.out.print("\n\t\t\t\t\t\tEnter Which Vada pav Do You like to Order ?  ");
			order=sc.nextInt();
			if(order==1)
			{
				System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
				quantity=sc.nextInt();
				total=quantity*80;
			}
			if(order==2)
			{
				System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
				quantity=sc.nextInt();
				total=quantity*40;
			}
			}	
			else if(choise==6)
			{
				System.out.println("\n\t\t\t\t\t\t1. Normal Pani Puri\t\tPrize = 20 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t2. Choclate Pani Puri\t\tPrize = 50 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t3. Bhel Puri\t\t\tPrize = 40 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t4. Dahi Puri\t\t\tPrize = 40 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t5. Chatani Puri\t\t\tPrize = 50 Rs./Pcs.");
				System.out.println("\n**********************************************************************************************************************************************");
				System.out.print("\n\t\t\t\t\t\tEnter Which Pani Puri Do You like to Order ?  ");
				order=sc.nextInt();
				if(order==1)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total=quantity*20;
				}
				if(order==2)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total=quantity*50;
				}
				if(order==3)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total=quantity*40;
				}
				if(order==4)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total=quantity*40;
				}
				if(order==5)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total=quantity*50;
				}
			}
			
		System.out.println("\n\t\t\t\t\t\t\tTotal : "+total);
		System.out.println("\n\t\t***************************************************************************************************************************************************************************");
		System.out.print("\n\t\t\t\t\t\t\tDo you want More Order ?");
		System.out.print("\n\t\t\t\t\t\tIf Yes the select 1 or no then select 0 : ");
		yes=sc.nextInt();
		if(yes==1)
		{
			System.out.println("\n*********************************************************************** MENU *****************************************************************");
			System.out.println("\n\t\t\t\t\t\t\t\t1. Dosa");
			System.out.println("\n\t\t\t\t\t\t\t\t2. Samosa");
			System.out.println("\n\t\t\t\t\t\t\t\t3. Burger");
			System.out.println("\n\t\t\t\t\t\t\t\t4. Pizza");
			System.out.println("\n\t\t\t\t\t\t\t\t5. Vada Pav");
			System.out.println("\n\t\t\t\t\t\t\t\t6. Pani Puri");
			System.out.println("\n**********************************************************************************************************************************************");
			System.out.print("\n\t\t\t\t\t\t\tPlease Enter Your Choise : ");
			choise=sc.nextInt();
			if(choise==1)
			{
				System.out.println("\n\t\t\t\t\t\t1. Cheese Dosa\t\tPrize = 150 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t2. Masala Dosa\t\tPrize = 120 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t3. Maisur Dosa\t\tPrize = 130 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t4. Chula Dosa\t\tPrize = 200 Rs./Psc.");
				System.out.println("\n**********************************************************************************************************************************************");
				System.out.print("\n\t\t\t\t\t\tEnter Which Dosa Do You like to Order ?  ");
				order=sc.nextInt();
				if(order==1)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total1=total+quantity*150;
				}
				if(order==2)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total1=total+quantity*120;
				}
				if(order==3)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total1=total+quantity*130;
				}
				if(order==4)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total1=total+quantity*200;
				}
			}
			else if(choise==2)
				{
					System.out.println("\n\t\t\t\t\t\t1. Cheese Samosa\t\tPrize = 50 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t2. Normal Samosa\t\tPrize = 30 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t3. Chinese Samosa\t\tPrize = 50 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t4. Panir Samosa\t\t\tPrize = 40 Rs./Psc.");
					System.out.println("\n**********************************************************************************************************************************************");
					System.out.print("\n\t\t\t\t\t\tEnter Which Samosa Do You like to Order ?  ");
					order=sc.nextInt();
					if(order==1)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total1=total+quantity*50;
					}
					if(order==2)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total1=total+quantity*30;
					}
					if(order==3)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total1=total+quantity*50;
					}
					if(order==4)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total1=total+quantity*40;
					}
				}
				else if(choise==3)
					{
						System.out.println("\n\t\t\t\t\t\t1. Panir Burger\t\tPrize = 150 Rs./Psc.");
						System.out.println("\n\t\t\t\t\t\t2. Alu Matar Burger\t\tPrize = 120 Rs./Psc.");
						System.out.println("\n\t\t\t\t\t\t3. Kito Burger\t\tPrize = 100 Rs./Psc.");
						System.out.println("\n\t\t\t\t\t\t4. Cheese Burger\t\tPrize = 200 Rs./Psc.");
						System.out.println("\n**********************************************************************************************************************************************");
						System.out.print("\n\t\t\t\t\t\tEnter Which Burger Do You like to Order ?  ");
						order=sc.nextInt();
						if(order==1)
						{
							System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
							quantity=sc.nextInt();
							total1=total+quantity*150;
						}
						if(order==2)
						{
							System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
							quantity=sc.nextInt();
							total1=total+quantity*120;
						}
						if(order==3)
						{
							System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
							quantity=sc.nextInt();
							total1=total+quantity*100;
						}
						if(order==4)
						{
							System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
							quantity=sc.nextInt();
							total1=total+quantity*200;
						}
					}
				else if(choise==4)
						{
							System.out.println("\n\t\t\t\t\t\t1. Margrita Pizza\t\tPrize = 200 Rs./Psc.");
							System.out.println("\n\t\t\t\t\t\t2. 7 Drop Pizza \t\tPrize = 250 Rs./Psc.");
							System.out.println("\n\t\t\t\t\t\t3. Garlic Pizza\t\tPrize = 120 Rs./Psc.");
							System.out.println("\n\t\t\t\t\t\t4. Panir Pizza\t\tPrize = 200 Rs./Psc.");
							System.out.println("\n**********************************************************************************************************************************************");
							System.out.print("\n\t\t\t\t\t\tEnter Which Pizza Do You like to Order ?  ");
							order=sc.nextInt();
							if(order==1)
							{
								System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
								quantity=sc.nextInt();
								total1=total+quantity*200;
							}
							if(order==2)
							{
								System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
								quantity=sc.nextInt();
								total1=total+quantity*250;
							}
							if(order==3)
							{
								System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
								quantity=sc.nextInt();
								total1=total+quantity*120;
							}
							if(order==4)
							{
								System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
								quantity=sc.nextInt();
								total1=total+quantity*200;
							}
						}
				else if(choise==5)
				{
				System.out.println("\n\t\t\t\t\t\t1. Cheese Vada Pav\t\tPrize = 80 Rs./Psc.");
				System.out.println("\n\t\t\t\t\t\t2. Normal Vada Pav\t\tPrize = 40 Rs./Psc.");
				System.out.println("\n**********************************************************************************************************************************************");
				System.out.print("\n\t\t\t\t\t\tEnter Which Vada pav Do You like to Order ?  ");
				order=sc.nextInt();
				if(order==1)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total1=total+quantity*80;
				}
				if(order==2)
				{
					System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
					quantity=sc.nextInt();
					total1=total+quantity*40;
				}
				}	
				else if(choise==6)
				{
					System.out.println("\n\t\t\t\t\t\t1. Normal Pani Puri\t\tPrize = 20 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t2. Choclate Pani Puri\t\tPrize = 50 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t3. Bhel Puri\t\t\tPrize = 40 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t4. Dahi Puri\t\t\tPrize = 40 Rs./Psc.");
					System.out.println("\n\t\t\t\t\t\t5. Chatani Puri\t\t\tPrize = 50 Rs./Pcs.");
					System.out.println("\n**********************************************************************************************************************************************");
					System.out.print("\n\t\t\t\t\t\tEnter Which Pani Puri Do You like to Order ?  ");
					order=sc.nextInt();
					if(order==1)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total1=total+quantity*20;
					}
					if(order==2)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total1=total+quantity*50;
					}
					if(order==3)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total1=total+quantity*40;
					}
					if(order==4)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total1=total+quantity*40;
					}
					if(order==5)
					{
						System.out.print("\n\t\t\t\t\t\t\tEnter Quantity : ");
						quantity=sc.nextInt();
						total1=total+quantity*50;
					}
				}
			System.out.println("\n\t\t***************************************************************************************************************************************************");
			System.out.println("\n\t\t\t\t\t\t\tTotal Amount is : "+total);
			System.out.println("\n\t\t*************************************************************************************************************************************************");
			System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
			System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..: "+total1+" Rs.");
			System.out.println("\n\t\t*************************************************************************************************************************************");
			
		}
		else if(no==0)
		{
				System.out.println("\n\t\t*************************************************************************************************************************************************");
				System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
				System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..: "+total+" Rs.");
		}
		else
		{
			System.out.println("\n\t\t***************************************************************************************************************************************************");
			System.out.println("\n\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
		}
		}
	}
