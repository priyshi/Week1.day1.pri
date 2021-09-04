package satsep4;


public class NegativeToPositiveNumber {

	// Initialize an integer with a negative number
	//like, int number = -40;
	// Check if the number is a negative number 
	// Hint : any number that is lesser than zero is a negative number
    //If so, convert the number to a positive numer
    //Print as below
	//"The number -40 is converted to 40"*
	public static void main(String[] args) {
		int number=-40;
		int num;
		if(number<0)
		{
		 num = Math.abs(number);	
		 System.out.println(" Negative is converted into positive "+ num); 
		}
		else {
			System.out.println(+ number + " is a positive number");
		}

	}

}
