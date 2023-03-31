import java.util.ArrayList;

public class ReadThread implements Runnable{
	
	    private Browser browser;

	    public ReadThread(Browser browser) {
	        this.browser = browser;
	    }

	    public void run() {
	        try {
	            ArrayList<String> history = browser.readHistory();
	            for (String url : history) {
	                System.out.println(url);
	            }
	        } catch (Exception e) {
	            System.err.println("Error in Reading " + e.getMessage());
	        }
	    }
	

}
