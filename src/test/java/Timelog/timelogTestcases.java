package Timelog;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

public class timelogTestcases extends baseCofiguration.Configaration {

	static String username = "Tyss";
	static String password = "Onebilltest1";

	@Test
	public static void timelog_001() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.elementCheck(methods.timeLogCard, "Timelog page");
	}

	@Test
	public static void timelog_002() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.elementCheck(methods.timeLogtime, "Timelog ");
	}

	@Test
	public static void timelog_003() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

		methods.elementCheck(methods.timeLogTicketnumber, "Timelog Ticketnumber ");
	}

	@Test
	public static void timelog_004() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

		methods.elementCheck(methods.timeLogAccountnumber, "Timelog Timeline ");
	}

	@Test
	public static void timelog_005() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

	}

	@Test
	public static void timelog_006() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

		methods.elementCheck(methods.timeLogTaskowner, "Timelog Taskowner ");
	}

	@Test
	public static void timelog_007() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

		methods.elementCheck(methods.timeLogTimeinminutes, "Timelog minutes ");
	}

	@Test
	public static void timelog_008() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

		methods.elementCheck(methods.timelogbillable, "Timelog billable ");
	}

	@Test
	public static void timelog_009() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

		methods.elementCheck(methods.timeLogTaskowner, "Timelog taskowner ");
	}

	@Test
	public static void timelog_010() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

		methods.elementCheck(methods.exportButton, "Timelog exportbutton ");

	}

	@Test
	public static void timelog_011() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
	}

	@Test
	public static void timelog_012() throws MalformedURLException, InterruptedException {
		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		methods.elementCheck(methods.timelogperiodDropdown, "Timelog period dropdown ");
	}

	@Test
	public static void timelog_013() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionAll, "All Timelog ");
	}

	@Test
	public static void timelog_014() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionToday, "today Option ");
	}

	@Test
	public static void timelog_015() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionyesterday, "All Timelog ");
	}

	@Test
	public static void timelog_016() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionThisweek, "All Timelog ");
	}

	@Test
	public static void timelog_017() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionThismonth, "This Month ");
	}

	@Test
	public static void timelog_018() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionThisquartar, "This Quarter ");
	}

	@Test
	public static void timelog_019() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();

		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionThisyear, "This Year ");
	}

	@Test
	public static void timelog_020() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionLastweek, "Last week ");
	}

	@Test
	public static void timelog_021() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.exportButtonclick();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionLastmonth, "Last month ");
	}

	@Test
	public static void timelog_022() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionLastquarter, "Last Quarter ");
	}

	@Test
	public static void timelog_023() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptionLastyear, "last Year ");
	}

	@Test
	public static void timelog_024() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.timelogperiodDropdownclick();
		methods.elementCheck(methods.periodDropdownOptioncustom, "Custom ");
	}

	@Test
	public static void timelog_025() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.elementCheck(methods.SelectDropdown, "Select dropdown ");
	}

	@Test
	public static void timelog_026() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.SelectDropdownclick();
		methods.elementCheck(methods.SelectDropdownOptionbillable, "Billable option ");
	}

	@Test
	public static void timelog_027() throws MalformedURLException, InterruptedException {

		timeLogrmethods methods = new timeLogrmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.timelogTab();
		methods.SelectDropdownclick();
		methods.elementCheck(methods.SelectDropdownOptionnonbillable, "Select dropdown ");
	}

}
