package functionalInterface.DataExportFeature;

public class Main {
	public static void main(String[] args) {

        DataExporter csv = new CsvExporter();
        DataExporter pdf = new PdfExporter();
        DataExporter json = new JsonExporter();

        csv.export("Sales Report");
        csv.exportToJSON("Sales Report");

        pdf.export("Invoice Report");
        pdf.exportToJSON("Invoice Report");

        json.export("Analytics Report");
        json.exportToJSON("Analytics Report");
	}
}

