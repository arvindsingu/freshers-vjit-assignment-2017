
public class RMS_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MenuItem[] menu = new MenuItem[10];
	
		
		for(int i=0;i<menu.length;i++)
		{
			menu[i]=new MenuItem();
		}
		
		
		System.out.println("\t\t\t\t\t********** STARTERS **********\t\t\t\n");
		
		menu[0].name="Veg Soup";
		menu[0].description="Made out of sweetcorn...";
		menu[0].prices=60.00;
		
		
		menu[1].name="Non-Veg Soup";
		menu[1].description="Made out of meat...";
		menu[1].prices=80.00;
	
		
		menu[2].name="veg cutlet";
		menu[2].description="Made of fresh mixture of vegie's...";
		menu[2].prices=100.00;
		
		
		menu[3].name="Chicken 65";
		menu[3].description="Spicy, Peppery, Roasted chicken...";
		menu[3].prices=120.00;
		
		
	
		System.out.println("\t\t\t\t\t********** MAIN COURSE **********\t\t\t\n");
		
		menu[4].name="Lemon Rice";
		menu[4].description="a taste of south...";
		menu[4].prices=99.99;
		
		menu[5].name="Chicken Biryani";
		menu[5].description="Hyderabad specials...";
		menu[5].prices=150.00;
		
		menu[6].name="Lamb Biryani";
		menu[6].description="Nizam special's...";
		menu[6].prices=180.00;
		
		menu[7].name="Curd Rice";
		menu[7].description="Simply simple...";
		menu[7].prices=80.00;
		
		
		System.out.println("\t\t\t\t\t********** DESERTS **********\t\t\t\n");
		
		menu[8].name="Gulab Jamun";
		menu[8].description="The traditions...";
		menu[8].prices=99.00;
		
		menu[9].name="Ice-Cream";
		menu[9].description="Fruit's n Nut's...";
		menu[9].prices=99.00;
		
		
		
		
		for(int i=0;i<menu.length;i++)
		{
			menu[i].print();
		}
		
		
	}

}
