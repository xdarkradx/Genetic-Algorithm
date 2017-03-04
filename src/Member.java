public class Member {
	public int number;  //this value is only used for generating a random number to create a Member
	public String bitString;
	public int maxLength;
	public int[] array = new int []{};
	
	//default constructor
	Member(){
		number = 0;
		bitString = "";
		maxLength = 0;
	}
	
	//Initiates a Member with a length to be used by the Cross Over operations
	Member(int maxLength){
		this.array = new int[maxLength];
	}
	
	//Tested and Passed
	Member(int number, int maxLength){
		this.number = number;
		this.bitString = getBitString(number);
		this.maxLength = maxLength;
		setArray(getBitString(number));
	}
	
	//Tested and Passed (number not set and its ok)
	Member(String s){
		this.bitString = s;
		this.maxLength = s.length();
		setArray(s);
	}
	
	//Member passed has just an array set
	//(number not set and its ok)
	Member(Member m){
		this.array = m.array;
		this.bitString = getString(m.array);
		this.maxLength = m.array.length;
	}
	
	public String getString(int[] ar){
		String bitString = "";
		for (int i = 0; i < ar.length; i++){
			bitString = bitString + ar[i];
		}
		return bitString;
	}
	
	public void setString(String s){
		this.bitString = s;
	}
	
	public void setArray(String s) {
		//s.toCharArray();
		int[] i = new int[s.length()];
		
		for (int j = 0; j < s.length(); j++)
		{
			i[j] = Integer.parseInt(s.substring(j, j+1));
		}
		this.array = i;
	}
	
	public void setNumber(int[] bits){
		int num = 0;
		for (int i = bits.length; i > 0; i--){
			num = (int) (num + Math.pow(2,bits[i]));
		} 
		this.number = num;
	}

	//implement convert number to a bitstring
	static String getBitString(int num) {
		String bitString = Integer.toBinaryString(num);
		while (bitString.length() < 6) 
		{
			bitString = "0" + bitString;
		}
		return bitString;
	}
	

}
