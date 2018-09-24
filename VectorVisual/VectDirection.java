// Appname: Vector manipulation
// File: 
// Date: 9/24/2018
// Version: 1.0.0
// Author: Stefan Djurkic
// Contact: stefandjurkic@gmail.com
// Purpose: To implement functions in use with a visual representation of a traveling vector
package VectorVisual;

public class VectDirection
{

	// adds 3 squared integers and performs a square root on the sum. This equation gives us the length of a vector
	public static double VectorLen(int x, int y, int z) 
	{
		double lengthV = Math.sqrt(x*x+y*y+z*z); 	
		return lengthV;
	}
	
	// accepts a magnitude/length of a vector and derives the direction of the integer arguments and their combined direction
	public static double VectorCosines(int x, int y, int z, double mag) 
	{
		double[] cosV = new double[] {x,y,z};		
		
		for (int i = 0; i < cosV.length; i++)
		{
		cosV[i] = Math.acos(cosV[i] / Math.abs(mag));// divide the integer by the absolute value of magnitude and apply accosine
		}											  	
		
		double cosX = cosV[0];	
		double cosY = cosV[1];
		double cosZ = cosV[2];
		System.out.print("X angle of direction is: " + (int)Math.toDegrees(cosX) + " degrees \n");  // output from radians to degrees
		System.out.print("Y angle of direction is: " + (int)Math.toDegrees(cosY) + " degrees \n");
		System.out.print("Z angle of direction is: " + (int)Math.toDegrees(cosZ) + " degrees \n");
		
		double directionV = cosX + cosY + cosZ; 	// add up the directions 
		return Math.toDegrees(directionV);      	// output to degrees the sum of the directions
	}

public static void main(String[] args)
{
	int xx = 2;      								// edit xx,yy,zz to get your desired vector magnitude and direction
	int yy = 4;
	int zz = -2;
	double magnitude = VectorLen(xx, yy, zz);	
	double dirV = VectorCosines(xx, yy, zz, magnitude);
    System.out.print ("Magnitude is: " + (float)magnitude + " and additive direction is: " + (float)dirV + " degrees");
}
}