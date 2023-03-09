
class StaticNested{  
  static int data=30;  
  static class Inner{  
	  
   String Currency = "Rupees";
   void msg(){System.out.println("Price is "+data+Currency);}  
  }  
  public static void main(String args[]){  
  StaticNested.Inner obj=new StaticNested.Inner();  
  obj.msg();  
  }  
}  