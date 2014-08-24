/**************************************************
* Challenge #176 [Easy] Spreadsheet Developer - Part 1 : Cell Selection                                                          
*
* For full description as it was to long see: http://www.reddit.com/r/dailyprogrammer/comments/2dvc81/8182014_challenge_176_easy_spreadsheet_developer/
*
* But in essence - 
*		: A formula may have one or more :s (colons) in it. If so, a rectangle of cells is selected. This behaves the same way in Excel. 
*		  Such a selection is called a range. For example, A3:C7 looks like this.
*		: A formula may have one or more &s (ampersands) in it. If so, both the cell/range specified to the left and right are selected. This is 
*		  just a concatenation. For example, A1:B2&C3:D4 looks like this.
*		: A formula may have one ~ (tilde) symbol in it. If so, any cells specified before the tilde are added to the final selection, and any cells 
*         after the tilde are removed from the final selection of cells. For example, if I enter A1:C3~B2 then all cells from A1 to C3 except B2 are selected, which 
*		  looks like this. (This acts like a relative complement of the right hand side in the left hand side.)
*
* Your challenge today will be, given a selection string like A3:C6&D1~B4&B5, print the co-ordinates of all of the selected cells, along with the count of selected cells.
*
* Input: You will be given a selection string like A3:C6&D1~B4&B5 on one line.
*		 : E.g. B1:B3&B4:E10&F1:G1&F4~C5:C8&B2
* 
* Output: First, print the number of cells selected (eg. if 50 cells are selected, print 50.)
*		    Then, on separate lines, print the co-ordinates of each selected cell.
*       : E.g. 29 [1, 0] [1, 2] [1, 3] [1, 4] [1, 5] [1, 6].....[5, 3]
**************************************************/
  
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Challenge176Easy{
	
	//array for the grid
	static String[][] grid = new String[10][10];
	
	//arraylist splitting user input from either side of 'tilde' symbol
	static ArrayList<String> positiveAmp = new ArrayList<String>();
	static ArrayList<String> negativeAmp = new ArrayList<String>();
	
	static ArrayList<String> coordinates = new ArrayList<String>();
	
	public static void main(String[] args){
		
		initialiseGrid();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the cells you want to select (ALL LETTERS MUST BE UPPERCASE):");
		String userInput = input.nextLine();
		
		breakdown(userInput);
		markGrid();
		removeFromGrid();
		
		System.out.println("");
		System.out.println("Cells selected " + statistics());
		System.out.println("");
		
		System.out.println("The co-ordinates :");
		System.out.println("");
		System.out.println(coordinates);
	}
	
	/**************************************************
  	* initialiseGrid()                                                         
  	*
  	* Inputs: None
  	* Outputs: None
  	*
  	* Description: Creates a 10 by 10 grid filled with '-' strings
  	**************************************************/
	
	private static void initialiseGrid(){

		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){

				grid[i][j] = "-";
			}
		}

	}
	
	/**************************************************
  	* breakdown()                                                         
  	*
  	* Inputs: User input from command line (passed from 'main')
  	* Outputs: None
  	*
  	* Description: Breakdown the user input into individual elements 
	*			   which can be, for example, A1:B5 or F4. Also, puts 
	*			   elements into one of two arrays depening on which 
	*			   side of the 'tilde' they appear.
  	**************************************************/
	
	private static void breakdown(String userInput){
		
		//check if user input contains tilde symbol
		if(userInput.toUpperCase().contains("~")){
		
			String[] tilde = userInput.split("~");

			String[] posAmpersand = tilde[0].split("&");
			
			for(int i=0; i<posAmpersand.length; i++){

				positiveAmp.add(posAmpersand[i]);
			}
			
			String[] negAmpersand = tilde[1].split("&");
			
			for(int i=0; i<negAmpersand.length; i++){
			
				negativeAmp.add(negAmpersand[i]);
			}
		}
		else{
			
			String[] posAmpersand = userInput.split("&");
			
			for(int i=0; i<posAmpersand.length; i++){

				positiveAmp.add(posAmpersand[i]);
			}
		}
	}
	
	/**************************************************
  	* markGrid()                                                         
  	*
  	* Inputs: None
  	* Outputs: None
  	*
  	* Description: Iterates through the positive array elements.
	*			   Then gathers the 4 values needed from the element,
	*			   from column, from row, to column, to row. Once, that
	*			   is done, it marks the grid between the two sets of values
	*			   with a '+' symbol to mark it as selected.			   
  	**************************************************/
	
	private static void markGrid(){
		
		int fromCol = 0;
		int fromRow = 0;
		int toCol = 0;
		int toRow = 0;
		
		for(int i=0; i<positiveAmp.size(); i++){
			
			//reset values for each iteration, so last avlue not carried over
			fromCol = 0;
			fromRow = 0;
			toCol = 0;
			toRow = 0;
			
			String[] values = positiveAmp.get(i).split(":");
			
			String column1 = values[0].substring(0,1);
			fromCol = convertLetterToNum(column1) - 1;
			
			if(values[0].length() == 3){
				
				fromRow = Integer.parseInt(values[0].substring(1,3)) - 1; 
			}
			else{
			
				fromRow = Integer.parseInt(values[0].substring(1,2)) - 1;
			}
			
			
			if(values.length > 1){
			
				String column2 = values[1].substring(0,1);
				toCol = convertLetterToNum(column2) - 1;
				
				if(values[1].length() == 3){
					
					toRow = Integer.parseInt(values[1].substring(1,3)) - 1; 
				}
				else{
				
					toRow = Integer.parseInt(values[1].substring(1,2)) - 1;
				}
			}
			
			if(toCol != 0){
			
					for(int j = fromRow; j <= toRow && j<10; j++){
						for(int k = fromCol; k <= toCol && k<10; k++){

							grid[j][k] = "+";							
						}
					}
			}
			else{

				grid[fromRow][fromCol] = "+";
			}
			
		}
	}
	
	/**************************************************
  	* convertLetterToNum()                                                         
  	*
  	* Inputs: The letter of the column
  	* Outputs: None
  	*
  	* Description: This method was taken from a post from
				   on StackOverflow as I didn't know myself
				   how to convert a letter to it's respective number
				   position in the alphabet.
				   Here is the link to the post: http://stackoverflow.com/questions/4262567/convert-letter-to-digits 
  	**************************************************/
	
	private static int convertLetterToNum(String str){
			
		char[] ls = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		int j = 1;
		 
		for(char c: ls) {
			m.put(c, j++);
		}
		
		int i = 0;
		int mul = 1;
		
		for(char c: new StringBuffer(str).reverse().toString().toCharArray()) {
			i += m.get(c) * mul;
			mul *= ls.length;
		}
		
		return i;	
	}
	
	/**************************************************
  	* removeFromGrid()                                                         
  	*
  	* Inputs: None
  	* Outputs: None
  	*
  	* Description: Same as markGrid() except it does it for
	*			   the negative array, and marks the grid with
	*			   '-' (the default value) to represent a 
	*			   de-selection.
  	**************************************************/
	
	private static void removeFromGrid(){
		
		if(!negativeAmp.isEmpty()){
			
			int fromCol = 0;
			int fromRow = 0;
			int toCol = 0;
			int toRow = 0;
			
			for(int i=0; i<negativeAmp.size(); i++){
				
				//reset values after erbery iteration, so last value not carried over
				fromCol = 0;
				fromRow = 0;
				toCol = 0;
				toRow = 0;
				
				String[] values = negativeAmp.get(i).split(":");
				
				String column1 = values[0].substring(0,1);
				fromCol = convertLetterToNum(column1) - 1;
				
				if(values[0].length() == 3){
					
					fromRow = Integer.parseInt(values[0].substring(1,3)) - 1; 
				}
				else{
				
					fromRow = Integer.parseInt(values[0].substring(1,2)) - 1;
				}
				
				
				if(values.length > 1){
				
					String column2 = values[1].substring(0,1);
					toCol = convertLetterToNum(column2) - 1;
					
					if(values[1].length() == 3){
						
						toRow = Integer.parseInt(values[1].substring(1,3)) - 1; 
					}
					else{
					
						toRow = Integer.parseInt(values[1].substring(1,2)) - 1;
					}
				}
				
				if(toCol != 0){
				
					for(int j = fromRow; j <= toRow && j<10; j++){
						for(int k = fromCol; k <= toCol && k<10; k++){

							grid[j][k] = "-";	
						}
					}
				}
				else{
					
					grid[fromRow][fromCol] = "-";
				}
				
			}
			
				
		}
	}
	
	/**************************************************
  	* statistics()                                                         
  	*
  	* Inputs: None
  	* Outputs: The number of elements in the grid with a '+' symbol
  	*
  	* Description: Counts the number of elements in the 
	*			   grid with a '+' symbol and stores the
	*			   co-ordinates of that position in an 
	*			   arraylist.
  	**************************************************/
	
	private static int statistics(){
		
		int count = 0;;
		
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){

				if(grid[i][j].equals("+")){
					
					count++;
					coordinates.add("[" + j + ", " + i + "]");
				}
			}
		}
		
		return count;
	}
}