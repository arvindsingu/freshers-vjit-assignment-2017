import java.util.Scanner;

public class RMS_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);		
		
		System.out.println("Are you a Walk-in customer or a Reserver?\t Reserver:R Customer:C");
		String var=scan.nextLine();
		

		char temp2=var.charAt(0);
		
		if(temp2=='R'||temp2=='r')
		{
			
			Reserve rs=new Reserve();
			int  token= rs.Details();
			System.out.println("Your reservation id is ->"+token+"\n");
			System.out.println("Reservation-ID is must at the time you come.....See you soon!");
			
		while(true)	{
			System.out.print("");
		}
					
		}
		
		System.out.println("Dine-in or Takeaway ?\t Dine:D Takeaway:T");
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
		
		
		
 		
		System.out.println("Do you have Vechile ?\t YES:Y NO:N");
		String yn=scan.nextLine();
		
		char temp1=yn.charAt(0);
		
		if(temp1=='Y'||temp1=='y')
		{
			
			ParkingSpot ps=new ParkingSpot();
			ps.parking();
					
		}
		
		
		System.out.println("\nWelcome to the Restaurant. Please have your seat!\n\nWhat would you like to have today?\n");
		MenuClass mc=new MenuClass();
		mc.display();
				
		Review Rv=new Review();
		Rv.feedback();
		
	}

}
