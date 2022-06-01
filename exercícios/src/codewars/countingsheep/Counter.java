package codewars.countingsheep;

public class Counter {

	public int countSheeps(Boolean[] arrayOfSheeps) {
		if(arrayOfSheeps == null || arrayOfSheeps == null) return 0;
		int n = 0;
	    for(boolean i : arrayOfSheeps) {
	    	if(i) {
	    		n++;
	    	}
	    }
	    return n;
	  }
}
