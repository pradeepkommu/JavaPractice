import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the string");
		Scanner scan = new Scanner(System.in);
		String newString= scan.nextLine();
		String array1[]= newString.split(" ");
		HashMap<Integer, String> hmap=new HashMap<>();
		for(int i=0;i<array1.length;i++) {
			boolean flag=CheckHashMapforDuplicate(hmap,array1[i]);
			if(flag) {
				hmap.put(i, array1[i]);
			}
		}
		scan.close();
	}

	public static boolean CheckHashMapforDuplicate(HashMap map,String val) {
		for(int j=0;j<map.size();j++) {
			if(map.get(j).equals(val)) {
				System.out.println("Duplicate value :"+val);
				return false;
			}
		}
		return true;
	}

}
