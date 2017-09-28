import java.util.*;

public class Bill {

	public void billMethod(int price) 
	{
		
	
		int tax= (int) (0.50 * price);
		
		int tip=(int) (0.02*price);
		
		int totalcost=price+tax+tip;
		
		System.out.println("\nCost of the item-> Rs:" +totalcost);
		System.out.println("TAX-> Rs:"+tax);
		System.out.println("TIP-> Rs:"+tip);
		System.out.println("TOTAL-> Rs:"+totalcost);
	}
}
