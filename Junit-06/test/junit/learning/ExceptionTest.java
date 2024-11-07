package junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class ExceptionTest {

	@Test
	void testSortingArray_Exception()
	{
//		try {
//			SortArray array = new SortArray();
//			// int unsorted[] = null; 
//			 int unsorted[] = {2,1,5};
//			int sortedArray[] = array.sortingArray(unsorted);
//			
//			for(int ele : sortedArray){
//				System.out.print(ele + " ");
//			}
//
//			System.out.println("statement below Exception");
//			fail(); // failing explicitly
//		}
//		catch(NullPointerException e) {
//			System.out.println("Exception genrated");	
//		}
		
		SortArray array = new SortArray();
		 int unsorted[] = null;
		 
		assertThrows(NullPointerException.class,()->array.sortingArray(unsorted)); // if there is null pointer exception it will pass, otherwise failed
		
	}

}
