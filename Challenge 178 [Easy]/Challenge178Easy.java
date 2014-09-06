/**************************************************
* Challenge #178 [Easy] Transformers: Matrices in Disguise, pt. 1                                                  
*
* Link to Challenge: http://www.reddit.com/r/dailyprogrammer/comments/2f6a7b/9012014_challenge_178_easy_transformers_matrices/
**************************************************/

import java.util.Scanner;

class Challenge178Easy{
	
	public static void main(String[] args){
		
		String command = "";
		double x = 0;
		double y = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter starting co-ordinates, E.g. (1,2):");
		String userInput = input.nextLine();
		
		double[] coOrdinates = splitCoordinates(userInput);
		
		x = coOrdinates[0];
		y = coOrdinates[1];
		
		Transformations t = new Transformations(x,y);
		
		System.out.println("Here are the following commands : \n" +
								"translate(A,B) - translate by (A,B)\n" +
								"rotate(A,B,C) - rotate around (A,B) by angle C (in radians) clockwise\n" +
								"scale(A,B,C) - scale realtive to (A,B) with scale-factor C\n" +
								"reflect(axis) - reflect over the given axis\n" +
								"finish() - end input and print the modified location\n");	
		
		// keeps asking user for commands until user inputs 'finish()'
		while(command != "finish()"){
			
			System.out.print(": ");
			command = input.next().toLowerCase();
			
			double commandX = 0.0, commandY = 0.0, angle = 0.0, sf = 0.0;
			String axis = "";
			
			if(command.contains("translate")){
				
				command = command.replace("translate", "");

				double[] breakdown = new double[2];
				breakdown = splitCoordinates(command);
				
				commandX = breakdown[0];
				commandY = breakdown[1];
				
				command = "translate";
			}
			else if(command.contains("rotate")){
				
				command = command.replace("rotate", "");
				
				double[] breakdown = new double[3];
				breakdown = splitCoordinates(command);
				
				commandX = breakdown[0];
				commandY = breakdown[1];
				angle = breakdown[2];
				
				command = "rotate";
			}
			else if(command.contains("scale")){
				
				command = command.replace("scale", "");

				double[] breakdown = new double[3];
				breakdown = splitCoordinates(command);
				
				commandX = breakdown[0];
				commandY = breakdown[1];
				sf = breakdown[2];
				
				command = "scale";
			}
			else if(command.contains("reflect")){
				
				axis = command.replace("reflect(", "").replace(")", "");
				
				command = "reflect";
			}
			else if(command.contains("finish")){
				command = "finish()";
			}
			else{
				command = "";
			}
			
			// Once, all the required information is gathered by the if statement above
			// the specified command is executed
			switch(command){
				
				case "translate" : 	t.translate(commandX, commandY);
									break;
				case "rotate" : 	t.rotate(commandX, commandY, angle);
									break;
				case "scale" : 		t.scale(commandX, commandY, sf);
									break;
				case "reflect" : 	t.reflect(axis);
									break;
				case "finish()" : 	break;
								
				default : 			System.out.println("Invalid command '" + command + "'");
			}
		}
		
		// Outputs the final result when the user has finished and exits program
		if(command.equals("finish()")){
			System.out.println("Modified location: (" + (int)Math.round(t.getX()) + "," + (int)Math.round(t.getY()) + ")");
			System.exit(0);
		}
	}
	
	/**************************************************
  	* splitCoordinates()                                                         
  	*
  	* Inputs: A string in the form, (x,y) || (x,y,z) 
  	* Outputs: A double array with the first element the x-axis value and the second the y-axis value
  	*
  	* Description: Removes the brackets from the string passed in and converts the values to a double
	*			   to allow calculations to be made.
  	**************************************************/
	
	private static double[] splitCoordinates(String points){
	
		String[] splitString = points.split(",");
		
		// removes opening and closing bracket for each element in 'splitString' array
		for(int i =0; i<splitString.length; i++){
			
			splitString[i] = splitString[i].replace("(", "").replace(")", "");
		}
		
		if(splitString.length == 2){
		
			double[] coOrdinates = new double[2];
			coOrdinates[0] = Double.parseDouble(splitString[0]);
			coOrdinates[1] = Double.parseDouble(splitString[1]);
			return coOrdinates;
		}
		else{
			
			double[] coOrdinates = new double[3];
			coOrdinates[0] = Double.parseDouble(splitString[0]);
			coOrdinates[1] = Double.parseDouble(splitString[1]);
			coOrdinates[2] = Double.parseDouble(splitString[2]);
			return coOrdinates;
		}
	}
}