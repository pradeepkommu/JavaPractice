import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the Number rows");
		Scanner scan = new Scanner(System.in);
		int row= scan.nextInt();
		System.out.println("Please enter the Number column");
		int col= scan.nextInt();
		int counter=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
		scan.close();
	}
}
