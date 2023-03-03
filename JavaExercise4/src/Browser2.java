//trying with StringBuilder

import java.util.Scanner;

public class Browser2 {
	StringBuilder[] visits;
	
	void setVisits(StringBuilder url) {
		
		
		 boolean found = false;
		 int index = 0;
		 StringBuilder foundUrl = new StringBuilder();
		 
		 String[] splitString1 ;
		 for(StringBuilder str : this.visits)
				{ 	index += 1;
				 	splitString1 = (str.toString()).split(" ## ");
				 	if(splitString1[0].equals(url)) {
				 		found = true;
				 		foundUrl = str;
				 		break;
				 	}
				}
			 
	 
		 if(found) 
		 {
			 splitString1 = (foundUrl.toString()).split(" ## ");
			 int presentCount = Integer.parseInt(splitString1[1]);
			 visits[index-1].delete(0,visits[index-1].length());
			 visits[index-1].append(splitString1[0]+" ## "+String.valueOf(presentCount+1));
		 }
		 else
		 {
			 System.out.println(visits.length);
			 visits[visits.length].append(url);
		 }
		 
		 foundUrl.delete(0, foundUrl.length());
		
	}
	
	void dispVisits() {
		System.out.println("\t Pages visited with count");
		 for(StringBuilder str:visits) {
			 System.out.println(str);
		 }
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Browser2 b = new Browser2();
		StringBuilder url = new StringBuilder();
		 while(true) {
			 
			 System.out.println("enter the url you visited or enter exit");
			 url.append(sc.next());
			 System.out.println(url);
			 if(url.equals("exit")) {
				 break;
			 }
			 
			 b.setVisits(url);
			 //clear the buffer everytime
			 url.delete(0, url.length());
			 
			 
			 
		 } 
    }
}
