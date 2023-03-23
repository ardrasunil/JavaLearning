import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BrowserHistory {

	//List types
	private List<String> urlArrayList = new ArrayList<>();
	private List<String> urlLinkedList = new LinkedList<>();
	
	//Set types
	private Set<String> urlHashSet = new HashSet<>();
	private Set<String> urlLinkedHashSet = new LinkedHashSet<>();
	private Set<String> urlTreeSet = new TreeSet<>();
	
	//creating a temp array
	private List<String> tempList ;
	//to set url
	public void visit(String url) {
		urlArrayList.add(url);
		urlLinkedList.add(url);
		urlHashSet.add(url);
		urlLinkedHashSet.add(url);
		urlTreeSet.add(url);
	}
	
	//to sort
	public void sort() {
		
		//sort the list types
		List<String> sortedArrayList = new ArrayList<>(urlArrayList);
		Collections.sort(sortedArrayList);
		System.out.println("Sorted URL Array List: " + sortedArrayList);
		List<String> sortedLinkedList = new LinkedList<>(urlLinkedList);
		Collections.sort(sortedLinkedList);
		System.out.println("Sorted URL Linked List: " + sortedLinkedList);
		
		//sort the set type using List
		List<String> sortedHashSet = new ArrayList<String>(urlHashSet);
		Collections.sort(sortedHashSet);
		System.out.println("Sorted URL HashSet:" + sortedHashSet);
		//sort the set type using TreeSet
		Set<String> sortedLinkedHashSet = new TreeSet<String>(urlLinkedHashSet);
		System.out.println("Sorted URL LinkedHashSet " + sortedLinkedHashSet);
		//treeSet is already sorted
		System.out.println("Sorted url TreeSet: " + urlTreeSet );
		
	}
	
	//to delete by url
	public void deleteHistory(String url) {
		urlArrayList.remove(url);
		urlLinkedList.remove(url);
		urlHashSet.remove(url);
		urlLinkedHashSet.remove(url);
		urlTreeSet.remove(url);
		
	}
	
	//to delete by index
	public void deleteHistory(int index) {
		urlArrayList.remove(index);
		urlLinkedList.remove(index);
		
		tempList = new ArrayList<String>(urlHashSet);
		urlHashSet.remove(tempList.get(index));
		
		tempList = new ArrayList<String>(urlLinkedHashSet);
		urlLinkedHashSet.remove(tempList.get(index));
		
		tempList = new ArrayList<String>(urlTreeSet);
		urlTreeSet.remove(tempList.get(index));
		
		}
	
	//to get the history
	public void fetchHistory() {
		System.out.println("Array List: " + urlArrayList);
		System.out.println("Linked List: " + urlLinkedList);
		
		System.out.println("Hash Set: " + urlHashSet);
		System.out.println("Linked Hash Set: " + urlLinkedHashSet);
		System.out.println("Tree Set: " + urlTreeSet);
	}
	
	//to search the extension
	public void search(String extension) {
		
		
		System.out.println("URLS in ArrayList with extension as "+extension +" are :");
		for(String url : urlArrayList) {
			if(url.endsWith(extension)) {
				System.out.println(url);
			}
		}
		System.out.println("URLS in LinkedList with extension as "+extension +" are :");
		for(String url : urlLinkedList) {
			if(url.endsWith(extension)) {
				System.out.println(url);
			}
		}
		System.out.println("URLS in Hashset with extension as "+extension +" are :");
		for(String url : urlHashSet) {
			if(url.endsWith(extension)) {
				System.out.println(url);
			}
		}
		System.out.println("URLS in LinkedHashset with extension as "+extension +" are :");
		for(String url : urlLinkedHashSet) {
			if(url.endsWith(extension)) {
				System.out.println(url);
			}
		}
		System.out.println("URLS in Treeset with extension as "+extension +" are :");
		for(String url : urlTreeSet) {
			if(url.endsWith(extension)) {
				System.out.println(url);
			}
		}
		
	}
	
	//to get size
	public void size() {
		System.out.println("Array List Size: " + urlArrayList.size());
		System.out.println("Linked List Size: " + urlLinkedList.size());
		System.out.println("Hash Set Size: " + urlHashSet.size());
		System.out.println("Linked Hash Set Size: " + urlLinkedHashSet.size());
		System.out.println("Tree Set Size: " + urlTreeSet.size());
	}
	
	//to update history
	public void updateHistory(int index,String newUrl) {
		
		urlArrayList.set(index, newUrl);
		System.out.println("Updated URL ArrayList : "+ urlArrayList);
		
		urlLinkedList.set(index, newUrl);
		System.out.println("Updated URL LinkedList : "+urlLinkedList);
		
		tempList = new ArrayList<>(urlHashSet);
		tempList.set(index, newUrl);
		urlHashSet = new HashSet<>(tempList);
		
		tempList = new ArrayList<>(urlLinkedHashSet);
		tempList.set(index, newUrl);
		urlLinkedHashSet = new HashSet<>(tempList);
		
		tempList = new ArrayList<>(urlTreeSet);
		tempList.set(index, newUrl);
		urlTreeSet = new HashSet<>(tempList);
		
		this.fetchHistory();
	}
}
