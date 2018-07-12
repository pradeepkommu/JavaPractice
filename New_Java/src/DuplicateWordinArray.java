
public class DuplicateWordinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameArr[]= {"cat","bat","cat","catt"};
		for(int i=0; i<nameArr.length;i++) {
			for(int j=i+1; j<nameArr.length;j++) {
				if(nameArr[i].equalsIgnoreCase(nameArr[j])) {
					System.out.println("Duplicate Name : " + nameArr[i]);
				}
			}
		}
	}
}
