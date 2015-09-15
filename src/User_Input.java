/*
Programmed by:

-Cedric Selph
-Danielle Walukiewics
-Thomas Wartzack

*/

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

	/**
	 * 
	 * @author Cedric Selph
	 * @author Thomas Wartzack
	 * @author Danielle Walukiewicz
	 *
	 * Lab 1, 9/14/15
	 * CISC 181
	 *
	 */
public class User_Input {
	
	/**
	 * 
	 * This program takes multiple inputs that are used to determine logistics of an annuity
	 * 
	 * @param years_working
	 * @param average_return
	 * @param years_till_death
	 * @param retired_return
	 * @param Income
	 * @param SSI_Income
	 * 
	 * Using these parameters, Present Value and Payments for the annuity are calculated using their respective formulas
	 * These formulas have been imported from org.apache.poi.ss.formula.functions.FinanceLib
	 * 
	 * After the inputs are received, they are plugged into the formulas for Present Value and Payment
	 * Present Value and Payment are then printed in that order
	 * 
	 * 
	 */
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
		
		input.close();
		
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
	
		
		
		
	

	