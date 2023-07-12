import java.util.Scanner;
public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("String1");
		String str1=scan.next();
		System.out.println("String12");
		String str2=scan.next();
		String result=joinStrings( str1, str2);
		System.out.println(result);
	}
	public static String joinStrings(String str1, String str2) {
		
		return str1 + str2;
	}	
}
