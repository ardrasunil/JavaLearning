import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	public static  void main(String[] args) {
		
		HashSet<String> vehicles1 = new HashSet<>();
		vehicles1.add("car");
		vehicles1.add("bus");
		vehicles1.add("jeep");
		vehicles1.add("bike");
		vehicles1.add("scooter");
		
		System.out.println("using iterator");
		Iterator itr = vehicles1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//ignoring duplicate elem
		vehicles1.add("bike");
		vehicles1.add("truck");
		System.out.println(vehicles1);
		
		//to remove
		vehicles1.remove("bike");
		System.out.println(vehicles1);
		
		//addall and remove all
		HashSet<String> vehicles2 = new HashSet<>();
		vehicles2.add("bike");
		vehicles2.add("autorickshaw");
	
		//vehicles2.add("Bike");
		System.out.println(vehicles2);
		vehicles1.addAll(vehicles2);
		System.out.println(vehicles1);
		vehicles1.removeAll(vehicles2);
		System.out.println(vehicles1);
		vehicles1.removeIf(str->str.contains("jeep"));
		System.out.println(vehicles1);
		vehicles2.clear();
		System.out.println(vehicles2);
		
		//
		
	}

}
