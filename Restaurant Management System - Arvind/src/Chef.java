//Chef's and their dishes
import java.util.HashMap;
import java.util.Map;

public class Chef {
	public void Cook()
	{
		 HashMap<String,String> cookObj=new HashMap<String,String>();
	//	* * * * * * * * * * STARTERS * * * * * * * * * *
		 cookObj.put("Chef Raju's Special's,\n","1)Veg_65\t2)Paneer_Tikka\t3)Chicken_65\t4)Prawns_Fry\n\n");
	
	//	 * * * * * * * * * * MAINCOURSE * * * * * * * * * *
		 cookObj.put("Chef kunal Special's,\n","1)Veg_Pulao\t2)Biryani\t3)Noodles\t4)Pasta\n\n");
	
	//	* * * * * * * * * * DESERTS * * * * * * * * * *
		 cookObj.put("Chef Sanjeev Special's,\n","1)Barfi\t2)Kheer\n\n");
	
		 
		 for(Map.Entry c:cookObj.entrySet()){  
			   System.out.println(c.getKey()+" "+c.getValue());  
			  } 
		 
		 
	}

}
