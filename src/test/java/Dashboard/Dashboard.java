package Dashboard;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Dashboard extends baseCofiguration.Configaration {

	static String username = "Tyss";
	static String password = "Onebilltest1";

	@Test
	public static void Signin_001_002() throws MalformedURLException, Throwable {

		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		methods.Myticketsdeopdown();
		;
		System.out.println("User is able to login with valid credentials");
	}

	@Test
	public static void Signin_003_004() throws MalformedURLException, Throwable {

		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password("", "");

		String errormessage = driver.findElement(By.xpath(
				"(//android.view.ViewGroup[@content-desc=\"This field is required\"])[1]/android.widget.TextView"))
				.getText();

		String errormessage1 = driver.findElement(By.xpath(
				"(//android.view.ViewGroup[@content-desc=\"This field is required\"])[2]/android.widget.TextView"))
				.getText();

		System.out.println("Error message for username is displayed as :- " + errormessage);

		System.out.println("Error message for password is displayed as :- " + errormessage1);

		driver.quit();
	}

	@Test
	public void Dashboard_005() throws Throwable, MalformedURLException {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		String dashboard = driver
				.findElement(
						By.xpath("(//android.view.ViewGroup[@content-desc=\"Dashboard\"])[1]/android.widget.TextView"))
				.getText();
		String agent = driver
				.findElement(
						By.xpath("//android.view.ViewGroup[@content-desc=\"Agent Activity\"]/android.widget.TextView"))
				.getText();
		System.out.println(dashboard + " & " + agent + " has been displayed");

	}

	@Test
	public void Dashboard_006() throws Throwable, MalformedURLException {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();
		methods.unassignedtkts();

	}

	@Test
	public void Dashboard_007() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);
		methods.Myticketsdeopdown();
		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();
		methods.esculatedtkts();

	}

	@Test
	public void Dashboard_008() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);
		methods.Myticketsdeopdown();
		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();
		methods.overdue();

	}

	@Test
	public void Dashboard_009() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();
		methods.open();

	}

	@Test
	public void Dashboard_010() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();
		methods.resolved();

	}

	@Test
	public void Dashboard_011() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();
		methods.hold();

	}

	@Test
	public void Dashboard_012() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();

		methods.piechart();

		String tktsbystatus = driver.findElement(By.xpath("(//android.widget.TextView[@text='Ticket By Status'])[2]"))
				.getText();

		System.out.println(tktsbystatus + " is displayed ");
	}

	@Test
	public void Dashboard_013() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();

		methods.piechart();
		String tktsbypriority = driver.findElement(By.xpath("//android.widget.TextView[@text='Ticket By Priority']"))
				.getText();

		System.out.println(tktsbypriority + " is displayed ");
	}

	@Test
	public void Dashboard_014() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();

		methods.piechart();
		methods.scrollDown();
		String tktsbypriority = driver.findElement(By.xpath("//android.widget.TextView[@text='Ticket By Type']"))
				.getText();

		System.out.println(tktsbypriority + " is displayed ");
	}

	@Test
	public void Dashboard_015() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		methods.Myticketsdeopdown_mtktsdropdown_alldepartment();
		methods.perioddropdown();
		methods.perioddpd_All();

		methods.barchart();
		methods.scrollDown();
		String tktsbyincident = driver
				.findElement(By.xpath("//android.widget.TextView[@text='Ticket By Incident Type']")).getText();

		System.out.println(tktsbyincident + " is displayed ");
	}

	@Test
	public void Dashboard_016() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		String Mytkts = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"My Tickets\"]/android.widget.TextView"))
				.getText();
		methods.Myticketsdeopdown();
		System.out.println(Mytkts + " is displayed ");
	}

	@Test
	public void Dashboard_017() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		String Mydptm = driver
				.findElement(
						By.xpath("//android.view.ViewGroup[@content-desc=\"My Departments\"]/android.widget.TextView"))
				.getText();
		methods.Myticketsdeopdown();
		System.out.println(Mydptm + " is displayed ");
	}

	@Test
	public void Dashboard_018() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.Myticketsdeopdown();

		String Alldptmnts = driver
				.findElement(
						By.xpath("//android.view.ViewGroup[@content-desc=\"All Departments\"]/android.widget.TextView"))
				.getText();
		methods.Myticketsdeopdown();
		System.out.println(Alldptmnts + " is displayed ");
	}

	@Test
	public void Dashboard_019() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		methods.perioddropdown();

		System.out.println("Period dropdown is displayed ");
	}

	@Test
	public void Dashboard_020() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"All\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_021() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Today\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_022() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Yesterday\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_023() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"This week\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_024() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"This month\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_025() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(
						By.xpath("//android.view.ViewGroup[@content-desc=\"This quarter\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_026() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"This year\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_027() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Last week\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_028() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Last month\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_029() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(
						By.xpath("//android.view.ViewGroup[@content-desc=\"Last quarter\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_030() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);

		methods.perioddropdown();

		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Last year\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();

		System.out.println(period + " is displayed in period dropdown");
	}

	@Test
	public void Dashboard_031() throws Throwable {
		;
		Dashboard_Methods methods = new Dashboard_Methods(driver, dc, url);
		methods.username_password(username, password);
		methods.perioddropdown();
		String period = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Custom\"]/android.widget.TextView"))
				.getText();
		methods.perioddropdown();
		System.out.println(period + " is displayed in period dropdown");
	}

}
