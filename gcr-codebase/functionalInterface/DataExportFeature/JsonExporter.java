package functionalInterface.DataExportFeature;

public class JsonExporter implements DataExporter {
	@Override
	public void export(String data) {
		System.out.println("Exporting data to JSON: "+data);
	}
	
	public void exportToJSON(String data) {
		System.out.println("Custom JSON export logic: " + data);
	}

}
