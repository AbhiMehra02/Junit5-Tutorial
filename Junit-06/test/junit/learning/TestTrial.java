package junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestTrial {

	void testArrays()
	{
		int []expected = {2,4,6,8};
		
		//	actual = {2,4,6,8};
				
		//	actual  = {4,8,6,2}; // array contains differ at index[0]
				
		//	actual  = {2,4,6,8 ,10}; // array length are differ
		
		int []actual  = {4,8,6,2};
		Arrays.sort(actual);      
		
		assertArrayEquals(expected,actual); // it will pass sort array
		
//		assertEquals(expected,actual);  // assertion failure builder for all , 
	}
}
