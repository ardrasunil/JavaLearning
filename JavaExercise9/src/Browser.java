import java.util.ArrayList;

public class Browser {

		private ArrayList<String> history = new ArrayList<>();

		public ArrayList<String> readHistory() {
			System.out.println("Displaying the history");
			return history;
		}

		public void addHistory(String url) {
			history.add(url);
			System.out.println("Added Url");
		}
		
		public void deleteHistory() {
			history.clear();
			System.out.println("history list deleted");
		}
		
		
}
