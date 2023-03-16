import java.util.ArrayList;

class BrowserHistory{

	private ArrayList<String> history;
	private int currentPosition ;


	//Initialize the homepage of the browser
	public BrowserHistory(String homepage) {
		history = new ArrayList<>();
		try {
			visit(homepage);
		} catch (InvalidURLException e) {
			System.out.println(e);
		}
		
	}

	//visits url from current page
	public void visit(String url) throws InvalidURLException {
		
			boolean valid = url.endsWith(".com")||url.endsWith(".in")||url.endsWith(".org");
			if(!valid) {
				throw new InvalidURLException();
			}
			history.add(url);
			currentPosition =history.size()-1;
	}

	//Move steps back in history and return the url in that position in history.
	public String back(int step) throws NoHistoryFoundException{
			if(step>currentPosition) {
				throw new NoHistoryFoundException();
			}
			currentPosition -= step;
			return history.get(currentPosition);
	}

	//Move steps forward in history and return the url in that position in history.
	String forward(int step) throws NoHistoryFoundException {
			if(step>(history.size()-1-currentPosition)) {
				throw new NoHistoryFoundException();
			}
			currentPosition += step;
			return history.get(currentPosition);
		
	}

	//Gets the url in the position mentioned from the history
	public String getURL(int position) throws InvalidPositionException,IndexOutOfBoundsException{
		if(position<0) {
			throw new InvalidPositionException();
		}
		else if(position>(history.size()-1)) {
			throw new IndexOutOfBoundsException();
		}
		return history.get(position);
		//add return statement
	}
	
	//to get the history 
	public ArrayList<String> getHistory() {
		return history;
	}

	
}