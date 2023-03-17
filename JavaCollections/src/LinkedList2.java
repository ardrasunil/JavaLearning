import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
	public static <E> void main(String[] args) {
		
		LinkedList<String> fruits1 = new LinkedList<>();
		LinkedList<String> fruits2 = new LinkedList<>();
		
		//adding elem to list1
		fruits1.add("Mango");
		fruits1.add("Orange");
		fruits1.add("Apple");
		fruits1.add("Banana");
		System.out.println(fruits1);
		
		//adding elem to list2
		fruits2.add("Grape");
		fruits2.add("Strawberry");
		System.out.println(fruits2);
		
		//adding list2 to 1
		fruits1.addAll(fruits2);
		System.out.println(fruits1);
		
		//insert1 elem in fruits 2
		fruits2.add(1, "Banana");
		System.out.println(fruits2);
		
		LinkedList<String> fruits3 = new LinkedList<>();
		fruits3.add("PassionFruit");
		fruits3.add("Pineapple");
		fruits1.addAll(1,fruits3);
		System.out.println(fruits1);
		
		//adding first and last element
		fruits2.addFirst("Mango");
		fruits2.addLast("Anar");
		System.out.println(fruits2);
		
		fruits1.remove("Orange");
		System.out.println(fruits1);
		fruits1.remove(0);
		System.out.println(fruits1);
		fruits1.removeAll(fruits3);
		System.out.println(fruits1);
		
		//to clear
		fruits3.clear();
		System.out.println(fruits3);
		
		//to reverse using descending iterator
		Iterator<String> i = fruits1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
