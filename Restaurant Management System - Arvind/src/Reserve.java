
import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;

class Reserve
{
	Scanner s =new Scanner(System.in);
	
	public int Details(){
	int num;
	String name;
	String dt;
	int reserve_id;
	System.out.println("Please provide your name:");
	name=s.nextLine();
	System.out.println("Time Please:");
	dt=s.nextLine();
	System.out.println("Seat's to booked:");
	num=s.nextInt();
	
	Random r=new Random();
	reserve_id= r.nextInt(10);

	   return reserve_id;
	}

	
	
}
