/*
Programmed by:

-Cedric Selph
-Danielle Walukiewics
-Thomas Wartzack

*/

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class User_Input {
	
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
		
		System.out.print("Enter numbers of years working:");
		double years_working= input.nextDouble();
		
		System.out.print("Expected average annual return:");
		double average_return=input.nextDouble();
		
		System.out.print("Expected retired years:");
		double years_till_death=input.nextDouble();
		
		System.out.print("Expected Retired return:");
		double retired_return=input.nextDouble();
		
		System.out.print("What is your expected monthly income:");
		double Income=input.nextDouble();
		
		System.out.print("Expected SSI amount:");
		double SSI_Income=input.nextDouble();
		

		
		double PV;
		
		double r = ((retired_return)/12);
		double n=(years_till_death*12);
		double y=(Income-SSI_Income);
		double f=0;
		boolean t = false;
		
		
		PV=FinanceLib.pv(r, n, y, f, t);
		
		System.out.println(Math.abs(PV));
		
		double PMT;
		
		double r_2=((average_return)/12);
		double n_2=(years_working*12);
		double p_2=0;
		double f_2=PV;
		boolean t_2=false;
		
		PMT=FinanceLib.pmt(r_2, n_2, p_2, f_2, t_2);
		
		System.out.println(Math.abs(PMT));
		
		}
}	
	
		
		
		
	

	