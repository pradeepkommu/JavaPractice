import java.util.Scanner;

public class Celsius_2_Fahrenheit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Temparatue in Fahrenheit");
		Scanner scan=new Scanner(System.in);
		int fahrenheit=scan.nextInt();	
		double celsius;
		celsius=(fahrenheit-31)/(1.8);
		System.out.println("Temparature in Celsius :"+celsius);
		scan.close();
	}
}
