package functionalInterface.DataExportFeature;

public class CsvExporter implements DataExporter {
	@Override
	public void export(String data) {
		System.out.println("Exporting data to csv: "+data);
	}

}
