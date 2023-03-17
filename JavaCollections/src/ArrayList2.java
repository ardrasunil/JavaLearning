import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> name2 = new ArrayList<String>();
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		name.add("Ardra");
		name.add(1, "Lakshmi");
		name2.add("Sanjana");
		name2.add("Anjana");
		name.addAll(name2);
		name.add("Ardra");
		
		//using iterator traversing
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		name2.clear();
		Iterator<String> itr2 = name2.iterator();
		boolean flag = false;
		while(itr2.hasNext()) {
			flag = true;
			System.out.println(itr2.next());
		}
		if(!flag) {
			System.out.println("List 2 is empty");
		}
		
		System.out.println(name.get(2));
		System.out.println("list 1 is empty :"+ name.isEmpty());
		System.out.println("list 2 is empty :"+ name2.isEmpty());
		System.out.println("Last Occurence of Ardra :"+ name.lastIndexOf("Ardra"));
		System.out.println("First Occurence of Ardra :"+ name.indexOf("Ardra"));
		
		name.remove("Ardra");
		//using for each loop traversing
		for(String str : name) {
			System.out.println(str);
		}
		
		try {
		System.out.println(name.get(2));
		name.set(1, "Sanjana P");
		System.out.println(name.get(5));
		
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(name.get(1));
		}
		
		//sort the list
		System.out.println("\nSorted list");
		Collections.sort(name);
		for(String str : name) {
			System.out.println(str);
			
		}
		
		//reverse order
		System.out.println("\nReverse order using listiterator");
		ListIterator<String> list = name.listIterator(name.size());
		while(list.hasPrevious()) {
			String str = list.previous();
			System.out.println(str);
		}
		
		//using forEach() method
		System.out.println("\nusing forEach() method");
		name.forEach(a->{
			System.out.println(a);
		});
		
		System.out.println("\nforEachRemaining() loop");
		Iterator<String> itr3 = name.iterator();
		itr3.forEachRemaining(a->{
			System.out.println(a);
		});
		
	}

}
