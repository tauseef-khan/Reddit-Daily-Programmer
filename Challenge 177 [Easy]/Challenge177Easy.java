/**************************************************
* Challenge #177 [Easy] Quicksort                                                       
*
* Link to Challenge: http://www.reddit.com/r/dailyprogrammer/comments/2ejl4x/8252014_challenge_177_easy_quicksort/
**************************************************/

import java.util.Scanner;
import java.util.ArrayList;

class Challenge177Easy{
	
	public static void main(String[] args){
		
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter a line of jumbled integers (E.g. 1 56 6 3 9 4 7 8 2)");
		String userInput = input.nextLine();
		
		String[] strInput = userInput.split(" ");
		ArrayList<Integer> toSort = new ArrayList<Integer>();
		
		for(int i=0; i<strInput.length; i++){
			
			toSort.add(Integer.parseInt(strInput[i]));
		}
		
		System.out.println("This is the sorted list : " + quicksort(toSort));
	}
	
	/**************************************************
  	* quicksort()                                                         
  	*
  	* Inputs: User input which in the form of an arraylist of integers
  	* Outputs: The sorted sequence of the arraylist passed in (ascending order)
  	*
  	* Description: Checks if arraylist is empty or has one 
				   element in which case already sorted so it 
				   just returns it. Then finds the pivot and sorts 
			       elements into the correct arraylist. After that, it 
				   makes a recursive call to the method with the 
				   arraylists which are greater and smaller then the 
				   pivot to be passed as a parameter. Finally, returns 
				   the final list.
  	**************************************************/
	
	private static ArrayList<Integer> quicksort(ArrayList<Integer> toSort){
		
		if(toSort.size() == 0 || toSort.size() == 1){
			return toSort;
		}
		
		int midpoint = toSort.size() / 2;
	
		int pivot = toSort.get(midpoint);
		
		ArrayList<Integer> S = new ArrayList<Integer>();
		ArrayList<Integer> P = new ArrayList<Integer>();
		ArrayList<Integer> G = new ArrayList<Integer>();
		
		for(int i = 0; i < toSort.size(); i++){
			
			if(toSort.get(i) < pivot){
				S.add(toSort.get(i));
			}
			else if(toSort.get(i) > pivot){
				G.add(toSort.get(i));
			}
			else{
				P.add(toSort.get(i));
			}
		}
		
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		
		finalList.addAll(quicksort(S));
		finalList.addAll(P);
		finalList.addAll(quicksort(G));
		
		return finalList;
	}
}