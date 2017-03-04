import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GetBitStringTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testValues() {
		int num = 0;
		String s = "000000";	
		Member member = new Member(s);
		
		assertTrue(member.getBitString(num).equals("000000"));
		num = 1;
		assertTrue(member.getBitString(num).equals("000001"));
		num = 16;
		assertTrue(member.getBitString(num).equals("010000"));
		num = 63;
		assertTrue(member.getBitString(num).equals("111111"));
	}
}
