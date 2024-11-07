package shapes.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	@Test
	void testcomputeSquareArea() {
		Shapes shape = new Shapes();
		
		assertEquals(576,shape.computeSquareArea(24));
	}
	
	@Test
	void testcomputeCircleArea()
	{
		Shapes shape = new Shapes();
		assertEquals(78.5,shape.computeCircleArea(5),"Area of circle Calculation is wrong");
	}
	

}
