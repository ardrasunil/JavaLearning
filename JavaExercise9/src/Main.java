import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Browser b = new Browser();
		boolean more = true;
		String choice;
		String url;
		Scanner sc = new Scanner(System.in);
		
		while(more) {
			
			System.out.println("1: Add URL");
			System.out.println("2: Read & Delete URL");
			System.out.println("Exit");
			System.out.println("Enter your choice (1/2/Exit)");
			choice = sc.next();
			
			switch(choice) {
			
			case "1" 	:	System.out.println("Enter the url to be added");
							url = sc.next();
							b.addHistory(url);
							break;
			
			case "2"	:	//creating thread for reading
							ReadThread t1 = new ReadThread(b);
							Thread th1 = new Thread(t1);
							//creating thread for deleting
							DeleteThread th2 = new DeleteThread(b);
							
							th1.start();
							
							try {
								th1.join();
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							th2.start();
							break;
			
			case "Exit" :	more = false;
							System.out.println("ThankYou");
							break;
							
			default		:	System.out.println("Invalid Choice");
			
			}
		}
	}

}
