import java.io.FileInputStream;




public class Example3 {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fin = new FileInputStream("try.txt");
			int i = fin.read();
			System.out.print((char)i);
			i = fin.read();
			System.out.print((char)i);
			
			//i = 0;
			while((i = fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}