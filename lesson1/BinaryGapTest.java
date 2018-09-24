package lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGapTest {

	@Test
	public void example1() {
		BinaryGap binaryGap = new BinaryGap();		
		assertEquals(5, binaryGap.getLongestGap(1041));
	}
	
	@Test
	public void example2() {
		BinaryGap binaryGap = new BinaryGap();		
		assertEquals(0, binaryGap.getLongestGap(15));
	}

	@Test
	public void example3() {
		BinaryGap binaryGap = new BinaryGap();		
		assertEquals(0, binaryGap.getLongestGap(32));
	}
	
	@Test
	public void medium1() {
		BinaryGap binaryGap = new BinaryGap();		
		assertEquals(2, binaryGap.getLongestGap(51712));
	}
	
	@Test
	public void medium2() {
		BinaryGap binaryGap = new BinaryGap();	
		assertEquals(3, binaryGap.getLongestGap(561892));
	}
	
	@Test
	public void large1() {
		BinaryGap binaryGap = new BinaryGap();		
		assertEquals(20, binaryGap.getLongestGap(6291457));
	}
}
