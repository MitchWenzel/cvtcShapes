package org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Mitch
 *
 */
public class Cylinder extends Shape {

	// Variable declaration
	private float radius = 0;
	private float height = 0;
	

	// Accessor methods
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
	
	public float getHeight()
	{
		return height;
	}
	
	public void setHeight(float height)
	{
		this.height = height;
		
		if (height < 0) 
		{
	        throw new IllegalArgumentException("Height cannot be negative.");
		}
	}
	
	 // Constructor for cylinder object	
	public Cylinder(float radius, float height) 
	{
		setRadius(radius);
		
		setHeight(height);
	}

	 // Surface Area calculation method. Inherited from abstract in Shapes.java
	@Override
	float surfaceArea() 
	{
		float surfaceArea = (float) ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
		
		return surfaceArea;
	}

	// Volume calculation method. Inherited from abstract in Shapes.java
	@Override
	float volume() 
	{
		float volume = (float) (Math.PI * Math.pow(radius, 2) * height);
		
		return volume;
	}

	// Render method for message boxes. Inherited from abstract in Shapes.java
	@Override
	void render() 
	{
		JFrame frame = new JFrame("Show Message Dialog");
		
		JOptionPane.showMessageDialog(frame, "The surface area of the cylinder is " + this.surfaceArea() + "\n" +
											 "The volume of the cylinder is " + this.volume());

	}

}
