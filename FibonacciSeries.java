package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0, secNum = 1, sum, range = 8;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 3; i <= range; i++) {
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
		}
	}
}
