public class PracticeProblem{
	static int lettersToFive(String str, char letter){
		/*
		Using a while loop, output how many letters into the word it takes to find 5 instances of the character.
		If there are no instances of the character, return -1. 

		What if there is more than one, but less than five instances?
		*/
		int index = 0;
		int count = 0;
		while(count < 5 && index < str.length()){
			if(str.charAt(index++) == letter){
				count++;
			}
		}
		if(count == 0){
			return -1;
		}else if(count >= 5){
			return index;
		}

		return 0x3f3f3f3f;
	}

	static int countLetter(String str, char letter){
		int count = 0;
		for(int index = 0; index < str.length(); ++index){
			if(str.charAt(index) == letter)
				count++;
		}
		return count;
	}

	static int oddSum(int num1, int num2){
		int upper = Math.max(num1, num2);
		int lower = Math.min(num1, num2);
		if((lower&1) == 0) ++lower;
		int sum = 0;
		for(int num = lower; num <= upper; num += 2){
			sum += num;
		}
		return sum;
		/* Alternatively
		return (((upper+1)/2)*((upper+1)/2) - (lower/2)*(lower/2)); */
	}


	public static void main(String args[]){}
	
}
