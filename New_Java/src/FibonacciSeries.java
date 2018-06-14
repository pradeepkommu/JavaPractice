import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Number of Fibonancci series to be printed: ");
		Scanner scan= new Scanner(System.in);
		
		int EndNumber=scan.nextInt();
		
		int x=0,y=1,z=0;
		System.out.print(x+",");
		System.out.print(y+",");
		for(int i=2;i<EndNumber;i++)
		{
			z=x+y;
			x=y;
			y=z;
			/*if(z>=EndNumber) {
				break;
			}*/
			System.out.print(z+",");
		}
		scan.close();
		
	}

}
