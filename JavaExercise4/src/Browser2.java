//trying with StringBuilder
import java.util.Scanner;

public class Browser2 {
    StringBuilder visitedPages;
    
    public Browser2() {
        visitedPages = new StringBuilder();
    }
    
    //to set the visit page details
    public void setVisits(String url) {
        int count = 1;
        int firstIndex = visitedPages.lastIndexOf(url);
        String[] splitString ;
        
        if(firstIndex>=0)
        {
        	
        	int endIndex = visitedPages.indexOf("\n",firstIndex);
        	String oldUrl = visitedPages.substring(firstIndex, endIndex);
        	splitString = oldUrl.split(" ## ");
        	count = Integer.parseInt(splitString[1]) + 1;
        	String newUrl = splitString[0]+" ## "+count;
        	visitedPages.replace(firstIndex, endIndex,newUrl );
        }
        else 
        {
        	visitedPages.append(url).append(" ## ").append(count).append("\n"); 
        }
        
    }
    
    
    //to get the visit page details
    public String dispVisits() {
        return visitedPages.toString();
    }
    
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        Browser2 b = new Browser2();
        
        while(true) {
			 
			 System.out.println("enter the url you visited or enter exit");
			 String url = sc.next();
			 if(url.equals("exit")) {
				 break;
			 }
			 b.setVisits(url);
			 System.out.println(b.dispVisits());
			 
		 } 
	}
}