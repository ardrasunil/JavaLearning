
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
		String[] history = {"zoho.com","whatsapp.com","instagram.com"};
		Browser browserTwo = new Firefox(history);
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
		int length = allBrowsers.length;
		int countChromeTabs = 0;
		for(int i =0;i<length;i++) {
			if(allBrowsers[i] instanceof GoogleChrome) {
				countChromeTabs+=1;
			}
		}
		System.out.println("\nNo. of Google Chrome Tabs : "+countChromeTabs);
		System.out.println("No. of Opened Tabs : "+br.getCountTabsOpened(allBrowsers));
		
		//Step 6: to add an interface for Firefox
		System.out.println("\n\t\tFIREFOX BROWSER");
		Browser browser= new Firefox();
		Firefox browser1 = (Firefox) browser;
		browser1.addContainer("facebookContainer");
		browser1.addContainer("Mails"); 
		browser1.addContainer("PrivateBrowsing");
		
		String[] containers = browser1.viewAllContainers();
		System.out.println("Container after adding");
		System.out.println(Arrays.toString(containers));
		browser1.leaveContainer("PrivateBrowsing"); 
		containers = browser1.viewAllContainers(); 
		System.out.println("Container after deleting");
		System.out.println(Arrays.toString(containers));
	}
}
