package codewars.countofpositivessumofnegatives;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
    	int sum = 0;
    	int amount = 0;
    	for (int i: input) {
			if(i > 0)
			amount++;
			if(i < 0) sum += i;
		}
     	if(input == null || input.length == 0) {
    		return new int[] {};
    	}
     	
     	return new int[] {amount, sum};
    }
}