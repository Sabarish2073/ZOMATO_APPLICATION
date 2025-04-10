import java.util.*;
class Hotel 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		long Entered_contact=9876543210L;
		System.out.println("Enter Reg_Contact : ");
		long Reg_Contact=sc.nextLong();
		
		Thread.sleep(2000);
		if(Entered_contact==Reg_Contact)
		{
			System.out.println("Generate OTP");
			System.out.println("\t\tProcessing....");
			Thread.sleep(2000);
			int Sys_OTP=(int)(Math.random()*9999+9999);
			System.out.println("Sys_OTP is "+Sys_OTP);
			System.out.println("Enter the Correct OTP");
			int Correct_OTP=sc.nextInt();

			Thread.sleep(1000);
			System.out.println("Login successfully\nWait a Moment....");
			System.out.println("---------------------------------");
			Thread.sleep(2000);
			if(Sys_OTP==Correct_OTP)
			{
				System.out.println("Select the Hotel\n 1.Buhari\n 2.A2B\n 3.S.S Hyderabad");
				sc.nextLine();
				String Hotels=sc.nextLine();
				int Mutton_Ordered_price=0,Chicken_Ordered_price=0,Prawn_Ordered_price=0,
					Mushroom_Ordered_price=0,Noodles_Ordered_price=0,Parota_Ordered_price=0,
					Hyd_Briyani_Ordered_price=0,Hyd_Special_Chicken_Ordered_price=0,Hyd_Dum_Briyani_Ordered_price=0;
				switch(Hotels)
				{
					case "Buhari":
						System.out.println("Loading....");
						Thread.sleep(2000);
						System.out.println("Welcome to Buhari \n Select Your Favourite Food \n 1.Mutton Biryani \n 2.Chicken Biryani \n 3.Prawn Biryani");
						String Buhari_Favourite_Food=sc.nextLine();
						switch(Buhari_Favourite_Food)
						{
							case "Mutton Biryani":
								int Mutton_Price=350;
								System.out.print("The Price Of the Mutton Biryani is : "+Mutton_Price);
								System.out.print("\nEnter the Qyantity : ");
								int Mutton_Quantity=sc.nextInt();
								Mutton_Ordered_price=Mutton_Price*Mutton_Quantity;
								System.out.print("The Ordered Price is "+Mutton_Ordered_price);
								break;
							case "Chicken Biryani":
								int Chicken_Price=250;
								System.out.print("The Price Of the Chicken Biryani is : "+Chicken_Price);
								System.out.print("\nEnter the Qyantity : ");
								int Chicken_Quantity=sc.nextInt();
								Chicken_Ordered_price=Chicken_Price*Chicken_Quantity;
								System.out.print("The Ordered Price is "+Chicken_Ordered_price);
								break;
							case "Prawn Biryani":
								int Prawn_Price=450;
								System.out.print("The Price Of the Mutton Biryani is : "+Prawn_Price);
								System.out.print("\nEnter the Qyantity : ");
								int Prawn_Quantity=sc.nextInt();
								Prawn_Ordered_price=Prawn_Price*Prawn_Quantity;
								System.out.print("The Ordered Price is "+Prawn_Ordered_price);
								break;
						}
						break;

					case "A2B":
						System.out.println("Loading....");
						Thread.sleep(2000);
						System.out.println("Welcome to Buhari \n Select Your Favourite Food \n 1.Mushroom Briyani \n 2.Veg Noodles \n 3.Parrot Parota");
						String A2B_Favourite_Food=sc.nextLine();
						switch(A2B_Favourite_Food)
						{
							case "Mushroom Briyani":
								int Mushroom_Price=180;
								System.out.print("The Price Of the Mushroom Biryani is : "+Mushroom_Price);
								System.out.print("\nEnter the Qyantity : ");
								int Mushroom_Quantity=sc.nextInt();
								Mushroom_Ordered_price=Mushroom_Price*Mushroom_Quantity;
								System.out.print("The Ordered Price is "+Mushroom_Ordered_price);
								break;
							case "Veg Noodles":
								int Noodles_Price=120;
								System.out.print("The Price Of the  Veg Noodles is : "+Noodles_Price);
								System.out.print("\nEnter the Qyantity : ");
								int Noodles_Quantity=sc.nextInt();
								Noodles_Ordered_price=Noodles_Price*Noodles_Quantity;
								System.out.print("The Ordered Price is "+Noodles_Ordered_price);
								break;
							case "Parrot Parota":
								int Parota_Price=150;
								System.out.print("The Price Of the Parrot Parota is : "+Parota_Price);
								System.out.print("\nEnter the Qyantity : ");
								int Parota_Quantity=sc.nextInt();
								Parota_Ordered_price=Parota_Price*Parota_Quantity;
								System.out.print("The Ordered Price is "+Parota_Ordered_price);
								break;
						}
						break;	
					case "S.S Hyderabad":
						System.out.println("Loading....");
						Thread.sleep(2000);
						System.out.println("Welcome to S.S Hyderabad \n Select Your Favourite Food \n 1.Hyd Bucket Briyani \n 2.Hyd Special Chicken  \n 3.Hyd Dum Briyani");
						String Hyd_Favourite_Food=sc.nextLine();
						switch(Hyd_Favourite_Food)
						{
							case "Hyd Bucket Briyani":
								int Hyd_Bucket_Briyani=400;
								System.out.print("The Price Of the Hyd Bucket Biryani is : "+Hyd_Bucket_Briyani);
								System.out.print("\nEnter the Qyantity : ");
								int Hyd_Bucket_Briyani_Quantity=sc.nextInt();
								Hyd_Briyani_Ordered_price=Hyd_Bucket_Briyani*Hyd_Bucket_Briyani_Quantity;
								System.out.print("The Ordered Price is "+Hyd_Briyani_Ordered_price);
								break;
							case "Hyd Special Chicken ":
								int Hyd_Special_Chicken=200;
								System.out.print("The Price Of the  Veg Noodles is : "+Hyd_Special_Chicken);
								System.out.print("\nEnter the Qyantity : ");
								int Hyd_Special_Chicken_Quantity=sc.nextInt();
								Hyd_Special_Chicken_Ordered_price=Hyd_Special_Chicken*Hyd_Special_Chicken_Quantity;
								System.out.print("The Ordered Price is "+Hyd_Special_Chicken_Ordered_price);
								break;
							case "Hyd Dum Briyani":
								int Hyd_Dum_Briyani=300;
								System.out.print("The Price Of the Parrot Parota is : "+Hyd_Dum_Briyani);
								System.out.print("\nEnter the Qyantity : ");
								int Hyd_Dum_Briyani_Quantity=sc.nextInt();
								Hyd_Dum_Briyani_Ordered_price=Hyd_Dum_Briyani*Hyd_Dum_Briyani_Quantity;
								System.out.print("The Ordered Price is "+Hyd_Dum_Briyani_Ordered_price);
								break;
						}
						break;	

				}
					
					System.out.println("\nRedirecting to Payment Mode..... ");
					Thread.sleep(2000);
					System.out.println("Select your Payment Mode \n\t1.G-pay \n\t2.Phone-pay \n\t3.Cash-On-Delivery");
					String Payment_Mode=sc.next();
					switch(Payment_Mode){
						case "G-pay","Phone-pay":
							int MPIN=1234;
							System.out.println("My MPIN is : "+MPIN);
							System.out.println("Enter the Correct MPIN");
							int Correct_MPIN=sc.nextInt();
							System.out.println("Checking the MPIN....");
							Thread.sleep(2000);
							if(MPIN==Correct_MPIN )
							{
								System.out.print("Enter the Amount : ");
								int Amount=sc.nextInt();
								if(Mutton_Ordered_price==Amount ||Chicken_Ordered_price==Amount|| Prawn_Ordered_price==Amount|| 
									Mushroom_Ordered_price==Amount|| Noodles_Ordered_price==Amount||Parota_Ordered_price==Amount||
									Hyd_Briyani_Ordered_price==Amount ||Hyd_Special_Chicken_Ordered_price==Amount || Hyd_Dum_Briyani_Ordered_price==Amount)
								{
									System.out.println("Checking the Payment....");
									Thread.sleep(1000);
									System.out.println("Payment Successfully Received");
									System.out.println("Order Placed \nDeliver Within An Hour \n\"Happy Eating\"");
						
								}
								else
									System.out.println("Ordered Failed \nSorry \nRetry...");

							}
							break;
						default :
							System.out.print("Pay the Bill in Hand : ");
							int Bill=sc.nextInt();
							if(Mutton_Ordered_price==Bill ||Chicken_Ordered_price==Bill|| Prawn_Ordered_price==Bill||
								Mushroom_Ordered_price==Bill|| Noodles_Ordered_price==Bill||Parota_Ordered_price==Bill||
								Hyd_Briyani_Ordered_price==Bill ||Hyd_Special_Chicken_Ordered_price==Bill || Hyd_Dum_Briyani_Ordered_price==Bill)
							{
								System.out.println("Checking the Payment....");
								Thread.sleep(1000);
								System.out.println("Amount Paid");
								System.out.println("Get the Bill \nDeliver Within An Hour \n\"Happy Eating\"");
						
							}
							else
								System.out.println("Ordered Failed \nSorry \nRetry...");

							break;
					}		
				
			}
		}
		
	}
}
