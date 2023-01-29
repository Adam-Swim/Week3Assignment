package com.promineotech;

public class Week3Assignment {

	public static void main(String[] args) {
		

		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//    * Programmatically subtract the value of the first element in the array from the value in the last 
		//    element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		//    * Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//    * Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
		int difference = ages[ages.length-1] - ages[0];
		System.out.println(difference);
		
		int addedAge = 68;
		
		int[] ages2 = new int[ages.length+1];
		System.arraycopy(ages, 0, ages2, 0, ages.length);
		ages2[ages.length] = addedAge;
		
		ages = ages2;
		
		for (int age : ages) {
			System.out.println(age);
		}
		
		int sum = 0;
		
		
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
			
		}
		double average = (double) sum / ages.length;
		System.out.println(average);
		
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//    * Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		//    * Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sum1 = 0;
		for (String name : names) {
			sum1 += name.length();
		}
		double average1 = (double) sum1 / names.length;
		System.out.println(average1);
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		
		
		//3. How do you access the last element of any array?
		
		System.out.println(names[names.length-1]);
		
		
		//4. How do you access the first element of any array?
		
		System.out.println(names[0]);
		
		
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add 
		//   the length of each name to the nameLengths array.
		
		int[] nameLengths = new int [names.length]; 
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sum2 = 0;
		for (int j = 0; j < nameLengths.length; j++) {
			sum2 += nameLengths[j];
		}
		System.out.println(sum2);
		
		
		System.out.println(repeatWord("Adam", 7)); //7.

		System.out.println(concatfullName("Adam", "Salt")); //8.
		
		int[] numbers = {1, 5, 8, 13, 35, 21};
		System.out.println(isGreaterThan100(numbers));  //9.
		
		
		double[] doubles = {12.3, 31.8, 29.9, 67.6, 54.1, 99.0};
		System.out.println(arrayAverage(doubles));     //10.
		
		
		
		double[] Team1 = {88.6, 67.8, 98.1, 84.5, 87.8};
		double[] Team2 = { 72.1, 66.7, 89.4, 77.2, 69.4};
		System.out.println(whichArrayIsAverageIsGreater(Team1, Team2));//11.
		
		
		System.out.println(willBuyDrink(true, 10.50)); //12.
		System.out.println(needsOilChanged(4150, 4)); //13.
		
	} // end of main
	
	
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
		//   (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	  public static String repeatWord(String word, int n) {
		 String repeatedWord = "";
		 for (int i = 0; i < n; i++) {
			 repeatedWord += word;
		 }
		 return repeatedWord;
	 } // end of method
		
		
		
		
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String concatfullName(String firstName, String lastName) {
		String fName = firstName + " " + lastName;
		return fName;
	}
	  
	  
	  
	  
	  
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean isGreaterThan100(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum > 100;
	}
	
	
	
	
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
	public static double arrayAverage(double[] averages) {
		double sum = 0;
		for (double average : averages) {
			sum += average;
		}
		return sum / averages.length;
	}
	
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

	public static boolean whichArrayIsAverageIsGreater(double[] arrayOne, double[] arrayTwo) {
		double sum1 = 0;
		double sum2 = 0;
		for (double array : arrayOne) {
			sum1 += array;
		}
		for (double array : arrayTwo) {
			sum2 += array;
		}
		
		return sum1 > sum2;
	}
	
	
	
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true	;
		} else {
		return false;
	}
	
	}
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

	public static boolean needsOilChanged(double miles, int months) { // create a method that takes two values , miles and months 
		if (miles >= 3000 || months >= 4) {                             // and checks to see if miles are greater than 3000 OR months
			return true;                                              // are greater than 3, returns a boolean value of true. If not returns false.
		} else {
			return false;
		}
	}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}// end of class
