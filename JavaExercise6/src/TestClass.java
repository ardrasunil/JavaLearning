import java.util.Scanner;
public class TestClass {

	public static void main(String[] args) {
		
		boolean more = true ;
		Scanner sc = new Scanner(System.in);
		String choice;
		String url;
		int steps;
		int position;
		
		
		//object declaration
		System.out.println("Enter the homepage");
		String homepage = sc.next();
		BrowserHistory tab = new BrowserHistory(homepage);
		
		
		
		while(more) {
			
			System.out.println("\n\tOPTIONS");
			System.out.println("1.Visit");
			System.out.println("2.Back");
			System.out.println("3.Forward");
			System.out.println("4.Get URL");
			System.out.println("5.Get History");
			System.out.println("Exit");
			System.out.println("Enter Your Choice(1/2/3/4/Exit)");
			choice = sc.next();
			
			switch(choice) {
			
			case "1" :	System.out.println("Enter URL");
						url = sc.next();
						try {
							
					  		tab.visit(url);
						}
						catch(InvalidURLException e) {
							System.out.println(e);
						}
					  	break;
			
			
			case "2" :	System.out.println("Enter the steps to move back");
					  	steps = sc.nextInt();
					  	try {
					  		System.out.println(tab.back(steps));
					  	}
					  	catch(NoHistoryFoundException e) {
					  		System.out.println(e);
					  	}
					  	break;

			
			case "3" :	System.out.println("Enter the steps to move forward");
						
		  				steps = sc.nextInt();
		  				try {
		  					System.out.println(tab.forward(steps));
		  				} 
		  				catch (NoHistoryFoundException e) {
		  					System.out.println(e);
		  				}
		  				break;		
				
			
			case "4" :	System.out.println("Enter the Url Position");
						position = sc.nextInt();
						try {
							System.out.println(tab.getURL(position));
						}
						catch(IndexOutOfBoundsException e) {
							System.out.println("Invalid Position :" + e);
						}
						catch(InvalidPositionException e) {
							System.out.println(e);
						}
						break;
						
						
			case "5" :	System.out.println(tab.getHistory());
						break;
			
			
			case "Exit" :	System.out.println("ThankYou");
							more = false;
						 	break;
			
			
			default : System.out.println("Invalid Choice. Make a valid choice");
				
				
			}
			
			
		}
		
	}
}
