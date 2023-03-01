
import java.util.StringJoiner;

public class TestString2 {

public static void main(String[] args) {

//Concatenation
//1. + sign
String s1 = "ARDRA"+"SUNIL";
System.out.println(s1);
String s2 = new String("Ardra");
String s3 = new String("Sunil");
System.out.println(s2+s3);
//can concatenate primitive values too
System.out.println(40+50+"hello"+70+90);

//2.concat() func
String s4 =s1.concat(s3);
System.out.println(s4);

//3.using StringBuilder append() method
StringBuilder s5 = new StringBuilder("Hello"); //String 1
StringBuilder s6 = new StringBuilder(" World"); //String 2
StringBuilder s7 = s5.append(s6); //String 3 to store the result
System.out.println(s7);

//4.Using format() specifiers
String s8 = String.format("%s%s", s2,s3);
System.out.println(s8);

//5.Using String.join()
//first the separator
String s9 = String.join(" @@ ",s2,Integer.toString(2));
System.out.println(s9);

//6.using StringJoiner
StringJoiner s = new StringJoiner(" , ");
s.add("Hi");
s.add("world");
s.add("Good Day");
System.out.println(s);


}

}