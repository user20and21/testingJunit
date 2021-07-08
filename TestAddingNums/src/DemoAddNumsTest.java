import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoAddNumsTest {
	
	DemoAddNums underTest = new DemoAddNums();
	
		

	@Test
	void test() {
		//given
		int num1 = 50;
		int num2 = 50;
		
		//when 
		int result = underTest.add(num1,  num2);
		
		//then
		assertEquals(100, result);
	}
	
	@Test
	public void arrayTest() {
		char[] expected = {'J', 'u', 'p', 'i', 't', 'e', 'r'};
		char[] actual = "Jupiter".toCharArray();
		
		
		assertArrayEquals(expected, actual, "Arrays should be equal.");
	

}
	
	@Test
	public void deltaDiff() {
		float square = 2*2;
		float rec = 3*2;
		float delta = 2;
		
		assertEquals(square, rec, delta);
	}
	
	@Test
	public void testTrue() {
		
		assertTrue(5 > 4, "5 is greater than 4.");
		
	}
	
	@Test
	public void IsNullNot() {
		Object dog = new Object();
		Object cat = null;
		assertNotNull (dog);
		assertNull (cat);
	}
	
	@Test
	public void toFail() {
		fail("Fail - this method is not done yet.");
	}

	
}
	