
import java.util.Arrays;

public class TestString3 {

public static void main(String[] args) {

	//substring()
	String s1 = " hello Fruits ";
	String s2 = "STrawBERRY";
	System.out.println(s1.substring(0,2));
	System.out.println(s1.substring(s1.length()-1)); // to get last element
	
	//String.split()
	
	String text= new String("Hello.My name.is Sachin");
	/* Splits the sentence by the delimeter passed as an argument */
	String[] sentences = text.split("\\.");
	System.out.println(sentences[0]);
	System.out.println(Arrays.toString(sentences));
	
	//toUpperCase() & toLowerCase()
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	
	//trim():remove space @ start n end
	System.out.println(s1.trim());
	
	//endsWith() n stratsWith()
	String sent = "zohocorp.com";
	System.out.println(sent.endsWith(".com"));
	System.out.println(sent.startsWith("zoho"));
	
	//charAt()
	System.out.println(sent.charAt(0));
	
	String s3 = "eldho";
	System.out.println(s3.indexOf("ldh"));
	
	
	
	}

}