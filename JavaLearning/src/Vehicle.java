
class Road{  
 final int speedlimit=90;  
}  
class Vehicle extends Road{  
  int speedlimit=150;  
  
 public static void main(String args[]){  
  Road obj=new Vehicle();  
  System.out.println(obj.speedlimit);
 }  
}
