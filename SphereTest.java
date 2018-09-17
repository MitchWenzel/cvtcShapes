package org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SphereTest {

	Sphere Sphe = new Sphere(3);
	
	@Test
	public void testSurfaceArea() 
	{
		assertEquals(3, Sphe.getRadius(), 1);

		assertEquals(113.097, Sphe.surfaceArea(), 1);
	}

	@Test
	public void testVolume() 
	{
		assertEquals(3, Sphe.getRadius(), 1);

		assertEquals(113.097, Sphe.volume(), 1);
	}

	@Test
	public void testGetRadius() 
	{
		assertEquals(3, Sphe.getRadius(), 1);
	}

	@Test
	public void testSphere() 
	{
		assertEquals(3, Sphe.getRadius(), 1);
		
		assertNotNull(Sphe.getRadius());
	}

}
