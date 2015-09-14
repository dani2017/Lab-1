import java.util.Scanner;

public class User_Input {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter numbers of years working:");
		double years_working= input.nextDouble();
		
		System.out.print("Expected average return:");
		double average_return=input.nextDouble();
		
		System.out.print("Expected retired years:");
		double years_till_death=input.nextDouble();
		
		System.out.print("Expected SSI amount:");
		double SSI_Income=input.nextDouble();
		
		System.out.print("What is your income:");
		double Income=input.nextDouble();
		
	}
}	
		
		
		
		
	

	