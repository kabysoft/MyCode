import java.util.ArrayList;
import java.util.List;

import collection.integer;
public class arraylistVsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = new int [] {1,2,3,4};

List<Integer> arrayList = new ArrayList<>();

arrayList.add(5);
arrayList.add(8);
arrayList.add(1,10);
System.out.println(arrayList);

ArrayList<Integer> arraylist1 = new ArrayList<>();

arraylist1.add(9);
arraylist1.add(13);
arraylist1.add(2,16);

System.out.println(arraylist1);
	}

}
