package codewars.squareeverydigit;

public class SquareDigit {

	public int squareDigits(int n) {
		StringBuilder number = new StringBuilder();
		char[] nums = Integer.toString(n).toCharArray();
		for (int i = 0; i < nums.length; i++) {
			int p = Character.digit(nums[i], 10);
			number.append(p*p);
		}
		
		return Integer.parseInt(number.toString());
	  }
	
	public static void main(String[] args) {
		System.out.println(new SquareDigit().squareDigits(9119));
		
	}
}