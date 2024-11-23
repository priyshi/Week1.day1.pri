package satsep4;

public class Primeornot {

	// Declare an int Input and assign a value 13
	// Declare a boolean variable flag as false
	// Iterate from 2 to half of the input
		// Divide the input with each for loop variable and check the remainder
		// Set the flag as true when there is no remainder			
		// break the iterator
	// Check the flag (Provide a condition)
		// Print 'Prime' when the condition matches
		// Print 'Not a Prime' when the condition doesn't match
	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		for (int i = 2; i <= input/2; i++) {
			if(input%i==0) {
				flag=true;
				 break;
			}
		}
			if(!flag) {
				System.out.println(+input+" is prime number");
			}
			else {
				System.out.println(+input +" is not a prime number");
			
			}
	}

}
