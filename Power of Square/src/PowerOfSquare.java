import java.util.Scanner;
public class PowerOfSquare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int result=PowerOfSquareApp.squareNumber(num);
		System.out.println(result);
		scan.close();
		}
	}


