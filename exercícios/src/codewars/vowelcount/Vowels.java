package codewars.vowelcount;

public class Vowels {

	  public static int getCount(String str) {
	    int vowelsCount = 0;
	    char[] string = str.toCharArray();
	    
	    for (int i = 0; i < string.length; i++) {
			switch(string[i]) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				vowelsCount++;
			}
		}
	    return vowelsCount;
	  }

	}
