//MAIN PROGRAM

import java.util.Scanner;

public class RMS_main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);		
		//To know whether the customer is here to eat or to book a table for future plans
		System.out.println("Are you a Walk-in customer or a Reserver?\t Reserver:R Customer:C");
		String var=scan.nextLine();
		char temp2=var.charAt(0);
		if(temp2=='R'||temp2=='r')
		{
			Reserve rs=new Reserve();
			int  token= rs.Details();
			System.out.println("Your reservation is confirmed, your R.id is ->"+token+"\n");
			System.out.println("Reservation-ID is must at the time you come.....See you soon!");
			while(true)	
			{
				System.out.print("");
			}
					
		}
		
		//To know whether the customer is to sit and eat or would like to takeaway the order
		System.out.println("Would you like to Dine-in or Takeaway ?\t Dine:D Takeaway:T");
		String var2=scan.nextLine();
		char temp3=var2.charAt(0);
		if(temp3=='T' || temp3=='t')
				{
					Takeaway tw=new Takeaway();
					tw.delivery();
					while(true)	{
						System.out.print("");
					}
				}
		
		
		
 		//PARKING
		System.out.println("Do you have Vehicle ?\t YES:Y NO:N");
		String yn=scan.nextLine();
		
		char temp1=yn.charAt(0);
		
		if(temp1=='Y'||temp1=='y')
		{
			
			ParkingSpot ps=new ParkingSpot();
			ps.parking();
					
		}
		
		
		//The customers is in the Restaurant!
		System.out.println("\nWelcome to the Restaurant. Please have your seat!\n\n");
		
		BusBoy bs=new BusBoy();
		//Serves water
		bs.water();
		
		System.out.println("\nWhat would you like to have today?\n");
		
		MenuClass mc=new MenuClass();
		//Display MENU
		mc.display();
		
		System.out.println("Want to know the chef who made all of these delight's?\t YES:Y NO:N\n");
		//To know the chef's and their dishes
		String cook=scan.nextLine();
		
		char temp4=cook.charAt(0);
		
		if(temp4=='Y'||temp4=='y')
		{
			
			Chef cf=new Chef();
			cf.Cook();
					
		}
		
		//Reviewing the food and services		
		Review Rv=new Review();
		Rv.feedback();
		
		//Busboy cleans the table 
		bs.clean();
		
	}

}
