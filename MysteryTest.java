import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MysteryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMystery1() {
		Mystery one = new Mystery("an object");
		assertEquals(1, one.mystery1(2, 3));
		assertEquals(5, one.mystery1(10, 5));
		assertEquals(9, one.mystery1(9,9));
		assertEquals(3, one.mystery1(6,9));
		assertEquals(12, one.mystery1(60, 72));
		assertEquals(1, one.mystery1(11, 1));
		assertEquals(2, one.mystery1(2, 6));
		assertEquals(11, one.mystery1(66, 55));
		assertEquals(1, one.mystery1(53, 30));
		assertEquals(49, one.mystery1(-49,49));
	}
	@Test
	public void testMystery2() {
		Mystery two = new Mystery("another object");
		assertEquals(2.41, two.mystery2(1, -2, -1), 0.01);
		assertEquals(0.67, two.mystery2(5, 4,-5), 0.01);
		assertEquals(4.79, two.mystery2(-1, 5 ,-1), 0.01);
		assertEquals(0.61, two.mystery2(1, 1 ,-1), 0.01);
		assertEquals(1.32, two.mystery2(7 ,-10, 1), 0.01);
		assertEquals(2.11, two.mystery2(-3, 4 , 5), 0.01);
		assertEquals(1.0, two.mystery2(2, 3 ,1), 0.1);
		assertEquals(0.42, two.mystery2(4, 3, -2), 0.01);
		assertEquals(0.19, two.mystery2(-3, -1 , -2), 0.01);
		
	}
	

}
