package lesson2;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void test1() {
		int[] A = {1,2,3,4,5,6};
		int[] expectedArray = {6,1,2,3,4,5};
		
		CyclicRotation cyclicRotation = new CyclicRotation();
		assertTrue(Arrays.equals(expectedArray, cyclicRotation.rotate(A, 1)));
	}
	
	@Test
	public void test2() {
		int[] A = {1,2,3,4,5,6};
		int[] expectedArray = {4,5,6,1,2,3};
		
		CyclicRotation cyclicRotation = new CyclicRotation();
		assertTrue(Arrays.equals(expectedArray, cyclicRotation.rotate(A, 3)));
		assertTrue(Arrays.equals(expectedArray, cyclicRotation.rotate(A, 9)));
	}
	
	@Test
	public void test3() {		
		CyclicRotation cyclicRotation = new CyclicRotation();
		assertTrue(Arrays.equals(new int[] {1,2,3,4,5,6}, 
				cyclicRotation.rotate(new int[] {1,2,3,4,5,6}, 6)));
	}
	
	@Test
	public void test4() {		
		CyclicRotation cyclicRotation = new CyclicRotation();
		assertTrue(Arrays.equals(new int[] {1,1,1,1}, 
				cyclicRotation.rotate(new int[] {1,1,1,1}, 6)));
	}
	
	@Test
	public void leftShift() {		
		CyclicRotation cyclicRotation = new CyclicRotation();
		assertTrue(Arrays.equals(new int[] {2,3,4,1}, 
				cyclicRotation.rotate(new int[] {1,2,3,4}, -1)));
		assertTrue(Arrays.equals(new int[] {3,4,1,2}, 
				cyclicRotation.rotate(new int[] {1,2,3,4}, -2)));
	}
	
	@Test
	public void emptyArray() {
		int[] A = {};
		int[] expectedArray = {};
		
		CyclicRotation cyclicRotation = new CyclicRotation();
		assertTrue(Arrays.equals(expectedArray, cyclicRotation.rotate(A, 0)));
		assertTrue(Arrays.equals(expectedArray, cyclicRotation.rotate(A, 2)));
	}
}
