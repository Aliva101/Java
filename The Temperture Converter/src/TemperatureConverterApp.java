import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of fahrenheit");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperature=new TemperatureConverter();
		double c=temperature .convertFahrenheitToCelsius(fahrenheit);
		System.out.println(c);
	}

}
