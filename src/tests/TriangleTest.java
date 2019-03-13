package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import main.Triangle; 

public class TriangleTest
{
	@Test
	public void toTestTriangleIsRightTriangle()
	{
		Triangle triangle =new Triangle(5,4,3);
		assertTrue(triangle.isRight());
	}
	@Test
	public void toTestTriangleIsScaleneTriangle()
	{
		Triangle triangle=new Triangle(4,2,3);
		assertTrue(triangle.isScalene());
	}
	@Test
	public void toTestTriangleIsIsosceles()
	{
		Triangle triangle=new Triangle(3,2,3);
		assertTrue(triangle.isIsosceles());
	}
	@Test
	public void toTestTriangleIsEquilateral()
	{
		Triangle triangle=new Triangle(2,2,2);
		assertTrue(triangle.isEquilateral());
	}
}
