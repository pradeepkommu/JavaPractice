import java.util.Scanner;

public class PrintPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the Number");
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		for(int i=num;i>=1;i--) {
			int k=num-i;
			//Print Space
			for(int l=0;l<k;l++) {
				System.out.print(" ");
			}
			//Print Number
			for(int j=i;j>=1;j--) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		for(int i=2;i<=num;i++) {
			int k=num-i;
			for(int l=0;l<k;l++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
