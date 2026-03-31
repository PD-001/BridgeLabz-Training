package lambdaexpressions.invoiceobjectcreation;

public class Invoice {
	
	int transcationid;
	
	public Invoice(int transactionid) {
		this.transcationid= transactionid;
	}
	
	@Override
	public String toString() {
		return "invoice object for: "+ this.transcationid + "\n";
	}
}
