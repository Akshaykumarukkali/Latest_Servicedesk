package Settings;

import java.net.URL;
import java.time.Duration;

import io.appium.java_client.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Settingsmethods {
	DesiredCapabilities dc;
	URL url;

	static AndroidDriver driver;

	@SuppressWarnings("static-access")
	public Settingsmethods(AndroidDriver driver, DesiredCapabilities dc, URL url) {

		this.driver = driver;
		this.dc = dc;
		this.url = url;
	}

	By username1 = By.xpath("//android.widget.EditText[@text='Username']");
	By password1 = By.xpath("//android.widget.EditText[@text='Password']");
	By Signin = By.xpath("//android.widget.TextView[@text='Sign In']");

	By settings = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");

	By Organizationchart = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Organization Chart\"]/android.widget.TextView");

	By ticketsclassified = By.xpath("//android.widget.TextView[@text='Ticket Classification']");

	By actiontickets = By.xpath("//android.widget.TextView[@text='Action Types']");

	By ticketinbox = By.xpath("//android.view.ViewGroup[@content-desc=\"Ticket Inbox\"]/android.widget.TextView");

	By create_department_button = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Create Department\"]/android.view.ViewGroup[2]/android.widget.TextView");

	By organizationchart_edit = By.xpath(
			"(//android.view.ViewGroup[@content-desc=\"\"])[1]/android.view.ViewGroup[2]/android.widget.TextView");

	By organizationchart_delete = By.xpath(
			"(//android.view.ViewGroup[@content-desc=\"\"])[2]/android.view.ViewGroup[2]/android.widget.TextView");

	By organizationchart_addmember = By.xpath(
			"(//android.view.ViewGroup[@content-desc=\"\"])[3]/android.view.ViewGroup[2]/android.widget.TextView");

	By createdepartmenttextfield = By.xpath("//android.widget.EditText[@index='1']");

	By selectmember = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup");

	By createdept_closebtn = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Close\"]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");

	By createdept_managerradiobtn = By.xpath(
			"(//android.view.ViewGroup[@content-desc=\"0\"])[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.View");

	By createdept_default_assigne = By.xpath(
			"(//android.view.ViewGroup[@content-desc=\"0\"])[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.View");

	By createdept_submitbtn = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup[2]/android.widget.TextView");

	By afriddepartmenttyss = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Afrid department Tyss, \"]/android.widget.TextView[1]");

	By createclassificationsbtn = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Create Classification\"]/android.view.ViewGroup[2]/android.widget.TextView");

	By createclassification_engineerdropdown = By.xpath("//android.view.ViewGroup[@content-desc=\"Engineering, \"]");

	By createclassification_incidenttype = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

	By createclassification_subincidenttype = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

	By createclassification_lowdropdown = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Low, \"]/android.widget.TextView[1]");

	By createclassification_subscriber = By.xpath(
			"(//android.view.ViewGroup[@content-desc=\"󰸞\"])[1]/android.view.ViewGroup[2]/android.widget.TextView");
	By createclassification_partner = By.xpath(
			"(//android.view.ViewGroup[@content-desc=\"󰸞\"])[2]/android.view.ViewGroup[2]/android.widget.TextView");
	By createclassification_system = By.xpath(
			"(//android.view.ViewGroup[@content-desc=\"󰸞\"])[3]/android.view.ViewGroup[2]/android.widget.TextView");

	By createclassification_responsetimetxtfield_Days = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");

	By createclassification_responsetimetxtfield_Hours = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By createclassification_responsetimetxtfield_Minutes = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");

	By createclassification_resolutiontimetxtfield_Days = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");

	By createclassification_resolutiontimetxtfield_Hours = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	By createclassification_resolutiontimetxtfield_Minutes = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");

	By isa_addnewfield = By
			.xpath("//android.view.ViewGroup[@content-desc=\", Add New Field\"]/android.widget.TextView[2]");

	By createclassification_submitbutton = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Create\"]/android.view.ViewGroup[2]/android.widget.TextView");

	By action_unresolved = By.xpath("//android.view.ViewGroup[@content-desc=\"Unresolved, \"]");

	By action_esculated = By.xpath("//android.view.ViewGroup[@content-desc=\"Escalate, \"]");

	By action_pause = By.xpath("//android.view.ViewGroup[@content-desc=\"Pause, \"]");

	By action_close = By.xpath("//android.view.ViewGroup[@content-desc=\"Close, \"]");

	By action_resolve = By.xpath("//android.view.ViewGroup[@content-desc=\"Resolve, \"]");

	By action_resume = By.xpath("//android.view.ViewGroup[@content-desc=\"Resume, \"]");

	By action_resolvedandclosed = By.xpath("//android.view.ViewGroup[@content-desc=\"Resolved & Closed, \"]");

	By action_deesculate = By.xpath("//android.view.ViewGroup[@content-desc=\"De-escalate, \"]");

	By action_respond = By.xpath("//android.view.ViewGroup[@content-desc=\"Respond, \"]");

	By action_reopen = By.xpath("//android.view.ViewGroup[@content-desc=\"Reopen, \"]");

	By action_undelete = By.xpath("//android.view.ViewGroup[@content-desc=\"Undelete, \"]");

	By action_timeentry = By.xpath("//android.view.ViewGroup[@content-desc=\"Time-Entry, \"]");

	By action_delete = By.xpath("//android.view.ViewGroup[@content-desc=\"Delete, \"]");

	public void username_password(String username, String password) throws InterruptedException {

		driver.findElement(username1).sendKeys(username);
		driver.findElement(password1).sendKeys(password);
		driver.findElement(Signin).click();

	}

	public void settings() throws Throwable {
		driver.findElement(settings).click();
	}

	public void Organizationchart() {
		driver.findElement(Organizationchart).click();
	}

	public void ticketsclassified() throws Throwable {
		driver.findElement(ticketsclassified).click();
	}

	public void actiontickets() throws Throwable {
		driver.findElement(actiontickets).click();
	}

	public void ticketinbox() throws Throwable {
		scrollforticketinbox();
		driver.findElement(ticketinbox).click();
	}

	public void create_department_button() throws Throwable {
		driver.findElement(create_department_button).click();
	}

	public void organizationchart_edit() {
		driver.findElement(organizationchart_edit).click();
	}

	public void organizationchart_delete() {
		driver.findElement(organizationchart_delete).click();
	}

	public void organizationchart_addmember() throws Throwable {
		driver.findElement(organizationchart_addmember).click();
	}

	public void createdepartmenttextfield(String value) throws Throwable {
		driver.findElement(createdepartmenttextfield).sendKeys(value);
		driver.findElement(createdepartmenttextfield).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"))
				.click();

	}

	public void createdepartmenttextfieldmain(String value) throws Throwable {
		driver.findElement(createdepartmenttextfield).sendKeys(value);
		driver.findElement(createdepartmenttextfield).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"))
				.click();

	}

	public void createdept_closebtn() throws Throwable {
		driver.findElement(createdept_closebtn).click();
	}

	public void createdept_managerradiobtn() throws Throwable {
		driver.findElement(createdept_managerradiobtn).click();
	}

	public void createdept_default_assigne() throws Throwable {
		driver.findElement(createdept_default_assigne).click();
	}

	public void createdept_submitbtn() throws Throwable {
		waitForElementPresent(selectmember, 10);
		driver.findElement(createdept_submitbtn).click();
	}

	public void selectmember() throws Throwable {
		waitForElementPresent(selectmember, 10);
		driver.findElement(selectmember).click();

	}

	public void afriddepartmenttyss() throws Throwable {
		driver.findElement(afriddepartmenttyss).click();

	}

	public void createclassificationsbtn() throws Throwable {
		driver.findElement(createclassificationsbtn).click();

	}

	public void createclassification_engineerdropdown() throws Throwable {
		driver.findElement(createclassification_engineerdropdown).click();

	}

	public void createclassification_lowdropdown() throws Throwable {
		driver.findElement(createclassification_lowdropdown).click();

	}

	public void createclassification_subscriber() throws Throwable {
		driver.findElement(createclassification_subscriber).click();

	}

	public void createclassification_partner() throws Throwable {
		driver.findElement(createclassification_partner).click();

	}

	public void createclassification_system() throws Throwable {
		driver.findElement(createclassification_system).click();

	}

	public void createclassification_responsetimetxtfield_Days(String value) throws Throwable {
		driver.findElement(createclassification_responsetimetxtfield_Days).sendKeys(value);

	}

	public void createclassification_responsetimetxtfield_Hours(String value) throws Throwable {
		driver.findElement(createclassification_responsetimetxtfield_Hours).sendKeys(value);

	}

	public void createclassification_responsetimetxtfield_Minutes(String value) throws Throwable {
		driver.findElement(createclassification_responsetimetxtfield_Minutes).sendKeys(value);

	}

	public void createclassification_resolutiontimetxtfield_Days(String value) throws Throwable {
		driver.findElement(createclassification_resolutiontimetxtfield_Days).sendKeys(value);

	}

	public void createclassification_resolutiontimetxtfield_Hours(String value) throws Throwable {
		driver.findElement(createclassification_resolutiontimetxtfield_Hours).sendKeys(value);

	}

	public void createclassification_resolutiontimetxtfield_Minutes(String value) throws Throwable {
		driver.findElement(createclassification_resolutiontimetxtfield_Minutes).sendKeys(value);

	}

	public void createclassification_submitbutton() throws Throwable {
		driver.findElement(createclassification_submitbutton).click();

	}

	public void action_unresolved(String value) throws Throwable {
		driver.findElement(action_unresolved).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_esculated(String value) throws Throwable {
		driver.findElement(action_esculated).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_pause(String value) throws Throwable {
		driver.findElement(action_pause).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_close(String value) throws Throwable {
		driver.findElement(action_close).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_resolve(String value) throws Throwable {
		driver.findElement(action_resolve).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_resume(String value) throws Throwable {
		driver.findElement(action_resume).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_resolvedandclosed(String value) throws Throwable {
		driver.findElement(action_resolvedandclosed).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		scrollDown();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_deesculate(String value) throws Throwable {
		driver.findElement(action_deesculate).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_respond(String value) throws Throwable {
		driver.findElement(action_respond).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_reopen(String value) throws Throwable {
		driver.findElement(action_reopen).click();
		scrollDown();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void action_undelete(String value) throws Throwable {
		driver.findElement(action_undelete).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView"))
				.click();
		

	}

	public void action_timeentry(String value) throws Throwable {
		driver.findElement(action_timeentry).click();
		scrollDown();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();

		

	}

	public void action_delete(String value) throws Throwable {
		driver.findElement(action_delete).click();
		scrollDown();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']")).sendKeys(value);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Add']")).click();
		

	}

	public void isa_addnewfield() throws Throwable {
		driver.findElement(isa_addnewfield).click();
		driver.findElement(
				By.xpath("//android.view.ViewGroup[@content-desc=\"EffectiveDate\"]/android.widget.TextView")).click();

	}

	public void createclassification_incidenttype(String value) throws Throwable {
		driver.findElement(createclassification_incidenttype).sendKeys(value);
		driver.findElement(createclassification_incidenttype).click();
		xycordinates(600, 1383);
		driver.findElement(By.xpath("(//android.view.ViewGroup[@index='1'])[20]")).click();

	}

	public void createclassification_subincidenttype(String value) throws Throwable {
		driver.findElement(createclassification_subincidenttype).sendKeys(value);
		driver.findElement(createclassification_subincidenttype).click();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@index='1'])[20]")).click();

	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public void scrollforticketinbox() {
		@SuppressWarnings("unused")
		int scrollDistance = 2;

		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(1282, 416)))
				.moveTo(PointOption.point(116, 416)).release().perform();
	}

	public WebElement waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public void scrollupmemberdropdown() throws Throwable {
		int scrollDistance = 1; // Adjust this value to control the scroll distance

		// Get the dimensions of the screen
		int screenHeight = driver.manage().window().getSize().getHeight();

		for (scrollDistance = 1; scrollDistance <= 7; scrollDistance++) {
			// Calculate scroll start and end coordinates
			int startX = driver.manage().window().getSize().getWidth() / 2;
			int startY = (int) (screenHeight * 0.4); // Start scroll from 40% down the screen
			int endY = (int) (screenHeight * 0.1); // End scroll at 10% down the screen

			// Create a TouchAction instance and perform the scroll gesture
			TouchAction touchAction = new TouchAction(driver);
			touchAction.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(startX, startY)))
					.moveTo(PointOption.point(startX, endY)).release().perform();
		}
	}

	@SuppressWarnings("deprecation")
	public static void xycordinates(int x, int y) {

		// Create a TouchAction to press and release at the specified coordinates
		@SuppressWarnings("rawtypes")
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(x, y)).release().perform();
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public void scrollDown() throws Throwable {
		@SuppressWarnings("unused")
		int scrollDistance = 2; // Adjust this value to control the scroll distance
		for (int i = 0; i <= 3; i++) {
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
	}

	public void addsubincident(String value) {
		driver.findElement(
				By.xpath("//android.view.ViewGroup[@content-desc=\"Engineering, \"]/android.widget.TextView[1]"))
				.click();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Drt, 1\"]")).click();

		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"))
				.sendKeys(value);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"))
				.click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"))
				.click();

		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"))
				.click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"))
				.sendKeys("25");
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"))
				.sendKeys("25");
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText"))
				.sendKeys("25");
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"))
				.sendKeys("25");
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"))
				.sendKeys("25");
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText"))
				.sendKeys("25");
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Create\"]/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();
	}
}
