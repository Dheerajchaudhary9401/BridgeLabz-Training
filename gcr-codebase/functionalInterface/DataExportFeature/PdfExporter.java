package functionalInterface.DataExportFeature;

public class PdfExporter implements DataExporter {
	@Override
	public void export(String data) {
		System.out.println("Exporting data to pdf: "+data);
	}
}
