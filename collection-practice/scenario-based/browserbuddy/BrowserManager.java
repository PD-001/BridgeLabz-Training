package browserbuddy;

import java.util.Stack;

public class BrowserManager {
	Stack<TabHistory> closedTabs= new Stack<>();
	TabHistory currentTab= new TabHistory();
	
	public void visitPage(String url) {
		currentTab.visit(url);
		System.out.println("Visited: "+currentTab.getCurrentPage());
	}
	
	public void goBack() {
		currentTab.back();
		System.out.println("Current: "+currentTab.getCurrentPage());
	}
	
	public void goForward() {
		currentTab.forward();
		System.out.println("Current: "+currentTab.getCurrentPage());
	}
	
	public void closeTab() {
		closedTabs.push(currentTab);
		currentTab= new TabHistory();
		System.out.println("Tab closed");
	}
	
	public void restoreTab() {
		if(closedTabs.isEmpty()) {
			System.out.println("No tabs to restore");
			return;
		}
		currentTab= closedTabs.pop();
		System.out.println("Tab restored. Current: "+currentTab.getCurrentPage());
	}
}
