import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String args[]){  
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		set.add("Lakshmi");
		//no duplicate items. 
		//set.add(null); throws exception nullpointer
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}  
}
