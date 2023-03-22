
import java.util.*;  
public class HashTable1 {  
   public static void main(String args[]) {  
  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
     map.put(100,"Amit");    
     map.put(102,"Ravi");   
     map.put(101,"Vijay");    
     map.put(103,"Rahul");    
     System.out.println("Before remove: "+ map);    
       // Remove value for key 102  
       map.remove(102);  
       System.out.println("After remove: "+ map); 
       
       System.out.println(map.getOrDefault(101, "Not Found"));  
       System.out.println(map.getOrDefault(105, "Not Found"));  
       
       map.putIfAbsent(104,"Gaurav");  
       System.out.println("Updated Map: "+map);  
       //it wont change value
       map.putIfAbsent(101,"Leela");  
       System.out.println("Updated Map: "+map);  
   }      
}  