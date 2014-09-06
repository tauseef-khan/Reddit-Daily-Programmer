class Transformations{
	
	private double x = 0.0;
	private double y = 0.0;
	
	public Transformations(double x, double y){
		
		// starting co-ordinates passed in
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	/**************************************************
  	* translate()                                                         
  	*
  	* Inputs: The co-ordinates inside the 'translate()' command
  	* Outputs: None
  	*
  	* Description: Simple adds the respective co-ordinates passed in,
	*			   to current co-ordinates.
  	**************************************************/
	
	public void translate(double moveX, double moveY){
		
		x = x + moveX;
		y = y + moveY;
	}
	
	/**************************************************
  	* reflect()                                                         
  	*
  	* Inputs: The axis (x or y)
  	* Outputs: None
  	*
  	* Description: Changes the relevant co-ordinate depending on what axis is passed.
  	**************************************************/
	
	public void reflect(String axis){
	
		if(axis.toLowerCase().equals("x")){
			y = y * -1;
		}
		else if(axis.toLowerCase().equals("y")){
			x = x * -1;
		}
		else{
			System.out.println("Please enter either 'X' or 'Y'");
		}
	}
	
	/**************************************************
  	* scale()                                                         
  	*
  	* Inputs: The co-ordinates inside the 'scale()' command and the scale factor
  	* Outputs: None
  	*
  	* Description: Finds the difference between the respective co-ordinates and then it's
	*			   multiplied by the scale-factor. The result is then added to the co-ordinates
	* 			   inside the 'scale()' command to get the correct values.
  	**************************************************/
	
	public void scale(double scaleX, double scaleY, double c){
		
		x = (x - scaleX) * c + scaleX;
		y = (y - scaleY) * c + scaleY;
	}
	
	/**************************************************
  	* rotate()                                                         
  	*
  	* Inputs: The co-ordinates inside the 'rotate()' command and the angle (in radians)
  	* Outputs: None
  	*
  	* Description: First adjusts the co-ordinates in the 'rotate()' command as if we
	*			   were going to rotate from the origin. Then using the rotation matrix
	*			   finds the points after the rotation from the origin. Finally, adds 
	*			   the co-ordinate values back to the answers from rotation matrix to get
	*			   the correct values from the original starting point.
  	**************************************************/
	
	public void rotate(double rotateX, double rotateY, double angle){
		
		double xFromOrigin = x - rotateX;
		double yFromOrigin = y - rotateY;
		
		angle *= -1;
		
		double rotatedX = (xFromOrigin * Math.cos(angle)) - (yFromOrigin * Math.sin(angle)); 
		double rotatedY = (xFromOrigin * Math.sin(angle)) + (yFromOrigin * Math.cos(angle));
		
		x = rotatedX + rotateX;
		y = rotatedY + rotateY;
	}
}