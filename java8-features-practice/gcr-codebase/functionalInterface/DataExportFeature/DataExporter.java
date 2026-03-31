package functionalInterface.DataExportFeature;

public interface DataExporter {
	void export(String data);
	
	default void exportToJSON(String data) {
		System.out.println("Export data to json: "+data);
	}
}
