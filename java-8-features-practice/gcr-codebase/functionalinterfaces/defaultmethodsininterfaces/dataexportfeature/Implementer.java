package functionalinterfaces.defaultmethodsininterfaces.dataexportfeature;

public class Implementer implements ReportingModule{
	
	@Override
	public void exportToCSV() {
		System.out.println("Implemented CSV");
	}

	@Override
	public void exportToPDF() {
		System.out.println("Implemented PDF");
		
	}
	
}
