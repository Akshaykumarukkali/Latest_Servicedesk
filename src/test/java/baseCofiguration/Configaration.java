package baseCofiguration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("deprecation")
public class Configaration {

	protected static DesiredCapabilities dc;
	protected static URL url;
	ExtentReports extent = ExtentReportManager.getInstance();
	ExtentTest test;
	protected static AndroidDriver driver;

	protected static String createdepartment1 = "onebilltest2_2"; // need to change everytime when the script is getting
																	// trigger

	String appPath = System.getProperty("user.dir") + "/src/test/java/application/build-1700658244169.apk"; // if build
																											// is
																											// changed,
																											// change it

	@BeforeMethod
	public void Emulatorcapabilities() throws InterruptedException, MalformedURLException {
		dc = new DesiredCapabilities();

		dc.setCapability("deviceName", "sdk_gphone64_x86_64");
		dc.setCapability("automationName", "uiautomator2");
		// dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "13.0");
		dc.setCapability("UDID", "emulator-5554");
		dc.setCapability("appium.deviceIsAppInBackground", true);
		dc.setCapability("appPackage", "com.service_desk.onebill");
		dc.setCapability("appActivity", ".MainActivity");
		dc.setCapability("isHeadless", true);
		dc.setCapability("autoGrantPermissions", true);
		dc.setCapability("fullReset", true);
		dc.setCapability("fastReset", true);
		dc.setCapability("avdArgs", "-no-window");
		dc.setCapability("app", appPath);

		dc.setCapability("deviceName", "Lenovo Tab P11 Pro");
		dc.setCapability("platformVersion", "11.0");

		dc.setCapability("deviceName", "Afrid");
		dc.setCapability("platformVersion", "13.0");
		dc.setCapability("UDID", "PR7SUSMZKJ79BAUW");

		url = new URL("http://127.0.0.1:4723/");

		driver = new AndroidDriver(url, dc);

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		test = extent.createTest("SeleniumTest");
		extent.flush();

	}

	@AfterMethod
	public void closeapp() throws InterruptedException, MalformedURLException {
		driver.quit();

	}

}
