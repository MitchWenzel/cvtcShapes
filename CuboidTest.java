package org.cvtc.shapes;

import static org.junit.Assert.*;
import org.junit.Test;

public class CuboidTest {

	Cuboid Cube = new Cuboid(5, 5, 5);
	
	@Test
	public void testSurfaceArea()
	{
		assertEquals(5, Cube.getHeight(), 1);
		assertEquals(5, Cube.getWidth(), 1);
		assertEquals(5, Cube.getDepth(), 1);
		
		assertEquals(150, Cube.surfaceArea(), 1);
	}

	@Test
	public void testVolume() 
	{		
		assertEquals(125, Cube.volume(), 1);
	}

	@Test
	public void testGetWidth() 
	{
		assertEquals(5, Cube.getWidth(), 1);
	}

	@Test
	public void testGetHeight() 
	{
		assertEquals(5, Cube.getHeight(), 1);
	}

	@Test
	public void testGetDepth() 
	{
		assertEquals(5, Cube.getDepth(), 1);
	}

	@Test
	public void testCuboid() 
	{
		assertEquals(5, Cube.getWidth(), 1);
		assertEquals(5, Cube.getHeight(), 1);
		assertEquals(5, Cube.getDepth(), 1);

		assertNotNull(Cube.getWidth());
		assertNotNull(Cube.getHeight());
		assertNotNull(Cube.getDepth());
	}

}
