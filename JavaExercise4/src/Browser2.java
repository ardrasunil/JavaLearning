//trying with StringBuilder

public class Browser2 {
    StringBuilder visitedPages;
    
    public Browser2() {
        visitedPages = new StringBuilder();
    }
    
    public void visitPage(String url) {
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
    
    
    
    public String getHistory() {
        return visitedPages.toString();
    }
    
    public static void main(String[] args) {
        Browser2 b = new Browser2();
        b.visitPage("www.fb.com");
        System.out.println(b.getHistory());
        b.visitPage("www.google.com");
        System.out.println(b.getHistory());
        b.visitPage("www.fb.com");
        System.out.println(b.getHistory());
        b.visitPage("www.fb.com");
        System.out.println(b.getHistory());
        for(int i = 0;i<32;i++) {
        b.visitPage("www.google.com");
        }
        b.visitPage("www.fb.com");
        System.out.println(b.getHistory());
    }
}