import java.util.Scanner;

public class RoundDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		System.out.println("Enter the Devident");
		int div=scan.nextInt();
		
		int res=num/div;
		System.out.println("Value: "+res);
		scan.close();
	}

}
