
public class DuplicateNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numArr[]= {1,2,5,7,1,3,7,2,9};
		for(int i=0; i<numArr.length;i++) {
			for(int j=i+1; j<numArr.length;j++) {
				if(numArr[i]==numArr[j]) {
					System.out.println("Duplicate number : " + numArr[i]);
				}
			}
		}

	}

}
