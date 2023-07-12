import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int result1=subtractNumbers( 20,5);
		System.out.println("result1"+result1);
		int result2=multiplyNumbers( 4,5);
		System.out.println("result2"+result2);
		double result3=divideNumbers(20,4);
		System.out.format("%.2f",result3);
		System.out.println();
		int result4=findRemainder( 10,3);
		System.out.println("result4"+result4);

	}
	public static int subtractNumbers(int num1, int num2) {
		return num2-num1;
	}
	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2) {
		return num1 / num2;
	}
	public static int findRemainder(int num1, int num2) {
		return num1 % num2;
	}
}