import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.add("Ravi");  
		names.add("Vijay");  
		names.add("Ravi");  
		names.add("Ajay");  
		Iterator<String> itr=names.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
}
