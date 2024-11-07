package junit.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerfromance {
	
	@Test
	void testSortingMethod_Performace() {
		SortingArray array = new SortingArray();
		
		int unsorted[]= {2,5,1};
		
		assertTimeout(Duration.ofMillis(100),()->array.sortingArray(unsorted));
		
	}

}
