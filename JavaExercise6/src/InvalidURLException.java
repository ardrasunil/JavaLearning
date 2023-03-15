
//to handle invalid url 
//should end with .com,.in, .org
public class InvalidURLException extends Exception{
	public InvalidURLException()  
    {  
        // calling the constructor of parent Exception  
        super("Invalid url extension");  
    }  
}
