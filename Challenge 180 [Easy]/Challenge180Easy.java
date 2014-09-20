/**************************************************
* Challenge #180 [Easy] Look'n'Say                                          
*
* Link to Challenge: http://www.reddit.com/r/dailyprogrammer/comments/2ggy30/9152014_challenge180_easy_looknsay/
**************************************************/

import java.util.Scanner;
import java.util.ArrayList;

class Challenge180Easy{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the order number to print out in the Look'n'Say sequence:");
		int nOrder = Integer.parseInt(input.nextLine());
		
		String output = lookNSay(nOrder);
		System.out.println("The " + nOrder + "th order is: " + output.replace("@",""));
	}
	
	/**************************************************
  	* lookNSay()                                                         
  	*
  	* Inputs: The nth order (inputted by the user)
  	* Outputs: The sequence of the nth order requested 
  	*
  	* Description: The for loop checks if the current char and next char 
				   match, if so then we have consecutive numbers so count 
				   increments by 1. If not, then add  value of count and 
				   the current char to newTerm. The process repeats until
				   the length of the current strings sequence has been reached.
				   The '@' symbol helps when reaching the end of the seuqnce to 
				   prevent any out of bound errors.
  	**************************************************/
	
	private static String lookNSay(int nOrder){
		
		ArrayList<String> sequence = new ArrayList<String>();	
		sequence.add("1@");										//add first order of sequence
		int i = 0; 												//keeps track of the current order being processed
		int count = 1; 											//keeps track of how many consecutive numbers in a row
		
		while(i < nOrder){
			
			int seqLength = sequence.get(i).length();			//keeps track of the length of next sequence string which will be calculated upon
			String newTerm = "";								//temporarily stores the result of the new term generated
			
			if(nOrder == 1){
				return sequence.get(0);
			}
			else{

				for(int j=0; j<seqLength-1; j++){
					
					if(sequence.get(i).charAt(j) == sequence.get(i).charAt(j+1) && sequence.get(i).charAt(j+1) != '@'){
						count++;
					}
					else{
						newTerm += Integer.toString(count) + sequence.get(i).charAt(j);
						count = 1;
					}
				}
			}	
			
			sequence.add(newTerm+"@");
			i++;
		}
		
		return sequence.get(nOrder-1);
	}
}