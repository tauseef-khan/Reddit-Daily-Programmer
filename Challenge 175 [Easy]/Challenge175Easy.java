 /**************************************************
  * Challenge #175 [Easy] Bogo!                                                         
  *
  * A bogo sort is a purposefully inefficient algorithm 
  * for sorting a sequence. Today we will be using this 
  * for strings to test for equality
  * 
  * Bogo-Sort Wikipedia article: http://en.wikipedia.org/wiki/Bogo-sort
  *
  * Input and Output: Given a scrambled string N and another string M. 
  * You must sort N so that it matches M. After it has been sorted, it 
  * must output how many iterations it took to complete the sorting.
  **************************************************/

import java.util.Scanner;
import java.util.Random;

 class Challenge175Easy{
	
	public static void main(String[] args){
		
		// The two Scanner objects ask the user for the jumbled and sorted word
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the jumbled word:");
		String jumbled = input.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the sorted word:");
		String sorted = input2.nextLine();
		
		int iterations = bogo(jumbled, sorted);
		
		System.out.println(iterations + " iterations");
		
	}
	
	/**************************************************
  	* bogo()                                                         
  	*
  	* Inputs: Two strings inputted by the user
  	* Outputs: The number of iterations it took to sort the jumbled word
  	*
  	* Description: Converts the two strings into a char array, then calls
	*			   the method 'compare' to see if they match, if it does it returns
	*			   the number of iterations it took to match, otherwise 
	*			   calls the 'shuffle' method and checks again
  	**************************************************/
	
	private static int bogo(String jumbled, String sorted){
		
		int count = 1;
		char[] charJumbled = jumbled.toLowerCase().toCharArray();
		char[] charSorted = sorted.toLowerCase().toCharArray();
		
		while(!compare(charJumbled, charSorted)){
			
			charJumbled = shuffle(charJumbled);
			count++;
		}
		
		return count;
	}
	
	/**************************************************
  	* compare()                                                         
  	*
  	* Inputs: The sorted and jumbled char arrays
  	* Outputs: Boolean value, do the two arrays have the same contents in the same order
  	*
  	* Description: Loops through each element of both arrays to see if they have the same values
  	**************************************************/
	
	private static boolean compare(char[] charJumbled, char[] charSorted){
		
		for(int i=0; i<charJumbled.length; i++){
			
			if(charJumbled[i] != charSorted[i]){
				return false;
			}
		}
		return true;
	}
	
	/**************************************************
  	* shuffle()                                                         
  	*
  	* Inputs: The jumbled char array
  	* Outputs: A random ordered, no repetitions of the jumbled char array
  	*
  	* Description: This method I got it from another source as I was'nt too sure how to 
	*			   jumble up an array, but now I have understood the code and shall implement 
	*			   my own from now on. I made a few minor adjusments to the code for my needs.
				   Source: http://www.leepoint.net/notes-java/algorithms/random/random-shuffling.html
  	**************************************************/
	
	private static char[] shuffle(char[] array){
	
		Random rgen = new Random();  // Random number generator
		char[] jumble = array;  

		//--- Shuffle by exchanging each element randomly
		for (int i=0; i<jumble.length; i++) {
		
			int randomPosition = rgen.nextInt(jumble.length);
			char temp = jumble[i];
			jumble[i] = jumble[randomPosition];
			jumble[randomPosition] = temp;
		}	
		
		return jumble;
	}

}