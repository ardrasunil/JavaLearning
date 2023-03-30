import java.io.*;

public class Example7 {

	
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("new.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        //data.writeInt(65);  
        data.writeChar(65);
        data.writeChars("Hello");
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}
