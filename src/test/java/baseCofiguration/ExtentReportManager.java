package baseCofiguration;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.ExtentReports;

@SuppressWarnings("deprecation")
public class ExtentReportManager {
	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			extent = new ExtentReports();
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent-report.html");
			extent.attachReporter(htmlReporter);
		}
		return extent;
	}
}
