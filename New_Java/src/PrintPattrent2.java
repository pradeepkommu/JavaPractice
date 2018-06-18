import java.util.Scanner;

public class PrintPattrent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the Number");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		
		for(int i=1;i<num;i++) {
			for(int j=i;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		scan.close();
		
		
	}

}
