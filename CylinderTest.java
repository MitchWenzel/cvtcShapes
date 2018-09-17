package org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {

	Cylinder Cylin = new Cylinder(1, 2);
	
	@Test
	public void testSurfaceArea() 
	{
		assertEquals(1, Cylin.getRadius(), 1);
		assertEquals(2, Cylin.getHeight(), 1);
		
		assertEquals(18.85, Cylin.surfaceArea(), 1);
	}

	@Test
	public void testVolume() 
	{
		assertEquals(1, Cylin.getRadius(), 1);
		assertEquals(2, Cylin.getHeight(), 1);

		assertEquals(6.283, Cylin.volume(), 1);
	}

	@Test
	public void testGetRadius() 
	{
		assertEquals(1, Cylin.getRadius(), 1);
	}

	@Test
	public void testGetHeight() 
	{
		assertEquals(2, Cylin.getHeight(), 1);
	}

	@Test
	public void testCylinder() 
	{
		assertEquals(1, Cylin.getRadius(), 1);
		assertEquals(2, Cylin.getHeight(), 1);

		assertNotNull(Cylin.getRadius());
		assertNotNull(Cylin.getHeight());
	}

}
