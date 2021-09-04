package satsep4;

public class CheckPositiveOrNegativeNumber {

	    //Initialize a number, say, int number= 35;
	    //If a number is positive, print "The number is positive"
	    //If a number is negative, print "The number is negative"
	    //If it nether negative nor positive, print as "The number is neither positive nor negative"
	public static void main(String[] args) {
		int number = 35;
	if(number>0)
	{
		System.out.println(+number + " is positive");
	}
	
	else if(number<0) {
		
		System.out.println(+number + " is negative");
	}
	else {
		System.out.println(+number + " is neither positive nor negative");
	}

	}

}
