import java.util.Random;
import java.util.Scanner;

public class ParkingSpot
{
   String Vno;
   int type;
   int token;
	void parking()
   {
	   System.out.println("Enter vechile Number");
	   Scanner s=new Scanner(System.in);
//	   ParkingSpot[] park=new ParkingSpot[10];
	   Vno=s.nextLine();
	   System.out.println("Enter Vechile Type\n 2 or 4");
	   type=s.nextInt();
	   Random r=new Random();
	   token= r.nextInt(999);
	   System.out.println("your valet parking id is ->"+token+"\n");
	   
	   
	   
   }
}