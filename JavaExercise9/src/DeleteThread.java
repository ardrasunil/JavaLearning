
import java.util.Scanner;

public class DeleteThread extends Thread{
	
	private Browser browser;

    public DeleteThread(Browser browser) {
        this.browser = browser;
    }

    @Override
    public void run() {
    	
    	try {
 
            browser.deleteHistory();
            //System.out.println(browser.readHistory());
            
        } catch (Exception e) {
            System.err.println("Error in Reading " + e.getMessage());
        }
        
    }
	

}
