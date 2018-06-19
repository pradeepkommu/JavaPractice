
public class NumberWithSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		String temp;
		temp="";
		while(num>0) {
			int divident=num%10;
			num=num/10;
			temp=temp+" "+divident;
		}
		StringBuilder input= new StringBuilder();
		input.append(temp);
		System.out.println(input.reverse());

	}

}
