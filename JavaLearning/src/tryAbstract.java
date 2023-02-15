//abstraction using abstract class

abstract class Car{  
   Car(){System.out.println("Car is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  
//Creating a Child class which inherits Abstract class  
 class Maruti extends Car{  
 void run(){System.out.println("running safely..");}  
 }  
 public class tryAbstract {
	public static void main(String args[]){  
		  Car obj = new Maruti();  
		  obj.run();  
		  obj.changeGear();  
		 } 

}
