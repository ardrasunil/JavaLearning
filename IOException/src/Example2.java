import java.io.FileOutputStream;


public class Example2 {
	
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fout = new FileOutputStream("try.txt");
			//int i = 20;
			//byte b1 = i.getBytes();
			//cannot invoke byte 
			//fout.write(i);
			//fout.write(30);
			//fout.write(65);
			//fout.close();
			//STream closed exception
			String s = "Welcome to Eclipse";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
