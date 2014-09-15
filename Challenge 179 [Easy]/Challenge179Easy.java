/**************************************************
* Challenge #179 [Easy] You make me happy when clouds are gray...scale                                               
*
* Link to Challenge: http://www.reddit.com/r/dailyprogrammer/comments/2ftcb8/9082014_challenge_179_easy_you_make_me_happy_when/
**************************************************/

import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

class Challenge179Easy{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file path to an image to convert grayscale: ");
		String filePath = input.nextLine();
		
		convertToGS(filePath);
	}
	
	/**************************************************
  	* convertToGS()                                                         
  	*
  	* Inputs: The path to the image
  	* Outputs: None
  	*
  	* Description: Iterates through each pixel in the image to carry out the following:
	*					- Retrieve red, green and blue values of that pixel
	*					- Work out the average value of the red, green and blue values of that pixel
	*					- Create a new instance of Color with the RGB values taking the average value as parameters
	*					- Changing the colour of that pixel to the the new instance of Color, avg
	*			   Finally, it saves the image in the current file directory and calls it 'image_grayscale'.
  	**************************************************/
	
	private static void convertToGS(String filePath){
		
		try{
			
			BufferedImage image = ImageIO.read(new File(filePath));
			
			for(int w=0; w<image.getWidth(); w++){
				
				for(int h=0; h<image.getHeight(); h++){
					
					Color c = new Color(image.getRGB(w,h));
					int averageColor = (c.getRed() + c.getGreen() + c.getBlue()) / 3;
					
					Color avg = new Color(averageColor, averageColor, averageColor);
					image.setRGB(w,h,avg.getRGB());
				}
			}
		
			ImageIO.write(image, "jpg", new File("image_grayscale.jpg"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}