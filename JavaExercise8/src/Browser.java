

import java.util.ArrayList;
import Hack.Hacker;


public class Browser {
	
	private ArrayList<String> history = new ArrayList<>();
	
	
	public void addHistory(String url) {
		history.add(url);
	}
	
	public ArrayList<String> getHistory() {
		return history;
	}
	
	public void changeHistory(ArrayList<String> newHistory) {
		history = newHistory;
	}
	

}
