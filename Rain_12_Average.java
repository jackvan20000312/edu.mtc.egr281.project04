//Jacob Vaught
//9-21-2020
//Takes average of 12 numbers and outputs the total and outputs the average, to 1 decimal place
//Objective: Using DecimalFormat to output a decimal with 1 decimal place
//Due Date is 9-23-2020
//Project04

package project04;
//IMPORT all Libraries
import java.text.DecimalFormat;
import java.util.Scanner;


public class Rain_12_Average {
	public static final int MONTHS_IN_A_YEAR = 12;
	public static void main(String[] args) {
		//List Of VARIABLES
		
		double month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12; 
		double Total_Rain;
		double Average_Rain;
		//INPUT
		Scanner input=new Scanner(System.in);
		System.out.println("Input 12 numbers.");
		month1=input.nextDouble();
		month2=input.nextDouble();
		month3=input.nextDouble();
		month4=input.nextDouble();
		month5=input.nextDouble();
		month6=input.nextDouble();
		month7=input.nextDouble();
		month8=input.nextDouble();
		month9=input.nextDouble();
		month10=input.nextDouble();
		month11=input.nextDouble();
		month12=input.nextDouble();
		input.close();
		//CALCULATIONS
		Total_Rain = month1 + month2 + month3 + month4 + month5 + month6 + month7 + month8 + month9 + month10 + month11 + month12;
		Average_Rain = (month1 + month2 + month3 + month4 + month5 + month6 + month7 + month8 + month9 + month10 + month11 + month12)/MONTHS_IN_A_YEAR;
		DecimalFormat numberFormat = new DecimalFormat("#.0");
	    //OUTPUT
	 	System.out.println("The Average is "+numberFormat.format(Average_Rain)+" and the total is "+numberFormat.format(Total_Rain)+".");
	 	System.exit(0);
	}
	//closing bracket for method main
}
//closing bracket for class project04
