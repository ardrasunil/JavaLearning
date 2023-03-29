import java.lang.Class;
import java.lang.reflect.*;
//declare a class Person with three constructors
class Person1 {
   public Person1() { }          //constructor with no parameters
   public Person1(String name) { }   //constructor with 1 parameter
   private Person1(String name, int age) {}  //constructor with 2 parameters
}
public class Example4 {
	public static void main(String[] args) {
	      try {
	           Person1 person = new Person1(); 
	           Class obj = person.getClass();
	 
	           // get array of constructors in a class using getDeclaredConstructor()
	           Constructor[] constructors = obj.getDeclaredConstructors();
	 
	            
	    System.out.println("Constructors for Person Class:");
	           for(Constructor c : constructors) {
	           // get names of constructors
	               System.out.println("Constructor Name: " + c.getName());
	 
	           // get access modifier of constructors
	               int modifier = c.getModifiers();
	               System.out.print ("Modifier: " + Modifier.toString(modifier) + "  ");
	 
	           // get the number of parameters in constructors
	               System.out.println("Parameters: " + c.getParameterCount());
	             
	          
	          }
	       }
	       catch(Exception e) {
	           e.printStackTrace();
	       }
	    }

}
