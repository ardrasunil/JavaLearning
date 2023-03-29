
import java.lang.Class;
import java.lang.reflect.*;
class Student1 {
 private String rollNo;
}
 
 
class Example2 {
public static void main(String[] args) {
   try {
      Student1 student = new Student1();
      // get the object for class Student in a Class.
      Class obj = student.getClass();      // access the private field
      Field field2 = obj.getDeclaredField("rollNo");
     // make the private field accessible
      field2.setAccessible(true);
      // set the value of rollNo
      field2.set(student, "27");
      System.out.println("Field Information of rollNo:");
      // get the access modifier of rollNo
      int mod2 = field2.getModifiers();
      String modifier2 = Modifier.toString(mod2);
      System.out.println("rollNo modifier::" + modifier2);
      // get the value of rollNo converting in String
      String rollNoValue = (String)field2.get(student);
      System.out.println("rollNo Value::" + rollNoValue);
   } catch(Exception e) {
      e.printStackTrace();
   }
 }
}