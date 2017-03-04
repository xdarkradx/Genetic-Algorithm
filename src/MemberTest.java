import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MemberTest {

	@Test
	public void testConstructor(){
		
		int[] expectedArray = new int[]{0,0,0,0,0,1};
		Member one = new Member("000001");
		assertTrue(one.maxLength == 6);
		assertTrue(one.bitString.equals("000001"));
		for (int i = 0; i < 6; i++){
			assertTrue(one.array[i] == expectedArray[i]);
		}
	}
	
	@Test
	public void testConstructor2(){
		
		int[] expectedArray = new int[]{0,0,0,0,0,1};
		Member one = new Member(1,6);
		assertTrue(one.number == 1);
		assertTrue(one.maxLength == 6);
		assertTrue(one.bitString.equals("000001"));
		for (int i = 0; i < 6; i++){
			assertTrue(one.array[i] == expectedArray[i]);
		}
	}
	
	@Test
	public void testConstructor3(){
		//initiate a member with an array length 6
		Member test = new Member(6);
		test.array = new int[]{0,0,0,0,0,1};
		
		int[] expectedArray = new int[]{0,0,0,0,0,1};
		//initiate a member with the member as a parameter
		Member one = new Member(test);
		assertTrue(one.maxLength == 6);
		assertTrue(one.bitString.equals("000001"));
		for (int i = 0; i < 6; i++){
			assertTrue(one.array[i] == expectedArray[i]);
		}
	}
	
	@Test
	public void testSinglePointTest1() {
		Member one = new Member("000000");
		Member two = new Member("111111");
		Population pop = new Population();
		pop.addMember(one);
		pop.addMember(two);
		one.setArray(one.bitString);
		two.setArray(two.bitString);
		
		Member childOne = new Member(pop.childOneSPC(one, two, 0));
		Member childTwo = new Member(pop.childTwoSPC(one, two, 0));
		
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(one.array[i] == childTwo.array[i]);	
		}
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(two.array[i] == childOne.array[i]);	
		}
	}

	@Test
	public void testSinglePointTest2() {
		Member one = new Member("000000");
		Member two = new Member("111111");
		Population pop = new Population();
		pop.addMember(one);
		pop.addMember(two);
		one.setArray(one.bitString);
		two.setArray(two.bitString);
		
		int[] expectedChildOne = new int[]{0,0,0,0,0,1};
		int[] expectedChildTwo = new int[]{1,1,1,1,1,0};
		
		Member childOne = new Member(pop.childOneSPC(one, two, 5));
		Member childTwo = new Member(pop.childTwoSPC(one, two, 5));
				
		for (int i = 0; i < one.array.length; i++){
			assertTrue(expectedChildOne[i] == childOne.array[i]);	
		}
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(expectedChildTwo[i] == childTwo.array[i]);	
		}
	}
	
	@Test
	public void testSinglePointTest3() {
		Member one = new Member("000000");
		Member two = new Member("111111");
		Population pop = new Population();
		pop.addMember(one);
		pop.addMember(two);
		one.setArray(one.bitString);
		two.setArray(two.bitString);
		
		int[] expectedChildOne = new int[]{0,0,0,1,1,1};
		int[] expectedChildTwo = new int[]{1,1,1,0,0,0};
		
		Member childOne = new Member(pop.childOneSPC(one, two, 3));
		Member childTwo = new Member(pop.childTwoSPC(one, two, 3));
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(expectedChildOne[i] == childOne.array[i]);	
		}
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(expectedChildTwo[i] == childTwo.array[i]);	
		}
	}
	
	@Test
	public void fitnessTest(){
		Population pop = new Population();
		
		Member member = new Member("111111");
		Member target = new Member("111111");
		double fitness = pop.getFitness(member,target);
		assertEquals("expected 1.00",1.0d,fitness, 0.001);
		
		Member member2 = new Member("000000");
		Member target2 = new Member("111111");
		double fitness2 = pop.getFitness(member2,target2);
		assertEquals("expected 0.00", 0.0d, fitness2, 0.001);
		
		
		Member member3 = new Member("000111");
		Member target3 = new Member("111111");
		double fitness3 = pop.getFitness(member3,target3);
		assertEquals("expected 0.50", 0.50d,fitness3, 0.000001);
		
		Member member4 = new Member("011010");
		Member target4 = new Member("111111");
		double fitness4 = pop.getFitness(member4,target4);
		assertEquals("expected 0.50", 0.5d,fitness4, 0.001);
	}
	
	@Test
	public void mutateTest(){
		Population pop = new Population();
	
		Member member = new Member("111111");
		pop.mutate(0, member);
		
		for (int i = 0; i < member.array.length; i++){
			assertTrue(member.array[i] == 1);	
		}
		
		Member member2 = new Member("111111");
		pop.mutate(1.0, member2);
		
		for (int i = 0; i < member.array.length; i++){
			assertTrue(member2.array[i] == 0);	
		}	
	}
	
	@Test
	public void testTwoPointTest1() {
		Member one = new Member("000000");
		Member two = new Member("111111");
		Population pop = new Population();
		pop.addMember(one);
		pop.addMember(two);
		one.setArray(one.bitString);
		two.setArray(two.bitString);
		
		Member childOne = new Member(pop.childOneTPC(one, two, 0, 0));
		Member childTwo = new Member(pop.childTwoTPC(one, two, 0, 0));
	
		for (int i = 0; i < one.array.length; i++){
			assertTrue(one.array[i] == childOne.array[i]);	
		}
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(two.array[i] == childTwo.array[i]);	
		}
	}
	
		@Test
	public void testTwoPointTest2() {
		Member one = new Member("000000");
		Member two = new Member("111111");
		Population pop = new Population();
		pop.addMember(one);
		pop.addMember(two);
		one.setArray(one.bitString);
		two.setArray(two.bitString);
		
		Member childOne = new Member(pop.childOneTPC(one, two, 6, 6));
		Member childTwo = new Member(pop.childTwoTPC(one, two, 6, 6));
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(two.array[i] == childTwo.array[i]);	
		}
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(one.array[i] == childOne.array[i]);	
		}
	}
	
			@Test
	public void testTwoPointTest3() {
		Member one = new Member("000000");
		Member two = new Member("111111");
		
		Member expected1 = new Member("011000");
		Member expected2 = new Member("100111");
		
		Population pop = new Population();
		pop.addMember(one);
		pop.addMember(two);
		one.setArray(one.bitString);
		two.setArray(two.bitString);
		
		Member childOne = new Member(pop.childOneTPC(one, two, 1, 3));
		Member childTwo = new Member(pop.childTwoTPC(one, two, 1, 3));

		
		for (int i = 0; i < one.array.length; i++){
			System.out.print(expected1.array[i]);
		}
		
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(expected1.array[i] == childOne.array[i]);	
		}
		
		for (int i = 0; i < one.array.length; i++){
			assertTrue(expected2.array[i] == childTwo.array[i]);	
		}
	}
}
