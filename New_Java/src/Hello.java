import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the string");
		Scanner scan = new Scanner(System.in);
		String newString= scan.nextLine();
		System.out.println("Hello : "+newString);
		scan.close();
	}
	

}
