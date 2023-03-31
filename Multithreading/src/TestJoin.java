
public class TestJoin implements Runnable{
	
	public void run() {
		for(int i=1;i<=5;i++){    
			   try{    
			    Thread.sleep(500);    
			   }catch(Exception e){System.out.println(e);}    
			  System.out.println(i);    
			  }    
	}
	
	
		public static void main(String args[]){    
			 TestJoin t1=new TestJoin();    
			 TestJoin t2=new TestJoin();    
			 TestJoin t3=new TestJoin();   
			 
			 Thread th1 = new Thread(t1);
			 Thread th2 = new Thread(t2);
			 Thread th3 = new Thread(t3);
			 
			 th1.start();    
			 try{    
			  th1.join();    
			 }catch(Exception e){System.out.println(e);}    
			    
			 th2.start();    
			 th3.start();    
			 }    
		
	

}
