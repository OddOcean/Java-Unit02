//Aidan Weygandt 09/13/2021
//Purpose of Program: 
//Computes hours, minutes, seconds and milliseconds in 10000123 Milisecond 


public class Lab02A_Weygandt{
	public static void main(String[] args){
      int milli = 10000123;//total milliseconds
      
		System.out.println("Lab02A Calculate Hours, Minutes, Seconds, and Mili-seconds in 10000123 Miliseconds\n");
      System.out.println("Starting Milli-seconds: " + milli);//prints total milliseconds
      System.out.println("Hours:                  " + milli/1000/60/60%60);//converts total milliseconds to corresponding time measurment and prints remainder using modulus
      System.out.println("Minutes:                " + milli/1000/60%60);
      System.out.println("Seconds:                " + milli/1000%60);
      System.out.println("Milliseconds:           " + milli%1000);
	}//closes main
}//closes class
