import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		//creating an arraylist
		ArrayList<String> names = new ArrayList<String>();
		
		//adding elements using add()
		names.add("Ardra");
		names.add("Sanjana");
		names.add("Elizabeth");
		names.add("Darsana");
		
		//iterator interface
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
