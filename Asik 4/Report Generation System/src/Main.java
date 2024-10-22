public class Main {
    public static void main(String[] args) {
        // Generate PDF Report
        ReportGenerator pdfReport = new PDFReportGenerator();
        pdfReport.generateReport();

        System.out.println();

        // Generate HTML Report
        ReportGenerator htmlReport = new HTMLReportGenerator();
        htmlReport.generateReport();

        System.out.println();

        // Generate Plain Text Report
        ReportGenerator plainTextReport = new PlainTextReportGenerator();
        plainTextReport.generateReport();
    }
}