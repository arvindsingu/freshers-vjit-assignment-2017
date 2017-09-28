import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuClass {
	Scanner scan=new Scanner(System.in);
	String order="";
	int price=0;
	void display(){
		
		 HashMap<String,Integer> menuObj=new HashMap<String,Integer>();  
	//		 * * * * * * * * * * STARTERS * * * * * * * * * *
		 menuObj.put("Veg_65",80);  
		 menuObj.put("Paneer_Tikka",80);  
		 menuObj.put("Chicken_65",100);  
		 menuObj.put("PRAWNS_FRY",100);
	//	 * * * * * * * * * * MAINCOURSE * * * * * * * * * *
		 menuObj.put("Veg_Pulao",120);
		 menuObj.put("Biryani",180);  
		 menuObj.put("Noodles",150);  
		 menuObj.put("Pasta",200);
	//	* * * * * * * * * * DESERTS * * * * * * * * * *
		 menuObj.put("Ice_Cream",80);
		 menuObj.put("Kheer",80);
		  
		  
		  for(Map.Entry m:menuObj.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  } 
		  System.out.println("\nPlease press E or e when you are done with orders!");
		  while(true)
		  {
			  System.out.print("Whishlist: ");
			  String select=scan.nextLine();
			  for(Map.Entry m:menuObj.entrySet()){  
				  if(m.getKey().equals(select))
				  		{
					  order=order+" "+select;
					  int p=(int) m.getValue();
					  price=price+p;
					  System.out.println(order);  
				  		}
				  }
			  char exit=select.charAt(0);
			  if(exit=='e'||exit=='E')
			  {
				  System.out.print("Amount: "+price);
				  break;
			  }
		  }
		  Bill bill=new Bill();
		  bill.billMethod(price);
		  
		  
	}
	}
	
	
	

