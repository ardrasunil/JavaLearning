import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<String> veg1 = new TreeSet<>();
		TreeSet<String> veg2 = new TreeSet<>();
		//veg.add(null); no null elements
		veg1.add("tomato");
		veg1.add("potato");
		veg1.add("onion");
		veg2.add("peas");
		veg2.add("cabbage");
		System.out.println(veg1);//sorted list ascending
		System.out.println(veg1.ceiling("tom"));//prints tomato
		veg1.addAll(veg2);
		System.out.println(veg1);
		Iterator itr = veg1.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(veg1.descendingSet());
		System.out.println(veg1.floor("tomat"));
		System.out.println(veg1.headSet("peas",true));
		System.out.println(veg1.tailSet("peas",true));
		System.out.println(veg1.subSet("onion",true, "potato",true));
		System.out.println(veg1.first());
		System.out.println(veg1.last());
		System.out.println(veg1.size());
		System.out.println(veg1.pollFirst());
		System.out.println(veg1.pollLast());
		
		
	}
}
