package learning.Junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class CalcTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Calc c = new Calc();
		int actual =c.divide(10, 5);
		int expectedResult =2;
		assertEquals(expectedResult,actual);
	}

}
