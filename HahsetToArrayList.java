import java.util.HashSet;

public class HahsetToArrayList {

	private static char[] element;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> h_set = new HashSet<String>();
h_set.add("Red");
h_set.add("Green");
h_set.add("Black");
h_set.add("White");
h_set.add("Pink");
h_set.add("Yelow");

System.out.println("Original hashset est " + h_set);

String[] new_array = new String[h_set.size()];
h_set.toArray(new_array);
System.out.println("Array elements are");
for(String element:new_array) {
	System.out.println(element);
	
	


	}

}
}