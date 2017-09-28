import java.util.Scanner;

public class Review {

	public void feedback(){
		
		System.out.println("Hope you enjoyed the meal, Sir!");
		System.out.println("Can you please kindly rate our services and mainatainance out of 5 ??");
		Scanner f=new Scanner(System.in);
		int points=f.nextInt();
		if (points>5){
			System.out.println("Please provide a value between 0 to 5.\n");
			System.out.print("Rating:");
			points=f.nextInt();
			
		}
			
		System.out.println("Any other suggestions ?");
		String support1=f.next();
		System.out.println("Thank you!\tPlease visit again\n");
	}
	
}
