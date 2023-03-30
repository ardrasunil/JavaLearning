import java.io.*;
public class Example5 {
	public static void main(String[] args) {
	
		try {
			FileInputStream f1 = new FileInputStream("myfile.txt");
			FileInputStream f2 = new FileInputStream("try.txt");
			SequenceInputStream f3 = new SequenceInputStream(f1,f2);
			
			int i ;
			while((i = f3.read())!=-1) {
				System.out.print((char)i);
			}
			
			f1.close();
			f2.close();
			f3.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
	}
}
