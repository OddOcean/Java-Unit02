//Aidan Weygandt 9/16/2021
//Purpose of Program:
//Computes the Mortgage Payment, Total Payments, and Total Interest of a loan. 


public class Lab02B_Weygandt{
	public static void main(String[] args){
		System.out.println("Lab02B, Mortgage Calculator\n");

		double principal  = 250000.0;
		double annualRate = 0.0425;
      double monthlyRate = annualRate/12;
		double years   = 30.0;
      double hundred = 100;
      double monthlyPayment = ((monthlyRate*Math.pow((1+monthlyRate), years*12))/(Math.pow((1+monthlyRate), years*12)-1))*principal; //uses monthly payment equation to find payment

		System.out.println("Principal: $     " + principal);//prints the numbers for the interest amounts, total payment/interest and starting variables
      System.out.println("Annual Rate:     " + annualRate*100 + "%");
      System.out.println("Number of Years: " + years);
      System.out.println("Monthly Payment: $" + Math.round(monthlyPayment* hundred)/ hundred);
      System.out.println("Total Payment:   $" + Math.round(monthlyPayment*years*12* hundred)/ hundred);
      System.out.println("Total Interest:  $" + Math.round(((monthlyPayment*years*12)-principal)* hundred)/ hundred);
	}
}