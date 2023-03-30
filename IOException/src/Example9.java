import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example9 {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("file1.txt");
			fw.write("Hello Ardra");
			fw.close();
			
			FileReader fr = new FileReader("file1.txt");
			int i ;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
