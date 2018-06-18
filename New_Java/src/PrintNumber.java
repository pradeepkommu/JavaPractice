import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the Number");
		Scanner scan = new Scanner(System.in);
		int actulaNumber= scan.nextInt();
		System.out.println("Please enter the no of numbers to be print");
		int noOfNumbers= scan.nextInt();
		int counter=0;
		for(int i=1;i<=noOfNumbers;i++) {
			System.out.println(counter+1);
			if(i==noOfNumbers) {
				break;
			}
			System.out.println(actulaNumber-counter);
			counter++;
			i++;
		}
		scan.close();
	}
}
