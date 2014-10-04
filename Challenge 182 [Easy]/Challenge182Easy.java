/**************************************************
* Challenge #182 [Easy] The Column Conundrum                               
*
* Link to Challenge: http://www.reddit.com/r/dailyprogrammer/comments/2hssx6/29092014_challenge_182_easy_the_column_conundrum/
**************************************************/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Arrays;

class Challenge182Easy{
	
	static String fileName = "c182e-input.txt";
	
	public static void main(String[] args) throws IOException{
		
		printText();
	}
	
	/**************************************************
  	* printText()                                                         
  	*
  	* Inputs: 
  	* Outputs: A file with a the text in columns
  	*
  	* Description: First, it reads the values for the structure and the text 
				   to read in. Then it splits the text into the specified
				   length and the outputs the result into a txt file.
  	**************************************************/
	
	private static void printText() throws IOException{
		
		String text = "";
		String line = "";
		int count = 0;
		int colNum=0, colWidth=0, spaceWidth=0;
		
		File file = new File(fileName);
		FileReader namereader = new FileReader(file);
		BufferedReader in = new BufferedReader(namereader);
		
		// reads in the numbers for formatting and rest of the text
		while((line = in.readLine()) != null){
		
			if(count == 0){
				
				String layoutInfo = line;
				String[] splitInfo = layoutInfo.split(" ");
		
				colNum = Integer.parseInt(splitInfo[0]);
				colWidth = Integer.parseInt(splitInfo[1]);
				spaceWidth = Integer.parseInt(splitInfo[2]);
				
				count = 1;
			}
			else{
				text = text + " " + line;
			}
		}
		
		// splits text into n-char length
		ArrayList<String> parts = new ArrayList<String>();
        int len = text.length();
		
        for (int i=0; i<len; i+=colWidth){
            parts.add(text.substring(i, Math.min(len, i + colWidth)));
        }
		
		String str = "";
		String spaceCreator = padString(str,spaceWidth); 
		
		// outputs result to txt file
		File output = new File("Output.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(output));

		for(int i=1; i<=parts.size(); i++){
			
			int everyOther = i;
			
			for(int j=1; j<=colNum; j++){
			
				if((everyOther * j) < parts.size()){
					bw.write(parts.get(everyOther * j) + spaceCreator);
				}
			}
			
			bw.write("\r\n");
		}
		
		bw.close();
	}
	
	/**************************************************
  	* findCoordinates()                                                         
  	*
  	* Inputs: An empty string, The amount of whitepsace charcters the strings needs to be
  	* Outputs: String with n amount of whitepace
  	*
  	* Description: A helper method, a for loop were it adds a whitespace 'leng' times
  	**************************************************/
	
	private static String padString(String str, int leng) {
        for (int i = str.length(); i <= leng; i++)
            str += " ";
        return str;
    }

}