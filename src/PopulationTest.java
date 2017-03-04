import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PopulationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPopulationConstructor() {
		Population pop = new Population("111111", 6);
		
		assertEquals("number of members expect: 6", 6, pop.population.size(), 0);
		assertEquals("111111", pop.target.bitString);
		
		
	}

}
