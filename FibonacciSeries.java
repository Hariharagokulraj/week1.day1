package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i=8;
		int sum;
		int	firstNum = 0;
		int	secNum = 1;		
		for(i=0;i<8;i++) {
			System.out.println(firstNum);
		sum= firstNum + secNum;
		firstNum=secNum;
		secNum=sum;
				}
	}
}