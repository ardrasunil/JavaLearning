//sample program of interface
//multiple inheritance

interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class TryInterface implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
TryInterface obj = new TryInterface();  
obj.print();  
obj.show();  
 }  
}  
