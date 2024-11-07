package shapes.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class TestBeforeAfter {
	
	
	public TestBeforeAfter() {
		System.out.println("Test obj is created before test method");
	}
	
	@BeforeAll
	static void beforeall()
	{
		System.out.println("Before All Test");
	}
	
	Shapes shape;
	@BeforeEach
	void init()
	{
		shape =new Shapes();
		System.out.println("Before Test");
	}
	
	@Test
	void testcomputeSquareArea() {
		
		assertEquals(576,shape.computeSquareArea(24));
		System.out.println("Test running🏃‍➡️🏃‍➡️");
	}
	
	@Test
	void testcomputeCircleArea()
	{
		assertEquals(78.5,shape.computeCircleArea(5),"Area of circle Calculation is wrong");
		System.out.println("Test running🏃‍➡️🏃‍➡️");
	}
	
	@AfterEach
	void destroy()
	{
		
		System.out.println("After Test");
	}
	
	
	@AfterAll
	static void afterall()
	{
		System.out.println("After All Test");
	}

}


