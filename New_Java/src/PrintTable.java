import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner scan=new Scanner(System.in);
		int table=scan.nextInt();		
		for(int i=1;i<=10;i++) {
			System.out.println(table+"x"+i+"="+table*i);
		}
		scan.close();
	}

}
