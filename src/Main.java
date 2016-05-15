import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
//		Power digit sum
//		Problem 16
//		What is the sum of the digits of the number 21000?
		BigInteger n = new BigInteger("2");
		n = n.pow(1000);
		System.out.println(sumOfNum(n));

	}
	
	public static int sumOfNum(BigInteger n){
		String temp = n.toString();
		int sum = 0;
		for(int i = 0; i < temp.length();i++){
			sum = sum + Character.getNumericValue(temp.charAt(i));
		}
		return sum;
	}

}
