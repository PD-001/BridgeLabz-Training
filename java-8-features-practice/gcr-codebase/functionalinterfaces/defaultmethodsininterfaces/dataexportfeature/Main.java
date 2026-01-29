package functionalinterfaces.defaultmethodsininterfaces.dataexportfeature;

public class Main {
	public static void main(String[] args) {
		ReportingModule rm= new Implementer();
		rm.exportToCSV();
		rm.exportToPDF();
		rm.exportToJSON();
	}
}
