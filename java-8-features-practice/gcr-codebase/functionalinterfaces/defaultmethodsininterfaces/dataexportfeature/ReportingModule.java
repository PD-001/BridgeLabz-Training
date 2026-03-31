package functionalinterfaces.defaultmethodsininterfaces.dataexportfeature;

public interface ReportingModule {
	void exportToCSV();
	void exportToPDF();
	
	default void exportToJSON() {
		System.out.println("Exporting report to JSON format");
	}
}
