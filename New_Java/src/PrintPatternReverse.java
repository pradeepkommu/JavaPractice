import java.util.Scanner;

public class PrintPatternReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the Number");
		Scanner scan = new Scanner(System.in);
		int startnum= scan.nextInt();
		for(int i=startnum;i>=0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		scan.close();
	}

}
