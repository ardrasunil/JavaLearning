
public class Family {
	static void printAge(String fname, int age) {
	    System.out.println(fname + " is " + age);
	  }

	  public static void main(String[] args) {
	    String[] name = {"Sunil","Sreeja","Anu","Ardra"};
	    int[] age = {54,51,14,22};
	    for(int i=0;i<4;i++) {
	    	printAge(name[i],age[i]);
	    }

	  }

}
