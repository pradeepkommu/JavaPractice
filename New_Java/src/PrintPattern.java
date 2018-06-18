import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the Number");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		String temp="";
		
		for(int i=1;i<=num;i++) {
			temp=temp+" "+i;
			System.out.print(temp);
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
12345
123456
*/