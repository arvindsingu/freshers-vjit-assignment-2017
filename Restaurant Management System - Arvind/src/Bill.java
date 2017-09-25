import java.util.*;

public class Bill {

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		double itemcost;
		double tax;
		double totalcost;
		double tip;
		
		System.out.println("Enter the cost of the item/dish: ");
		itemcost = s.nextDouble();
		tax= 0.065 * itemcost;
		totalcost=itemcost+tax;
		tip=0.2*totalcost;
		System.out.println("Cost of the item/dish -> Rs:" +itemcost);
		System.out.println("TAX -> Rs:"+tax);
		System.out.println("TIP -> Rs:"+tip);
		System.out.println("TOTAL -> Rs:"+totalcost);
	}
}
