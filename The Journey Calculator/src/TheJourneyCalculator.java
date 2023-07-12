import java.util.Scanner;
public class TheJourneyCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Calculate Distance");
		System.out.println("Enter the speed");
		double speed=scan.nextDouble();
		System.out.println("Enter the time");
		double time=scan.nextDouble();
		TheJourneyCalcApp theJourneyCalcApp=new TheJourneyCalcApp();
		double result=theJourneyCalcApp.calculateDistance(speed,time);
		System.out.printf("%.2f",result);
		scan.close();

	}

}
