package codewars.isograms;

/*
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
 * Implement a function that determines whether a string that contains only letters is an isogram. 
 * Assume the empty string is an isogram. Ignore letter case.
 * 
 * Example: (Input --> Output)
 * "Dermatoglyphics" --> true
 * "aba" --> false
 * "moOse" --> false (ignore letter case)
 */
public class isogram {

    public static boolean  isIsogram(String str) {
    	char[] string = str.toLowerCase().toCharArray();
    	boolean i = false;
    		for (int j = 1; j < string.length + 1; j++) {
				if(string[j - 1] == string[j] || string[j] == string[j + 1]) {
					i = false;
				} else {
					i =  true;
				}
			}
    		return i;
    } 
}
