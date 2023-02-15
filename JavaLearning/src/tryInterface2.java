interface Drawable{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  
class tryInterface2{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
System.out.println("Cube: "+Drawable.cube(3));  

//cannot create object of Drawable
//interface cannot be instantiated

}}  
