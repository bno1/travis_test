import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
	Main main;
	
	@Before
	public void before() {
		main = new Main();
	}
	
	@Test
	public void testAdd() {
		assertEquals(4, main.add(2, 2));
	}

	@Test
	public void testMult() {
		assertEquals(4, main.mult(2, 2));
	}
}
