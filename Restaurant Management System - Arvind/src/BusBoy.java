//Cleaning and serving the water by Busboy
import java.util.Scanner;

public class BusBoy {
	public void water()
	{
		Scanner water=new Scanner(System.in);
		System.out.println("Would you like to have the water Mineral or Regular, Sir? Mineral:M Regular:R");
		String var5=water.nextLine();
		char temp5=var5.charAt(0);
		if(temp5=='M' || temp5=='m')
				{
				
						System.out.print("Mineral water served!\n");
											
				}
		else
		{
			System.out.println("Regular water served!\n");
		}
		
	}
	public void clean()
	{
		System.out.println("Server cleans the Table!");
	}
}
