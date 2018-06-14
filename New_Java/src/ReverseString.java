import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the String to be reversed..");
		Scanner scan=new Scanner(System.in);
		String stringEntered=scan.next();
		String revString="";
		for(int i=stringEntered.length()-1;i>=0;i--) {
			revString=revString+stringEntered.charAt(i);
		}
		System.out.println("Reverse String :"+revString);
		System.out.println("Reverse String :"+revString);
		scan.close();
	}
}
