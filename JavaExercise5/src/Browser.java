import java.util.ArrayList;

public class Browser {
	
	//bookmark as member inner class
	private class Bookmarks{
		
		private ArrayList<String> bookmarkedUrls ;
		
		Bookmarks(){
			
			bookmarkedUrls = new ArrayList<>();
			
		}
		
		void addBookmark(String url) {
			bookmarkedUrls.add(url);
		}
		
		void deleteBookmark(String url) {
			bookmarkedUrls.remove(url);
		}
		
		ArrayList<String> getBookmarks() {
			
			System.out.println("BOOKMARKS");
			return bookmarkedUrls;
		}
		
	}
	
	class Shortcut{
		void dispSortcut() {
			System.out.println("SHORTCUTS");
		}
	}
	
	//static nested class history
	static class History {
		
		private ArrayList<String> historyList;
		
		History(){
			
			historyList = new ArrayList<>();
		}
		
		void addHistory(String url) {
			historyList.add(url);
		}
		
		void deleteHistory(String url) {
			historyList.remove(url);
		}
		
		ArrayList<String> getHistory() {
			System.out.println("HISTORY");
			return historyList;
		}
	
	}
	
	//main method
	public static void main(String[] args) {
		
		Browser brave = new Browser();
		
		
		Browser.Bookmarks braveBookmark = brave.new Bookmarks();
		braveBookmark.addBookmark("www.zohopeople.com");
		braveBookmark.addBookmark("www.zohocliq.com");
		braveBookmark.addBookmark("www.zoholearn.com");
		System.out.println(braveBookmark.getBookmarks());
		braveBookmark.deleteBookmark("www.zohopeople.com");
		System.out.println(braveBookmark.getBookmarks());
		
		
		
		Browser.History braveHistory = new Browser.History();
		braveHistory.addHistory("www.zohopeople.com");
		braveHistory.addHistory("www.zohocliq.com");
		braveHistory.addHistory("www.zoholearn.com");
		System.out.println(braveHistory.getHistory());
		
		
		//Anonymous class
		Shortcut s = brave.new Shortcut() {
			
			@Override
			public void dispSortcut() {
				super.dispSortcut();
				System.out.println("Open new window");
				System.out.println("Open new tab");
				System.out.println("Close current tab");
				System.out.println("Close current window");
				
				
			}
		};
		s.dispSortcut();	
		
		
	}
	
}

