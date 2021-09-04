package satsep4;

public class FibonacciSeries {
	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

			// Print first number
			
			// Iterate from 1 to the range
			
			// add first and second number assign to sum

			// Assign second number to the first number

			// Assign sum to the second number
			
			// print sum

	public static void main(String[] args) {
		int range=8;
		int firstNum=0;
		int secNum=1;
		int sum;
		
	
		for (int i = 1; i<=range; i++) {
			System.out.println(+firstNum);
			sum = firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			}
		
		
	}

}
