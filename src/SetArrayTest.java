import static org.junit.Assert.*;

import org.junit.Test;


public class SetArrayTest {

	@Test
	public void GeneralTest() 
	{
		String s = "100001";
		int[] a = {1, 0, 0, 0, 0, 1};
		Member member = new Member(s);
		member.setArray(s);
		for (int i = 0; i < s.length(); i++){
			assertTrue(member.array[i] == a[i]);
		}
	
		s = "111111";
		int[] a1 = {1, 1, 1, 1, 1, 1};
		member = new Member(s);
			member.setArray(s);
		for (int i = 0; i < s.length(); i++){
			assertTrue(member.array[i] == a1[i]);
		}
	}
}

