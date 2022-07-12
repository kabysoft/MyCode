import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String, Long> map = new HashMap<>();
		
map.put("a", 1000000636360000l);
map.put("b", 20l);
map.put("c", 30l);

System.out.println("Size of the map is "  + map.size());
System.out.println(map);
System.out.println("a");

if (map.containsKey("a")) {
	long a = map.get("a");
	System.out.println("Value for key a:"  +a);
	
}
	}
}


