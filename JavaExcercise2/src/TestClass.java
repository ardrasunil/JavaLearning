
public class TestClass {
	public static void main(String[] args) {
		
		//to test whoAmI
		System.out.println("Browser");
		Browser br = new Browser();
		br.whoAmI();
		System.out.println("Browser 1");
		Browser browserOne = new GoogleChrome();
		browserOne.whoAmI();
		System.out.println("Browser 2");
		String[] history = {"zoho.com","whatsapp.com","instagram.com"};
		Browser browserTwo = new Firefox(history);
		browserTwo.whoAmI();
		
		//to test the permissions
		System.out.println("New Chrome Tab");
		GoogleChrome chromeNewTab = new GoogleChrome();
		System.out.println("\nSet any Access permissions");
		chromeNewTab.setPermission(true);
		chromeNewTab.showAccessPermission();
		System.out.println("\nChanging all Access permissions");
		chromeNewTab.setPermission(true,true,false);
		chromeNewTab.showAccessPermission();
		System.out.println("\nReseting all Access permissions");
		chromeNewTab.resetPermission();
		chromeNewTab.showAccessPermission();
		
		
		
		
	}
}
