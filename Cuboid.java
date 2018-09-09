package org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Mitch
 *
 */
public class Cuboid extends Shape 
{
	// Variable declaration
	private float width = 0;
	private float height = 0;
	private float depth = 0;
	
	// Accessor methods
	public float getWidth()
	{
		return width;
	}
	
	public void setWidth(float width)
	{
		this.width = width;
		
		if (width < 0) 
		{
	        throw new IllegalArgumentException("Width cannot be negative.");
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
	
	public float getDepth()
	{
		return depth;
	}
	
	public void setDepth(float depth)
	{
		this.depth = depth;
		
		if (depth < 0) 
		{
	        throw new IllegalArgumentException("Depth cannot be negative.");
		}
	}
	
	 // Constructor for cuboid object
	public Cuboid(float width, float height, float depth) 
	{
		setWidth(width);
		
		setHeight(height);
		
		setDepth(depth);
	}

	
	 // Surface Area calculation method. Inherited from abstract in Shapes.java
	@Override
	float surfaceArea() 
	{
		float surfaceArea = (width * height) * 6;
		
		return surfaceArea;
	}

	// Volume calculation method. Inherited from abstract in Shapes.java
	@Override
	float volume() 
	{
		float volume = width * height * depth;
		
		return volume;
	}


	// Render method for message boxes. Inherited from abstract in Shapes.java
	@Override
	void render() 
	{
		JFrame frame = new JFrame("Show Message Dialog");
		
		JOptionPane.showMessageDialog(frame, "The surface area of the cube is " + this.surfaceArea() + "\n" +
											 "The volume of the cube is " + this.volume());

	}

}
