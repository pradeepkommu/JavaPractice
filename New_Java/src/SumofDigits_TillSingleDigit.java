import java.util.Scanner;

public class SumofDigits_TillSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number");
		Scanner scan = new Scanner(System.in);
		int newNumber= scan.nextInt();
		if(newNumber>0) {
			System.out.println(FindSumDigit(newNumber));
		}else {
			System.out.println("You entered -ve value");
		}
		
		scan.close();
	}

	public static int FindSumDigit(int number)
	{
		if(number<10) {
			return number;
		}else {
			int sum=0;
			while(number!=0) {
				sum=sum+number%10;
				number=number/10;
			}
			return FindSumDigit(sum);
		}	
	}
}
