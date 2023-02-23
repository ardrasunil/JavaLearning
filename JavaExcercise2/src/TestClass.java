
import java.util.Arrays;

public class TestClass {
	public static void main(String[] args) {
		
		//Step 2: to test whoAmI
		System.out.println("\t\tBROWSER");
		Browser br = new Browser();
		br.whoAmI();
		System.out.println("\t\tBROWSER 1");
		Browser browserOne = new GoogleChrome();
		browserOne.whoAmI();
		System.out.println("\t\tBROWSER 2");
		Browser browserTwo = new Firefox();
		browserTwo.whoAmI();
		
		
		
		System.out.println("\t\tGOOGLE CHROME BROWSER");
		GoogleChrome chromeNewTab = new GoogleChrome();
		
		//Step 4:to get the version of Google Chrome
		System.out.println("Google Chrome Version : "+chromeNewTab.getVersionnumber());
		
		//Step 3:to test the permissions
		System.out.println("\nSet any Access permissions");
		chromeNewTab.setPermission(true);
		chromeNewTab.showAccessPermission();
		System.out.println("\nChanging all Access permissions");
		chromeNewTab.setPermission(true,true,false);
		chromeNewTab.showAccessPermission();
		System.out.println("\nReseting all Access permissions");
		chromeNewTab.resetPermission();
		chromeNewTab.showAccessPermission();
		
		//step 5:to print number of google Chrome tabs
		Browser tabOne = new GoogleChrome();
		Browser tabTwo = new Firefox();
		Browser tabThree = new Firefox();
		Browser tabFour = new GoogleChrome();
		Browser tabFive = new GoogleChrome();
		Browser[] allBrowsers = new Browser[] {tabOne,tabTwo,tabThree,tabFour,tabFive};
		
		System.out.println("\nNo. of Google Chrome Tabs : "+browserOne.getCountOfTabsOpened(allBrowsers));
		System.out.println("No. of Opened Tabs : "+br.getCountOfTabsOpened(allBrowsers));
		
		//Step 6: to add an interface for Firefox
		System.out.println("\n\t\tFIREFOX BROWSER");
		Firefox browser= new Firefox();
		
		browser.addContainer("facebookContainer");
		browser.addContainer("Mails"); 
		browser.addContainer("PrivateBrowsing");
		
		String[] containers = browser.viewAllContainers();
		System.out.println("Container after adding");
		System.out.println(Arrays.toString(containers));
		browser.leaveContainer("PrivateBrowsing"); 
		containers = browser.viewAllContainers(); 
		System.out.println("Container after deleting");
		System.out.println(Arrays.toString(containers));
	}
}
