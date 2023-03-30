
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("myfile.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String s = "Hello,My name is Ardra Sunil.";
			byte[] b = s.getBytes();
			bout.write(b);
			bout.flush();
			bout.write(b);
			bout.close();
			fout.close();
			System.out.println("Done");
			 FileInputStream fin=new FileInputStream("myfile.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
