
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mylist[]= {2,5,7,1,8,9,10,55,89,10,66,100};
		
		
		int largestNumber=mylist[0];
		int smallNumber=mylist[0];
		for(int i=0;i<mylist.length;i++) {
			if(smallNumber>mylist[i]) {
				smallNumber=mylist[i];
			}else if(largestNumber<mylist[i]) {
				largestNumber=mylist[i];
			}
		}
		System.out.println("largest Number : "+largestNumber);
		System.out.println("small Number : "+smallNumber);
	}
}
