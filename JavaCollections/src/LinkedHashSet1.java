import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> colours = new LinkedHashSet<>();
		colours.add("white");
		colours.add("black");
		colours.add("blue");
		colours.add("white");
		System.out.println(colours);
		colours.remove("blue");
		colours.remove("red");
		
		
	}
}
