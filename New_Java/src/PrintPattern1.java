import java.util.Scanner;

public class PrintPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the Number");
		Scanner scan = new Scanner(System.in);
		int startnum= scan.nextInt();
		
		for(int i=1;i<=startnum;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=startnum-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		scan.close();	
	}
}

/*
1
12
123
1234
123
12
1
*/