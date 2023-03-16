import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("Ayush");  
		s.push("Garvit");  
		s.push("Amit");  
		s.push("Ashish");  
		s.push("Garima");  
		s.pop();
		s.pop();
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
