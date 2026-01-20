package browserbuddy;

class HistoryNode {
	String url;
	HistoryNode prev;
	HistoryNode next;
	
	HistoryNode(String url){
		this.url= url;
		this.prev= null;
		this.next= null;
	}
}

public class TabHistory {
	HistoryNode head=null;
	HistoryNode current=null;
	
	public void visit(String url) {
		HistoryNode newNode= new HistoryNode(url);
		
		if(head==null) {
			head= newNode;
			current= newNode;
			return;
		}
		
		current.next= null;
		newNode.prev= current;
		current.next= newNode;
		current= newNode;
	}
	
	public void back() {
		if(current!=null && current.prev!=null) {
			current= current.prev;
		}
		else {
			System.out.println("No previous page");
		}
	}
	
	public void forward() {
		if(current!=null && current.next!=null) {
			current= current.next;
		}
		else {
			System.out.println("No next page");
		}
	}
	
	public String getCurrentPage() {
		if(current==null) {
			return "No page open";
		}
		return current.url;
	}
}
