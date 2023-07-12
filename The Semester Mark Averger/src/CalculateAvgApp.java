import java.util.Scanner;
public class CalculateAvgApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the mark of sem1");
		double sem1=scan.nextDouble();
		System.out.println("Enter the mark of sem2");
		double sem2=scan.nextDouble();
		System.out.println("Enter the mark of sem3");
		double sem3=scan.nextDouble();
		System.out.println("Enter the mark of sem4");
		double sem4=scan.nextDouble();
		System.out.println("Enter the mark of sem5");
		double sem5=scan.nextDouble();
		System.out.println("Enter the mark of sem6");
		double sem6=scan.nextDouble();
		System.out.println("Enter the mark of sem7");
		double sem7=scan.nextDouble();
		System.out.println("Enter the mark of sem8");
		double sem8=scan.nextDouble();
		double result=CalculateAvg.calculateAverage( sem1, sem2,  sem3,  sem4,  sem5, sem6,  sem7,  sem8);
		System.out.println("So here is the result="+result);
		scan.close();

	}

}
