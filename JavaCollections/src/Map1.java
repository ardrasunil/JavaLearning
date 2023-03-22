import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(12,"Ardra");
		m.put(13,"Arya");
		m.put(14,"Arpith");
		
		for(Map.Entry map : m.entrySet()) {
			System.out.println(map.getKey()+" : "+map.getValue());
		}
		System.out.println(m.entrySet());
		
		m.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		System.out.println("\n");
		m.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		System.out.println("\n");
		m.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		System.out.println("\n");
		m.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}
}
