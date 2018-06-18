import java.util.Scanner;

public class PrintPatternReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the Number");
		Scanner scan = new Scanner(System.in);
		//int startnum= scan.nextInt();
		int startnum= 5;
		
		
		for(int i=1;i<=startnum;i++) {
			for(int j=startnum;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}


/*
654321
54321
4321
321
21
1
*/
