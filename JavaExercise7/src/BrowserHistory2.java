import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BrowserHistory2 {

	HashMap<String, ArrayList<String>> urlHashMap = new HashMap<>();
	LinkedHashMap<String, ArrayList<String>> urlLinkedHashMap = new LinkedHashMap<>();
	TreeMap<String, ArrayList<String>> urlTreeMap = new TreeMap<>();
	
	public void visit(String url) {
		String[] splitUrl = url.split("\\.");
		String extension = "." + splitUrl[splitUrl.length-1];
		if(urlHashMap.containsKey(extension)) {
			(urlHashMap.get(extension)).add(url);
		}
		else {
			urlHashMap.put(extension, new ArrayList<>());
			(urlHashMap.get(extension)).add(url);
		}
		
		if(urlLinkedHashMap.containsKey(extension)) {
			(urlLinkedHashMap.get(extension)).add(url);
		}
		else {
			urlLinkedHashMap.put(extension, new ArrayList<>());
			(urlLinkedHashMap.get(extension)).add(url);
		}
		
		if(urlTreeMap.containsKey(extension)) {
			(urlTreeMap.get(extension)).add(url);
		}
		else {
			urlTreeMap.put(extension, new ArrayList<>());
			(urlTreeMap.get(extension)).add(url);
		}
	}
	
	public void fetchHistory(String extension) {
		System.out.println("Hash Map: ");
		System.out.println(urlHashMap.get(extension));
		System.out.println("Linked Hash Map: ");
		System.out.println(urlLinkedHashMap.get(extension));
		System.out.println("Tree Map: ");
		System.out.println(urlTreeMap.get(extension));
	}
	
	public void deleteHistory(String extension) {
		urlHashMap.remove(extension);
		urlLinkedHashMap.remove(extension);
		urlTreeMap.remove(extension);
	}
	
	public void size(String extension) {
		System.out.println("Hash Map Size: ");
		System.out.println((urlHashMap.get(extension)).size());
		System.out.println("Linked Hash Map Size: ");
		System.out.println((urlLinkedHashMap.get(extension)).size());
		System.out.println("Tree Map Size: ");
		System.out.println((urlTreeMap.get(extension)).size());
	}
	
	public void search(String word) {
		
		System.out.println("Urls found in hashmap :");
		for(Map.Entry<String, ArrayList<String>> urlList : urlHashMap.entrySet())
		{
			for(String url : urlList.getValue()) {
				if(url.contains(word)) {
					System.out.println(url);
				}
			}
		}
		
		System.out.println("\nUrls found in linkedHashmap :");
		for(Map.Entry<String, ArrayList<String>> urlList : urlLinkedHashMap.entrySet())
		{
			for(String url : urlList.getValue()) {
				if(url.contains(word)) {
					System.out.println(url);
				}
			}
		}
		
		System.out.println("\nUrls found in TreeMap :");
		for(Map.Entry<String, ArrayList<String>> urlList : urlTreeMap.entrySet())
		{
			for(String url : urlList.getValue()) {
				if(url.contains(word)) {
					System.out.println(url);
				}
			}
		}
		
	}
	
	
}
