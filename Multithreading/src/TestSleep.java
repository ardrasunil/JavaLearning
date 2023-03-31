
public class TestSleep extends Thread{
	
	public void run() {
		System.out.println("hello thread started running");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hi i am running after sleep");
		
	}
	
	public static void main(String args[]){    
		  TestSleep t1=new TestSleep();    
		  TestSleep t2=new TestSleep();    
		     
		  t1.start();    
		  System.out.println(t1.getState());
		  System.out.println(t2.getState());
		  t2.start();    
		  System.out.println(t1.getState());
		  System.out.println(t2.getState());
		
		 }    

}
