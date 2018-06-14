import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the string need to be tested");
		Scanner scan = new Scanner(System.in);
		String newString= scan.nextLine();
		String reverseString="";
		for(int i=newString.length()-1;i>=0;i--) {
			reverseString=reverseString+newString.charAt(i);
		}
		if(reverseString.equalsIgnoreCase(newString)) {
			System.out.println("Given string is a Palimdrome");
		}else
		{
			System.out.println("Given string is not a Palimdrome");
		}
		scan.close();
	}

}
