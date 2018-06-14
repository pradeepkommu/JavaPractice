import java.util.Scanner;

public class TypeofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int sideA=scan.nextInt();
		int sideB=scan.nextInt();
		int sideC=scan.nextInt();
		if(sideA==sideB && sideB==sideC) {
			System.out.println("Enterted Triangle is an Equilateral");
		}else if(sideA==sideB || sideB==sideC ||sideC==sideA) {
			System.out.println("Enterted Triangle is an Isosceles");
		}else {
			System.out.println("Enterted Triangle is an Scalene");
		}
		scan.close();
	}

}
