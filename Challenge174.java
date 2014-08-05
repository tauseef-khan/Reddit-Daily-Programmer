 /**************************************************
  * Challenge #174 [Easy] Thue-Morse Sequences                                                          
  *
  * The Thue-Morse sequence is a binary sequence (of 0s and 1s) 
  * that never repeats. It is obtained by starting with 0 and successively 
  * calculating the Boolean complement of the sequence so far. It turns 
  * out that doing this yields an infinite, non-repeating sequence. This 
  * procedure yields 0 then 01, 0110, 01101001, 0110100110010110, and so on
  * 
  * Thue-Morse Sequences Wikipedia article: http://en.wikipedia.org/wiki/Thue%E2%80%93Morse_sequence
  *
  * Output: Output the 0 to 6th order Thue-Morse Sequences.
  **************************************************/

import java.util.ArrayList;

class Challenge174{
	
	public static void main(String[] args){

		ArrayList<String> a = new ArrayList<String>();
		a.add("0");

		System.out.println("nth\tSequence");
		System.out.println("========================================================================");

		//The for loop reads the ith element of the arraylist
		//Then calls method 'append' which returns a string which adds it to the end of 'read'
		//Result is stored in the the arraylist

		for(int i=0; i<=6; i++){

			String read = a.get(i);
			String addToArrayList = read + append(read);	
			a.add(addToArrayList);
		}

		print(a);
	}

	/**************************************************
  	* append()                                                         
  	*
  	* inputs: (element of the arraylist currently being read)
  	* outputs: (the additional sequence for the next order)
  	*
  	* description: (loops the string 'read' char by char to determine the additonal sequence to append to the string 'read')
  	**************************************************/

	private static String append(String read){

		String toAppend = "";

		for(int i=0; i<read.length(); i++){

			if(read.charAt(i) == '0')
				toAppend += "1";
			else
				toAppend += "0";

		}

		return toAppend;
	}

	private static void print(ArrayList<String> a){

		for(int i=0; i<a.size(); i++){

			System.out.println(i + "\t" + a.get(i));
		}
	}
}