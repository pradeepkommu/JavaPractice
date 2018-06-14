import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number to be reversed");
		Scanner scan = new Scanner(System.in);
		int newNumber= scan.nextInt();
		int sumofNumber=0;
		while(newNumber!=0) {
			sumofNumber=sumofNumber+newNumber%10;
			newNumber=newNumber/10;
		}
		System.out.println("Reverse of a number is :"+sumofNumber);
		scan.close();
	}

}
