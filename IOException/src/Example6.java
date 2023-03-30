import java.io.*;
public class Example6 {
	
	public static void main(String[] args) {
		   try {
			FileOutputStream fout1=new FileOutputStream("try1.txt");
		      FileOutputStream fout2=new FileOutputStream("try2.txt");    
		        
		      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
		      bout.write(65);    
		      bout.writeTo(fout1);    
		      bout.writeTo(fout2);    
		        
		      bout.flush();    
		      bout.close();//has no effect    
		      System.out.println("Success..."); 
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	}

}
