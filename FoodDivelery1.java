package Test.first;

import java.util.Scanner;

public class FoodDivelery1 
{
	public static void main(String[] args) {
			int choise,quantity,total = 0;
			int yes=1,no=0;
			System.out.println("\t\t*************************************** WELCOME TO FOOD BILLING SYSTEM ***************************************");
			System.out.println("\n\t\t1.Dosa\t\tPrize = 180rs/pcs");
			System.out.println("\t\t2.Samosa\tPrize = 20rs/pcs");
			System.out.println("\t\t3.Idali Vada\tPrize = 50rs/pcs");
			System.out.println("\t\t4.Alu Parotha\tPrize = 100rs/pcs");
			System.out.println("\t\t5.Pav Bhaji\tPrize = 120rs/pcs");
			System.out.println("\t\t6.Pulav\t\tPrize = 80rs/pcs");
			System.out.println("\t\t7.Pani Puri\tPrize = 20rs/6pcs");
			System.out.println("\t\t8.Alu Puri\tPrize = 100rs/pcs");
			System.out.println("\t\t9.Exit..............");
			System.out.println("\n\t\t**************************************************************************************************************");
			Scanner s=new Scanner(System.in);
			System.out.print("\n\t\t\t\t\t\t\tChoose one Option....:");
			choise=s.nextInt();
			System.out.println("\n\t\t**************************************************************************************************************");
			while(true)
			{
				if(choise==1)
				{
					System.out.println("\n\t\t\t\t\t\t\tYour choise is : Dosa");
					System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
					quantity=s.nextInt();
					total=quantity*180;
					System.out.println("\n\t\t**************************************************************************************************************");
					System.out.print("\n\t\t\t\t\t\t\tDo you want More Order ?");
					System.out.print("\n\t\t\t\t\t\tIf Yes the select 1 or no then select 0:");
					yes=s.nextInt();
					if(yes==1)
					{
						System.out.println("\n\t\t**************************************************************************************************************");
						System.out.println("\n\t\t1.Dosa\t\tPrize = 180rs/pcs");
						System.out.println("\t\t2.Samosa\tPrize = 20rs/pcs");
						System.out.println("\t\t3.Idali Vada\tPrize = 50rs/pcs");
						System.out.println("\t\t4.Alu Parotha\tPrize = 100rs/pcs");
						System.out.println("\t\t5.Pav Bhaji\tPrize = 120rs/pcs");
						System.out.println("\t\t6.Pulav\t\tPrize = 80rs/pcs");
						System.out.println("\t\t7.Pani Puri\tPrize = 20rs/6pcs");
						System.out.println("\t\t8.Alu Puri\tPrize = 100rs/pcs");
						System.out.println("\n\t\t**************************************************************************************************************");
						System.out.println("\n\t\t\t\t\t\t\tAt a time One Choise is accept");
						System.out.print("\n\t\t\t\t\t\t\tChoose one Option....:");
						choise=s.nextInt();
						System.out.println("\n\t\t**************************************************************************************************************");
						if(choise==1)
						{
								System.out.println("\n\t\t\t\t\t\t\tYour choise is : Dosa");
								System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
								quantity=s.nextInt();
								total=quantity*180;
								System.out.println("\n\t\t**************************************************************************************************************");
						}
						else if(choise==2) 
						{
								System.out.println("\n\t\t\t\t\t\t\tYour choise is : Samosa");
								System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
								quantity=s.nextInt();
								total=quantity*20;
								System.out.println("\n\t\t**************************************************************************************************************");
						}
						else if(choise==3)
						{
								System.out.println("\n\t\t\t\t\t\t\tYour choise is : Idali Vada");
								System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
								quantity=s.nextInt();
								total=quantity*50;
								System.out.println("\n\t\t**************************************************************************************************************");
						}
						else if(choise==4)
						{
								System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Parotha");
								System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
								quantity=s.nextInt();
								total=quantity*100;
						}
						else if(choise==5)
						{
								System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pav Bhaji");
								System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
								quantity=s.nextInt();
								total=quantity*120;
								System.out.println("\n\t\t**************************************************************************************************************");
						}
						else if(choise==6)
						{
								System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pulav");
								System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
								quantity=s.nextInt();
								total=quantity*80;
								System.out.println("\n\t\t**************************************************************************************************************");
						}
						else if(choise==7)
						{
								System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pani Puri");
								System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
								quantity=s.nextInt();
								total=quantity*20;
								System.out.println("\n\t\t**************************************************************************************************************");
						}
						else if(choise==8)
						{
								System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Puri");
								System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
								quantity=s.nextInt();
								total=quantity*100;
								System.out.println("\n\t\t**************************************************************************************************************");
						}
						else if(choise==9)
						{
								System.out.println("\n\t\t\t\t\t\tExit......................");
								System.out.println("\n\t\t**************************************************************************************************************");
								break;
						}
						else 
						{
								System.out.println("\n\t\t\t\t\t\tInvalid Choise............");
								System.out.println("\n\t\t**************************************************************************************************************");
						}
					}
					else if(no==0)
					{
							System.out.println("\n\t\t**************************************************************************************************************");
							System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
							System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..:");
					}
					else
					{
						System.out.println("\n\t\t**************************************************************************************************************");
						System.out.println("\n\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
					}
				}
			else if(choise==2) 
			{
							System.out.println("\n\t\t\t\t\t\t\tYour choise is : Samosa");
							System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
							quantity=s.nextInt();
							total=quantity*20;
							System.out.println("\n\t\t**************************************************************************************************************");
							System.out.print("\n\t\t\t\t\t\t\tDo you want More Order ?");
							System.out.print("\n\t\t\t\t\t\tIf Yes the select 1 or no then select 0:");
							yes=s.nextInt();
							if(yes==1)
							{
								System.out.println("\n\t\t**************************************************************************************************************");
								System.out.println("\n\t\t1.Dosa\t\tPrize = 180rs/pcs");
								System.out.println("\t\t2.Samosa\tPrize = 20rs/pcs");
								System.out.println("\t\t3.Idali Vada\tPrize = 50rs/pcs");
								System.out.println("\t\t4.Alu Parotha\tPrize = 100rs/pcs");
								System.out.println("\t\t5.Pav Bhaji\tPrize = 120rs/pcs");
								System.out.println("\t\t6.Pulav\t\tPrize = 80rs/pcs");
								System.out.println("\t\t7.Pani Puri\tPrize = 20rs/6pcs");
								System.out.println("\t\t8.Alu Puri\tPrize = 100rs/pcs");
								System.out.println("\n\t\t**************************************************************************************************************");
								System.out.println("\n\t\t\t\t\t\t\tAt a time One Choise is accept");
								System.out.print("\n\t\t\t\t\t\t\tChoose one Option....:");
								choise=s.nextInt();
								System.out.println("\n\t\t**************************************************************************************************************");
								if(choise==1)
								{
									System.out.println("\n\t\t\t\t\t\t\tYour choise is : Dosa");
									System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
									quantity=s.nextInt();
									total=quantity*180;
									System.out.println("\n\t\t**************************************************************************************************************");
								}
									else if(choise==2) 
									{
										System.out.println("\n\t\t\t\t\t\t\tYour choise is : Samosa");
										System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
										quantity=s.nextInt();
										total=quantity*20;
										System.out.println("\n\t\t**************************************************************************************************************");
									}
									else if(choise==3)
									{
										System.out.println("\n\t\t\t\t\t\t\tYour choise is : Idali Vada");
										System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
										quantity=s.nextInt();
										total=quantity*50;
										System.out.println("\n\t\t**************************************************************************************************************");
									}
									else if(choise==4)
									{
										System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Parotha");
										System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
										quantity=s.nextInt();
										total=quantity*100;
									}
									else if(choise==5)
									{
										System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pav Bhaji");
										System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
										quantity=s.nextInt();
										total=quantity*120;
										System.out.println("\n\t\t**************************************************************************************************************");
									}
									else if(choise==6)
									{
										System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pulav");
										System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
										quantity=s.nextInt();
										total=quantity*80;
										System.out.println("\n\t\t**************************************************************************************************************");
									}
									else if(choise==7)
									{
										System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pani Puri");
										System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
										quantity=s.nextInt();
										total=quantity*20;
										System.out.println("\n\t\t**************************************************************************************************************");
									}
									else if(choise==8)
									{
										System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Puri");
										System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
										quantity=s.nextInt();
										total=quantity*100;
										System.out.println("\n\t\t**************************************************************************************************************");
									}
									else if(choise==9)
									{
										System.out.println("\n\t\t\t\t\t\tExit......................");
										System.out.println("\n\t\t**************************************************************************************************************");
										break;
									}
									else 
									{
										System.out.println("\n\t\t\t\t\t\tInvalid Choise............");
										System.out.println("\n\t\t**************************************************************************************************************");
									}
							}
							else if(no==0)
							{
									System.out.println("\n\t\t**************************************************************************************************************");
									System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
									System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..:");
							}
							else
							{
								System.out.println("\n\t\t**************************************************************************************************************");
								System.out.println("\n\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
							}
						}
	
						else if(choise==3)
						{
									System.out.println("\n\t\t\t\t\t\t\tYour choise is : Idali Vada");
									System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
									quantity=s.nextInt();
									total=quantity*50;
									System.out.println("\n\t\t**************************************************************************************************************");
									System.out.print("\n\t\t\t\t\t\t\tDo you want More Order ?");
									System.out.print("\n\t\t\t\t\t\tIf Yes the select 1 or no then select 0:");
									yes=s.nextInt();
									if(yes==1)
									{
										System.out.println("\n\t\t**************************************************************************************************************");
										System.out.println("\n\t\t1.Dosa\t\tPrize = 180rs/pcs");
										System.out.println("\t\t2.Samosa\tPrize = 20rs/pcs");
										System.out.println("\t\t3.Idali Vada\tPrize = 50rs/pcs");
										System.out.println("\t\t4.Alu Parotha\tPrize = 100rs/pcs");
										System.out.println("\t\t5.Pav Bhaji\tPrize = 120rs/pcs");
										System.out.println("\t\t6.Pulav\t\tPrize = 80rs/pcs");
										System.out.println("\t\t7.Pani Puri\tPrize = 20rs/6pcs");
										System.out.println("\t\t8.Alu Puri\tPrize = 100rs/pcs");
										System.out.println("\n\t\t**************************************************************************************************************");
										System.out.println("\n\t\t\t\t\t\t\tAt a time One Choise is accept");
										System.out.print("\n\t\t\t\t\t\t\tChoose one Option....:");
										choise=s.nextInt();
										System.out.println("\n\t\t**************************************************************************************************************");
										if(choise==1)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Dosa");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*180;
												System.out.println("\n\t\t**************************************************************************************************************");
											}
											else if(choise==2) 
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Samosa");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*20;
												System.out.println("\n\t\t**************************************************************************************************************");
											}
											else if(choise==3)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Idali Vada");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*50;
												System.out.println("\n\t\t**************************************************************************************************************");
											}
											else if(choise==4)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Parotha");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*100;
											}
											else if(choise==5)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pav Bhaji");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*120;
												System.out.println("\n\t\t**************************************************************************************************************");
											}
											else if(choise==6)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pulav");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*80;
												System.out.println("\n\t\t**************************************************************************************************************");
											}
											else if(choise==7)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pani Puri");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*20;
												System.out.println("\n\t\t**************************************************************************************************************");
											}
											else if(choise==8)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Puri");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*100;
												System.out.println("\n\t\t**************************************************************************************************************");
											}
											else if(choise==9)
											{
												System.out.println("\n\t\t\t\t\t\tExit......................");
												System.out.println("\n\t\t**************************************************************************************************************");
												break;
											}
											else 
											{
												System.out.println("\n\t\t\t\t\t\tInvalid Choise............");
												System.out.println("\n\t\t**************************************************************************************************************");
											}
								}
								else if(no==0)
								{
											System.out.println("\n\t\t**************************************************************************************************************");
											System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
											System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..:");
									}
									else
									{
										System.out.println("\n\t\t**************************************************************************************************************");
										System.out.println("\n\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
									}
								}				
											else if(choise==4)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Parotha");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*100;
												System.out.println("\n\t\t**************************************************************************************************************");
												System.out.print("\n\t\t\t\t\t\t\tDo you want More Order ?");
												System.out.print("\n\t\t\t\t\t\tIf Yes the select 1 or no then select 0:");
												yes=s.nextInt();
												if(yes==1)
												{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t1.Dosa\t\tPrize = 180rs/pcs");
													System.out.println("\t\t2.Samosa\tPrize = 20rs/pcs");
													System.out.println("\t\t3.Idali Vada\tPrize = 50rs/pcs");
													System.out.println("\t\t4.Alu Parotha\tPrize = 100rs/pcs");
													System.out.println("\t\t5.Pav Bhaji\tPrize = 120rs/pcs");
													System.out.println("\t\t6.Pulav\t\tPrize = 80rs/pcs");
													System.out.println("\t\t7.Pani Puri\tPrize = 20rs/6pcs");
													System.out.println("\t\t8.Alu Puri\tPrize = 100rs/pcs");
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\t\t\tAt a time One Choise is accept");
													System.out.print("\n\t\t\t\t\t\t\tChoose one Option....:");
													choise=s.nextInt();
													System.out.println("\n\t\t**************************************************************************************************************");
													if(choise==1)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Dosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*180;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==2) 
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Samosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==3)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Idali Vada");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*50;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==4)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Parotha");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
														}
														else if(choise==5)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pav Bhaji");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*120;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==6)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pulav");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*80;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==7)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pani Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==8)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==9)
														{
															System.out.println("\n\t\t\t\t\t\tExit......................");
															System.out.println("\n\t\t**************************************************************************************************************");
															break;
														}
														else 
														{
															System.out.println("\n\t\t\t\t\t\tInvalid Choise............");
															System.out.println("\n\t\t**************************************************************************************************************");
														}
											}
												else if(no==0)
												{
														System.out.println("\n\t\t**************************************************************************************************************");
														System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
														System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..:");
												}
												else
												{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
												}
											}
											else if(choise==5)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pav Bhaji");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*120;
												System.out.println("\n\t\t**************************************************************************************************************");
												System.out.print("\n\t\t\t\t\t\t\tDo you want More Order ?");
												System.out.print("\n\t\t\t\t\t\tIf Yes the select 1 or no then select 0:");
												yes=s.nextInt();
												if(yes==1)
												{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t1.Dosa\t\tPrize = 180rs/pcs");
													System.out.println("\t\t2.Samosa\tPrize = 20rs/pcs");
													System.out.println("\t\t3.Idali Vada\tPrize = 50rs/pcs");
													System.out.println("\t\t4.Alu Parotha\tPrize = 100rs/pcs");
													System.out.println("\t\t5.Pav Bhaji\tPrize = 120rs/pcs");
													System.out.println("\t\t6.Pulav\t\tPrize = 80rs/pcs");
													System.out.println("\t\t7.Pani Puri\tPrize = 20rs/6pcs");
													System.out.println("\t\t8.Alu Puri\tPrize = 100rs/pcs");
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\t\t\tAt a time One Choise is accept");
													System.out.print("\n\t\t\t\t\t\t\tChoose one Option....:");
													choise=s.nextInt();
													System.out.println("\n\t\t**************************************************************************************************************");
													if(choise==1)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Dosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*180;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==2) 
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Samosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==3)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Idali Vada");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*50;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==4)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Parotha");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
														}
														else if(choise==5)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pav Bhaji");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*120;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==6)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pulav");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*80;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==7)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pani Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==8)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==9)
														{
															System.out.println("\n\t\t\t\t\t\tExit......................");
															System.out.println("\n\t\t**************************************************************************************************************");
															break;
														}
														else 
														{
															System.out.println("\n\t\t\t\t\t\tInvalid Choise............");
															System.out.println("\n\t\t**************************************************************************************************************");
														}
											
											}
												else if(no==0)
												{
														System.out.println("\n\t\t**************************************************************************************************************");
														System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
														System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..:");
												}
												else
												{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
												}
											}
											else if(choise==6)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pulav");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*80;
												System.out.println("\n\t\t**************************************************************************************************************");
												System.out.print("\n\t\t\t\t\t\t\tDo you want More Order ?");
												System.out.print("\n\t\t\t\t\t\tIf Yes the select 1 or no then select 0:");
												yes=s.nextInt();
												if(yes==1)
												{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t1.Dosa\t\tPrize = 180rs/pcs");
													System.out.println("\t\t2.Samosa\tPrize = 20rs/pcs");
													System.out.println("\t\t3.Idali Vada\tPrize = 50rs/pcs");
													System.out.println("\t\t4.Alu Parotha\tPrize = 100rs/pcs");
													System.out.println("\t\t5.Pav Bhaji\tPrize = 120rs/pcs");
													System.out.println("\t\t6.Pulav\t\tPrize = 80rs/pcs");
													System.out.println("\t\t7.Pani Puri\tPrize = 20rs/6pcs");
													System.out.println("\t\t8.Alu Puri\tPrize = 100rs/pcs");
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\t\t\tAt a time One Choise is accept");
													System.out.print("\n\t\t\t\t\t\t\tChoose one Option....:");
													choise=s.nextInt();
													System.out.println("\n\t\t**************************************************************************************************************");
													if(choise==1)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Dosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*180;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==2) 
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Samosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==3)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Idali Vada");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*50;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==4)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Parotha");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
														}
														else if(choise==5)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pav Bhaji");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*120;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==6)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pulav");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*80;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==7)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pani Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==8)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==9)
														{
															System.out.println("\n\t\t\t\t\t\tExit......................");
															System.out.println("\n\t\t**************************************************************************************************************");
															break;
														}
														else 
														{
															System.out.println("\n\t\t\t\t\t\tInvalid Choise............");
															System.out.println("\n\t\t**************************************************************************************************************");
														}
											}
												else if(no==0)
												{
														System.out.println("\n\t\t**************************************************************************************************************");
														System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
														System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..:");
												}
												else
												{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
												}
											}
											else if(choise==7)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pani Puri");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*20;
												System.out.println("\n\t\t**************************************************************************************************************");
												System.out.print("\n\t\t\t\t\t\t\tDo you want More Order ?");
												System.out.print("\n\t\t\t\t\t\tIf Yes the select 1 or no then select 0:");
												yes=s.nextInt();
												if(yes==1)
												{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t1.Dosa\t\tPrize = 180rs/pcs");
													System.out.println("\t\t2.Samosa\tPrize = 20rs/pcs");
													System.out.println("\t\t3.Idali Vada\tPrize = 50rs/pcs");
													System.out.println("\t\t4.Alu Parotha\tPrize = 100rs/pcs");
													System.out.println("\t\t5.Pav Bhaji\tPrize = 120rs/pcs");
													System.out.println("\t\t6.Pulav\t\tPrize = 80rs/pcs");
													System.out.println("\t\t7.Pani Puri\tPrize = 20rs/6pcs");
													System.out.println("\t\t8.Alu Puri\tPrize = 100rs/pcs");
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\t\t\tAt a time One Choise is accept");
													System.out.print("\n\t\t\t\t\t\t\tChoose one Option....:");
													choise=s.nextInt();
													System.out.println("\n\t\t**************************************************************************************************************");
													if(choise==1)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Dosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*180;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==2) 
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Samosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==3)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Idali Vada");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*50;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==4)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Parotha");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
														}
														else if(choise==5)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pav Bhaji");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*120;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==6)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pulav");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*80;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==7)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pani Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==8)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==9)
														{
															System.out.println("\n\t\t\t\t\t\tExit......................");
															System.out.println("\n\t\t**************************************************************************************************************");
															break;
														}
														else 
														{
															System.out.println("\n\t\t\t\t\t\tInvalid Choise............");
															System.out.println("\n\t\t**************************************************************************************************************");
														}
											}
												else if(no==0)
												{
														System.out.println("\n\t\t**************************************************************************************************************");
														System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
														System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..:");
												}
												else
												{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
												}
											}
											else if(choise==8)
											{
												System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Puri");
												System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
												quantity=s.nextInt();
												total=quantity*100;
												System.out.println("\n\t\t**************************************************************************************************************");
												System.out.print("\n\t\t\t\t\t\t\tDo you want More Order ?");
												System.out.print("\n\t\t\t\t\t\tIf Yes the select 1 or no then select 0:");
												yes=s.nextInt();
												if(yes==1)
												{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t1.Dosa\t\tPrize = 180rs/pcs");
													System.out.println("\t\t2.Samosa\tPrize = 20rs/pcs");
													System.out.println("\t\t3.Idali Vada\tPrize = 50rs/pcs");
													System.out.println("\t\t4.Alu Parotha\tPrize = 100rs/pcs");
													System.out.println("\t\t5.Pav Bhaji\tPrize = 120rs/pcs");
													System.out.println("\t\t6.Pulav\t\tPrize = 80rs/pcs");
													System.out.println("\t\t7.Pani Puri\tPrize = 20rs/6pcs");
													System.out.println("\t\t8.Alu Puri\tPrize = 100rs/pcs");
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\t\t\tAt a time One Choise is accept");
													System.out.print("\n\t\t\t\t\t\t\tChoose one Option....:");
													choise=s.nextInt();
													System.out.println("\n\t\t**************************************************************************************************************");
													if(choise==1)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Dosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*180;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==2) 
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Samosa");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==3)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Idali Vada");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*50;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==4)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Parotha");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
														}
														else if(choise==5)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pav Bhaji");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*120;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==6)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pulav");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*80;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==7)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Pani Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*20;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==8)
														{
															System.out.println("\n\t\t\t\t\t\t\tYour choise is : Alu Puri");
															System.out.print("\n\t\t\t\t\t\t\tEnter the Quantity : ");
															quantity=s.nextInt();
															total=quantity*100;
															System.out.println("\n\t\t**************************************************************************************************************");
														}
														else if(choise==9)
														{
															System.out.println("\n\t\t\t\t\t\tExit......................");
															System.out.println("\n\t\t**************************************************************************************************************");
															break;
														}
														else 
														{
															System.out.println("\n\t\t\t\t\t\tInvalid Choise............");
															System.out.println("\n\t\t**************************************************************************************************************");
														}
											}
											else if(no==0)
											{
														System.out.println("\n\t\t**************************************************************************************************************");
														System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
														System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..:");
											}
											else
											{
													System.out.println("\n\t\t**************************************************************************************************************");
													System.out.println("\n\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
											}
										}
										else if(choise==9)
											{
												System.out.println("\n\t\t\t\t\t\tExit......................");
												break;
											}
											else 
											{
												System.out.println("\n\t\t\t\t\t\tInvalid Choise............");
											}
										}
			System.out.println("\n\t\t\t\t\t\t\tTotal Amount is : "+total);
			System.out.println("\n\t\t**************************************************************************************************************");
			System.out.println("\n\t\t\t\t\t\t\tTHANK YOU FOR ORDERING FOOD!");
			System.out.println("\n\t\t\t\t\t\t\tPlease Pay Your Bill..:");
			System.out.println("\n\t\t**************************************************************************************************************");
			

}
}

