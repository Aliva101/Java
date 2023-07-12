import java.util.Scanner;
public class CubeMystrey {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int result=cubeNumber(num);
		System.out.println(result);
		}
	public static int cubeNumber(int num) {
		return num*num*num;
	}

}
