//Valet Parking
import java.util.Random;
import java.util.Scanner;

public class ParkingSpot
{
   String Vno;
   int type;
   int token;
	void parking()
   {
	   System.out.println("Enter Vehicle Number");
	   Scanner s=new Scanner(System.in);
	   Vno=s.nextLine();
	   System.out.println("Enter Vehicle Type either of 2 or 4 wheeler.");
	   type=s.nextInt();
	 //provides a token to the customer for the parked vehicle
	   Random r=new Random();
	   token= r.nextInt(999);
	   System.out.println("Your valet parking id is ->"+token+"\n");
	      
	   
   }
}
