
import java.util.Arrays;
import java.util.Scanner;

public class Browser {

	 String[] visits = new String[0];
	 
	 void setVisits(String url) {
		 
		 //to check if url is already present
		 boolean found = false;
		 //to keep track of the index if url already exists
		 int index = 0;
		 //if found string to store
		 String foundUrl = null;
		 //loop to check if already visited url or not
		 if(this.visits.length>0)
			 for(String str : this.visits) {
				 { index += 1;
					if(str.substring(0,str.length()-5).equals(url))
					{
						found = true;
						foundUrl = str;
						break;
					}
				}
			 }
	 
		 if(found) {
			 //stores the present url in visits string
			 int lenUrl = foundUrl.length();
			 //get the visit count from string
			 String visitCount = foundUrl.substring(foundUrl.length()-1);
			 //increment the current count
			 int newCount = Integer.parseInt(visitCount) + 1;
			 //updating
			 String newStr = foundUrl.substring(0,foundUrl.length()-1);
			 visits[index-1]= newStr.concat(String.valueOf(newCount));
		 }
		 else
		 {
			 int lenVisits = visits.length;
			 //System.out.println(lenVisits);
			 
			 //creating temp array
			 String[] tempVisits= new String[lenVisits+1];
			 for(int i =0;i<lenVisits;i++) {
				tempVisits[i]=visits[i];
			 }
			 tempVisits[lenVisits]=url.concat(" ## 1");
			 visits=tempVisits;
		 }
	 }
	 
	 // to display the visits
	 void dispVisits() {
		 for(String str:visits) {
			 System.out.println(str);
		 }
	 }
	 
	 
	 //main method
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 Browser b = new Browser();
		 boolean isContinue = true;
		 while(isContinue) {
			 
			 System.out.println("enter the url you visited");
			 String url = sc.next();
			 b.setVisits(url);
			 b.dispVisits();
		 
		 } 
		 
		 
	 }

		
}
