
public class MenuItem {
	
	String name;
	String description;
	double prices;
	String category;
	
	MenuItem()
	{
		this("Item Name","Dish Description",0.00);
	}
	MenuItem(String name, String description, double prices)
	{
		this.name=name;
		this.description=description;
		this.prices=prices;
	}
	
	public void print()
	{
		System.out.print(name + "\t\t\tRs." +  prices + "\n- " + description + "\n\n");
	}
	

}
