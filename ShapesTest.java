/**
 * 
 */
package org.cvtc.shapes;
import java.util.Scanner;

/**
 * @author Mitch
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Creating cube variables for user input
		float userCubeWidth;
		float userCubeHeight;
		float userCubeDepth;
		
		// Creating cylinder variables for user input
		float userCylinderRadius;
		float userCylinderHeight;
		
		// Creating sphere variables for user input
		float userSphereRadius;
		
		
		// Instantiating Shape objects
		Cuboid cuboidTest = new Cuboid(0, 0, 0);
		Cylinder cylinderTest = new Cylinder (0, 0);
		Sphere sphereTest = new Sphere (0);
		
		
		// Instantiating new Scanner object
		Scanner userInput = new Scanner(System.in);
		
		
		// Prompting for user input for cube
		System.out.print("Enter the width of the cube: ");
		userCubeWidth = userInput.nextFloat();
		cuboidTest.setWidth(userCubeWidth);
		
		System.out.print("Enter the height of the cube: ");
		userCubeHeight = userInput.nextFloat();
		cuboidTest.setHeight(userCubeHeight);
		
		System.out.print("Enter the depth of the cube: ");
		userCubeDepth = userInput.nextFloat();
		cuboidTest.setDepth(userCubeDepth);
		
		
		// Prompting for user input for cylinder
		System.out.print("Enter the radius of the cylinder: ");
		userCylinderRadius = userInput.nextFloat();
		cylinderTest.setRadius(userCylinderRadius);
		
		System.out.print("Enter the height of the cylinder: ");
		userCylinderHeight = userInput.nextFloat();
		cylinderTest.setHeight(userCylinderHeight);
		
		
		// Prompting for user input for sphere
		System.out.print("Enter the radius of the sphere: ");
		userSphereRadius = userInput.nextFloat();
		sphereTest.setRadius(userSphereRadius);
		
		
		// Printing cube results of user input
		cuboidTest.render();
		
		// Printing cylinder results of user input
		cylinderTest.render();
		
		// Printing sphere results of user input
		sphereTest.render();
		
		
		// Closing resource for userInput
		userInput.close();
	}

}
