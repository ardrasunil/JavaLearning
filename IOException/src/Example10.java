import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Example10 {
	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("file2.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome");  
	    buffer.newLine();
	    buffer.write("Ardra");
	    buffer.close();  
	    System.out.println("Success");  
	    
        FileReader fr=new FileReader("file2.txt");    
        BufferedReader br=new BufferedReader(fr);    

        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        br.close();    
        fr.close();    

	}
}
