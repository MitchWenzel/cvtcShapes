/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Mitch
 *
 */
public class Sphere extends Shape 
{

	private float radius = 0;
	
	public float getRadius()
	{
		return radius;
	}
	
	public void setRadius(float radius)
	{
		this.radius = radius;

		if (radius < 0) 
		{
	        throw new IllegalArgumentException("Radius cannot be negative.");
		}
	}
	
	 // Constructor for sphere object
	public Sphere(float radius) 
	{
		setRadius(radius);
	}

	 // Surface Area calculation method. Inherited from abstract in Shapes.java
	@Override
	float surfaceArea() 
	{
		float surfaceArea = (float) (4 * Math.PI * Math.pow(radius, 2));
		
		return surfaceArea;
	}

	// Volume calculation method. Inherited from abstract in Shapes.java
	@Override
	float volume() 
	{
		float volume = (float) (4 * Math.PI * (Math.pow(radius, 3) / 3));
		
		return volume;
	}

	// Render method for message boxes. Inherited from abstract in Shapes.java
	@Override
	void render() 
	{
		JFrame frame = new JFrame("Show Message Dialog");
		
		JOptionPane.showMessageDialog(frame, "The surface area of the sphere is " + this.surfaceArea() + "\n" +
											 "The volume of the sphere is " + this.volume());

	}

}
