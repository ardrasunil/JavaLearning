
public class TestClass {
	public static void main(String[] args) {
		
		System.out.println("Tab 1");
		Browser tabOne = new GoogleChrome();
		tabOne.whoAmI();
		
		System.out.println("Tab 2");
		String[] history = {"zoho.com","whatsapp.com","instagram.com"};
		Browser tabTwo = new Firefox(history);
		tabTwo.whoAmI();
	}
}
