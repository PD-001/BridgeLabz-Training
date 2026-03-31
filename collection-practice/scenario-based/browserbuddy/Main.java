package browserbuddy;

public class Main {
	public static void main(String[] args) {
		
		BrowserManager browser= new BrowserManager();
		
		browser.visitPage("google.com");
		browser.visitPage("github.com");
		browser.visitPage("stackoverflow.com");
		
		browser.goBack();
		browser.goBack();
		browser.goForward();
		
		browser.closeTab();
		
		browser.restoreTab();
		browser.goForward();
	}
}
