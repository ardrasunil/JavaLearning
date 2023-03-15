
//exception if the position is negative
//if not within size then inbuilt exception
public class InvalidPositionException extends Exception{
	public InvalidPositionException() {
		super("Provide only positive values");
	}
}