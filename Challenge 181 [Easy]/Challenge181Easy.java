/**************************************************
* Challenge #181 [Easy] Basic Equations                                      
*
* Link to Challenge: http://www.reddit.com/r/dailyprogrammer/comments/2h5b2k/09222014_challenge_181_easy_basic_equations/
**************************************************/

import java.util.Scanner;

class Challenge181Easy{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first linear equation (format: y=ax+b): ");
		String e1 = input.nextLine().replace("y=",""); 
			
		System.out.println("Enter the second linear equation (format: y=ax+b): ");
		String e2 = input.nextLine().replace("y=","");
		
		String result = findCoordinates(e1,e2);
		
		System.out.println("(" + result + ")");	
	}
	
	/**************************************************
  	* findCoordinates()                                                         
  	*
  	* Inputs: 2 linear equations w/o 'y='
  	* Outputs: The co-ordinates of the point of intersection 
  	*
  	* Description: It converts the two equations passed in to a
	*			   double array with 2 elements. The first is the 'a' value
	*			   and the second is the 'c' value. Then calculates the LHS ('a' values)
	*			   and RHS ('c' values). Finally, works out x and y and returns them.
	*			   If two equations do not have a point of intersection, the string 
	*			   "infinity, infinity" is returned.
  	**************************************************/
	
	private static String findCoordinates(String e1, String e2){
		
		String[] strE1 = e1.split("x");
		String[] strE2 = e2.split("x");
		
		double[] equation1 = new double[2];
		double[] equation2 = new double[2];
		
		//in case the equation is in form y=ab (E.g. y=5x), makes it easier to assign zero to second element to carry out calculations
		if(strE1.length == 1){
			equation1[0] = Double.parseDouble(strE1[0]);
			equation1[1] = 0.0;
		}
			
		//in case the equation is in form y=ab (E.g. y=5x), makes it easier to assign zero to second element to carry out calculations
		if(strE2.length == 1){
			equation2[0] = Double.parseDouble(strE2[0]);
			equation2[1] = 0.0;
		}
		
		//iterate as normal if equation is in full form y=ab+c
		if(strE1.length == 2){

			for(int i=0; i<equation1.length; i++){
				equation1[i] = Double.parseDouble(strE1[i]);
			}
		}
			
		//iterate as normal if equation is in full form y=ab+c
		if(strE2.length == 2){

			for(int i=0; i<equation2.length; i++){
				equation2[i] = Double.parseDouble(strE2[i]);
			}
		}
				
		double LHS = equation1[0] - equation2[0]; 
		double RHS = equation2[1] - equation1[1];
			
		double x = RHS / LHS;
		double y = (equation1[0] * x) + equation1[1];
		
		return Double.toString((x*100)/100) + ", " + Double.toString((y*100)/100);
	}
}