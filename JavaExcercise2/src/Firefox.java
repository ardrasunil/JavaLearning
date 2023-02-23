import java.util.Objects;

public class Firefox extends Browser implements MultipleAccountContainers{
	
	static String[] allContainers = new String[0];
	//empty constructor
	Firefox(){
		//super();
		//this will be invoked by default
		//call the constructor(empty) in parent class
	}
	
	//parameterized constructor
	Firefox(String[] history){
		super(history);
	}
	
	//Overriding method from parent class
	public void whoAmI() {
		System.out.println("I am Firefox\n");
	}

	//implements from interface
	//to add Container
	public void addContainer(String newContainer) {
		
		int lenContainers = Firefox.allContainers.length;
		//System.out.println(lenHistory);
		//creating temp array
		String[] tempContainers = new String[lenContainers+1];
		for(int i =0;i<lenContainers;i++) {
			tempContainers[i]=Firefox.allContainers[i];
		}
		tempContainers[lenContainers]=newContainer;
		allContainers=tempContainers;
		
	}
	
	//implements from interface
	//to delete from container
	public void leaveContainer(String container) {
		
		boolean flag = false;
		int lenContainer = Firefox.allContainers.length;
		String[] tempContainers = new String[lenContainer-1];
		for(int i =0,j=0;i<lenContainer;i++) {
			if(Objects.equals(Firefox.allContainers[i], container)) {
				flag = true;
			}
			else
			{
				tempContainers[j]=Firefox.allContainers[i];
				j++;
			}
		}
		/*
		 * if(flag) { System.out.println("Left Container"); } else {
		 * System.out.println("Not Found"); }
		 */
		allContainers=tempContainers;
		
	}
	
	//to get the containers
	public String[] viewAllContainers() {
		return allContainers;
		
	}
	
	//to get the no.of firefox tabs
	public int getCountOfTabsOpened(Browser[] allTabs) {
		int length = allTabs.length;
		int countFirefoxTabs = 0;
		for(int i =0;i<length;i++) {
			if(allTabs[i] instanceof Firefox) {
				countFirefoxTabs+=1;
			}
		}
		return countFirefoxTabs;
	}
	
}
