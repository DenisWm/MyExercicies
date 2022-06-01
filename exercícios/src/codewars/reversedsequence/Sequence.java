package codewars.reversedsequence;

/*
 * Build a function that returns an array of integers from n to 1 where n>0.
 * Example : n=5 --> [5,4,3,2,1]
 * https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
 */
public class Sequence {

	public static int[] reverse(int n){
		int[] array = new int[n];
		int j = 0;
		for (int i = n; i > 0; i--) {
			array[j] = i;
			j++;
		}
	    return array;
	  }
}
