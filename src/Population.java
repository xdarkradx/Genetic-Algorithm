import java.util.ArrayList;
import java.util.Random;

public class Population {

	ArrayList<Member> population = new ArrayList<Member>();
	Member target = new Member();
	
	Population(){		
	}
	
	//Need to add error handling, so that the target doesn't get randomly generated in the
	//creation of a population
	//Need a "bitString --> integer" to do this, too late to write it now
	Population(String targetString, int numberOfMembers){
		target.setArray(targetString);
		target.setString(targetString);
		
		int bitStringSize = targetString.length();
		Random rng = new Random();
		int maxInt = (int) Math.pow(2, bitStringSize);
		
		for (int i = 0; i < numberOfMembers; i++){
			int random = rng.nextInt(maxInt);
			Member e = new Member(random, bitStringSize);
			if (e.bitString.equals(targetString)){
				i--;
			} else {
			  population.add(e);
			}
		}
		
	}
	

	
	//add and remove might not be needed, might be easier to just have them here instead of using the arrayList methods
	//might want to add something to them.
	public void addMember(Member e){
		population.add(e);
	}
	
	public void removeMember(Member e){
		population.remove(e);
	}
	
	
	//Single point cross over for child 1
	public Member childOneSPC(Member one, Member two, int crossIndex){
		Member child = new Member(one.array.length);
		
		for (int i = 0; i < crossIndex; i++){
			child.array[i] = one.array[i];		
		}
		for (int i = crossIndex; i < one.array.length; i++ ){
			child.array[i] = two.array[i];
		}
		return child;
	}
	
	//Single point cross over for child 2
	public Member childTwoSPC(Member one, Member two, int crossIndex){
		Member child = new Member(one.array.length);
		
		for (int i = 0; i < crossIndex; i++){
			child.array[i] = two.array[i];		
		}
		for (int i = crossIndex; i < one.array.length; i++ ){
			child.array[i] = one.array[i];
		}
		return child;
	}
	
	//two point cross over for child 1
	public Member childOneTPC(Member one, Member two, int crossIndex1, int crossIndex2){
		Member child = new Member(one.array.length);
		int c1, c2;
		if (crossIndex1 < crossIndex2){
			c1 = crossIndex1;
			c2 = crossIndex2;
		}
		else{
			c1 = crossIndex2;
			c2 = crossIndex1;
		}
		
		
		for (int i = 0; i < c1; i++){
			child.array[i] = one.array[i];		
		}
		for (int i = c1; i < c2; i++ ){
			child.array[i] = two.array[i];
		}
		for (int i = c2; i < one.array.length; i++){
			child.array[i] = one.array[i];
		}
		return child;
	}
	
	//two point cross over for child 2
	public Member childTwoTPC(Member one, Member two, int crossIndex1, int crossIndex2){
		Member child = new Member(one.array.length);
		
		for (int i = 0; i < crossIndex1; i++){
			child.array[i] = two.array[i];		
		}
		for (int i = crossIndex1; i < crossIndex2; i++ ){
			child.array[i] = one.array[i];
		}
		for (int i = crossIndex2; i < one.array.length; i++){
			child.array[i] = two.array[i];
		}
		return child;
	}
	
	//k-point cross over
	public Member childOneKPC(Member one, Member two, int[] crosses){
		Member child = new Member(one.array.length);
		return child;
	}
	
	public Member childTwoKPC(Member one, Member two, int[] crosses){
		Member child = new Member(one.array.length);
		return child;
	}
	//possibly should be in the population
	//the fitness function will change depending on the type of population
	public double getFitness(Member member, Member target){
		double fitness = 0;
		double totalRight = 0;
		
		for (int i = 0; i < member.array.length; i++){
			if(member.array[i] == target.array[i]){
				totalRight = totalRight + 1;
			}
		}
		fitness = totalRight/member.array.length;
		return fitness;
	}
	
	//randomly mutate based on a mutation rate.
	// not sure how to test outside of edge cases (0 = no change) (1 = all bits flipped)
	public Member mutate(double rate, Member member){

		Random random = new Random();

		String mutantString = "";

		for(int i = 0; i < member.bitString.length(); i++){

		if (random.nextDouble() <= rate){

		if (member.array[i] == 0){

		mutantString = mutantString + "1";

		} else{

		mutantString = mutantString + "0";

		}

		} else {

		mutantString = mutantString + String.valueOf(member.array[i]);

		}

		}

		Member mutant = new Member(mutantString);

		mutant.setArray(mutantString);

		return mutant;

		}
	//helper function for the cross overs to switch bits
	public void switchBits(Member one, Member two, int index){
		int temp = one.array[index];
		one.array[index] = two.array[index];
		two.array[index] = temp;		
	}
	
}
