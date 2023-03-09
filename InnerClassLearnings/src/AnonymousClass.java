
public class AnonymousClass {
		void showMsg() {
			
		}
		
	public static void main(String[] args) {
		
		AnonymousClass a = new AnonymousClass() {
			void showMsg() {
				System.out.println("Testing anonymous class");
			}
		};
		
		a.showMsg();
	}
}
