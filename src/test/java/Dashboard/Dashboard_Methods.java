package Dashboard;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

@SuppressWarnings("deprecation")
public class Dashboard_Methods {
	DesiredCapabilities dc;
	URL url;

	static AndroidDriver driver;

	@SuppressWarnings("static-access")
	public Dashboard_Methods(AndroidDriver driver, DesiredCapabilities dc, URL url) {

		this.driver = driver;
		this.dc = dc;
		this.url = url;
	}

	public static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			extent = new ExtentReports();
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent-report.html");
			extent.attachReporter(htmlReporter);
		}
		return extent;
	}

	By username1 = By.xpath("//android.widget.EditText[@text='Username']");
	By password1 = By.xpath("//android.widget.EditText[@text='Password']");
	By Signin = By.xpath("//android.view.ViewGroup[@content-desc=\"Sign In\"]/android.widget.TextView");
	By myticketsdeopdown = By
			.xpath("//android.view.ViewGroup[@content-desc=\"My Tickets, \"]/android.widget.TextView[2]");

	By dashboard = By.xpath("(//android.view.ViewGroup[@content-desc=\"Dashboard\"])[1]/android.widget.TextView");

	By agentactivity = By.xpath("//android.view.ViewGroup[@content-desc=\"Agent Activity\"]/android.widget.TextView");

	By mtktsdropdown_alldepartment = By
			.xpath("//android.view.ViewGroup[@content-desc=\"All Departments\"]/android.widget.TextView");

	By mtktsdropdown_mydepartment = By
			.xpath("//android.view.ViewGroup[@content-desc=\"My Departments\"]/android.widget.TextView");

	By unassignedtkts = By.xpath("(//android.widget.TextView[@index='1'])[4]");

	By esculatedtkts = By.xpath("(//android.widget.TextView[@index='1'])[5]");

	By overduetkts = By.xpath("(//android.widget.TextView[@index='1'])[6]");

	By open = By.xpath("(//android.widget.TextView[@index='1'])[7]");

	By resolved = By.xpath("(//android.widget.TextView[@index='1'])[8]");

	By hold = By.xpath("(//android.widget.TextView[@index='1'])[9]");
	

	By piechart = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Ticket By Status, Pie Chart, Bar Chart\"]/android.view.ViewGroup[2]/android.widget.TextView[2]");

	By barchart = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Ticket By Status, Pie Chart, Bar Chart\"]/android.view.ViewGroup[2]/android.widget.TextView[3]");

	By perioddropdown = By
			.xpath("//android.view.ViewGroup[@content-desc=\"This month, \"]/android.widget.TextView[1]");

	public void username_password(String username, String password) throws InterruptedException {

		driver.findElement(username1).sendKeys(username);
		driver.findElement(password1).sendKeys(password);
		driver.findElement(Signin).click();

	}

	public void Myticketsdeopdown() {
		driver.findElement(myticketsdeopdown).click();

	}

	public WebElement waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void Myticketsdeopdown_mtktsdropdown_alldepartment() {
		driver.findElement(mtktsdropdown_alldepartment).click();

	}

	public void Myticketsdeopdown_mtktsdropdown_mydepartment() {
		driver.findElement(myticketsdeopdown).click();

	}

	public void unassignedtkts() {
		driver.findElement(unassignedtkts).click();
	}

	public void dashboard() {
		driver.findElement(dashboard);
	}

	public void agentactivity() {
		driver.findElement(agentactivity);
	}

	public void esculatedtkts() {
		driver.findElement(esculatedtkts).click();

	}

	public void overdue() {
		driver.findElement(overduetkts).click();

	}

	public void open() {
		driver.findElement(open).click();

	}

	public void resolved() {
		driver.findElement(resolved).click();

	}

	public void hold() {
		driver.findElement(hold).click();

	}

	public void piechart() {
		driver.findElement(piechart).click();
	}

	public void barchart() {
		driver.findElement(barchart).click();
	}

	public void perioddropdown() {
		driver.findElement(perioddropdown).click();
	}

	@SuppressWarnings("rawtypes")
	public void scrollDown() {
		@SuppressWarnings("unused")
		int scrollDistance = 2; // Adjust this value to control the scroll distance
		// Get the dimensions of the screen
		int screenHeight = driver.manage().window().getSize().getHeight();

		// Calculate scroll start and end coordinates
		int startX = driver.manage().window().getSize().getWidth() / 2;
		int startY = (int) (screenHeight * 0.8); // Start scroll from 80% down the screen
		int endY = (int) (screenHeight * 0.2); // End scroll at 20% down the screen
		// Create a TouchAction instance and perform the scroll gesture
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(startX, startY)))
				.moveTo(PointOption.point(startX, endY)).release().perform();
	}

	public void perioddpd_All() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"All\"]/android.widget.TextView")));
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"All\"]/android.widget.TextView")).click();
	}
}
