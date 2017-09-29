//Delivery of the food
import java.util.Scanner;
public class Takeaway {
	public void delivery()
	{
		String address;
		Scanner s=new Scanner(System.in);
		System.out.println("* * * Menu * * *");
		MenuClass mc=new MenuClass();
		mc.display();
		System.out.println("Enter delivery address:\n");
		address=s.next();
		System.out.println("Your order is placed and will be delivered in time! Thank you.");
		
	}
}
