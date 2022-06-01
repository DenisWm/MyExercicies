package codewars.highestandlowest;

import java.util.stream.Stream;

public class Kata {

	public static String highAndLow(String numbers) {
		var stats = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
		
		return stats.getMax() + " " + stats.getMin();
	  }
	
}
