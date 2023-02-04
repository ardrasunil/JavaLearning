
public class Family {
	
	static void printAge(String fname, int age) {
	    System.out.println(fname + " is " + age);
	  }
	
	static int sumAge(int x) {
	    int sum = 0;
	    sum+=x;
	    return sum;
	  }
	
	static void checkAge(int x) {
		if(x<18) {
			System.out.println("Child");
		}
		else
		{
			System.out.println("Adult");
		}
	}

	  public static void main(String[] args) {
		 int total = 0;
	    String[] name = {"Sunil","Sreeja","Anu","Ardra"};
	    int[] age = {54,51,14,22};
	    for(int i=0;i<4;i++) {
	    	printAge(name[i],age[i]);
	    	checkAge(age[i]);
	    	total += sumAge(age[i]);
	    }
	    System.out.println(total);
	  }

}
