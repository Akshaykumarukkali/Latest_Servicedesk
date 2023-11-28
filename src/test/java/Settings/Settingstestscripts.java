package Settings;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Settingstestscripts extends baseCofiguration.Configaration {

	static String username = "Tyss";
	static String password = "Onebilltest1";
	static String createdepartment = createdepartment1;

//before running the script make sure delete the departments 

	@Test
	public static void Settings_001() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();

	}

	@Test
	public static void Settings_002() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);

		methods.settings();
		String value = driver.findElement(methods.Organizationchart).getText();
		System.out.println(value + " is present");

	}

	@Test
	public static void Settings_003() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();

	}

	@Test
	public static void Settings_004() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();

	}

	@Test
	public static void Settings_006() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		String value = driver.findElement(methods.create_department_button).getText();
		System.out.println(value + " is present");

	}

	@Test
	public static void Settings_007() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.create_department_button();

	}

	@Test
	public static void Settings_008() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.create_department_button();
		methods.createdepartmenttextfield(createdepartment);
	}

	@Test
	public static void Settings_010() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.create_department_button();
		methods.selectmember();
		driver.findElement(By.xpath("(//android.widget.CheckBox[@content-desc=\"\"])[1]/android.widget.TextView"))
				.click();

		methods.createdept_submitbtn();
		methods.createdept_submitbtn();

		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"))
				.click();
	}

	@Test
	public static void Settings_011() throws Throwable {
		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.create_department_button();
		methods.createdepartmenttextfield(createdepartment);
		methods.selectmember();
		driver.findElement(By.xpath("(//android.widget.CheckBox[@content-desc=\"\"])[2]/android.widget.TextView"))
				.click();
		methods.createdept_submitbtn();
		methods.createdept_submitbtn();
	}

	@Test
	public static void Settings_013() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.create_department_button();
		methods.selectmember();

		driver.findElement(By.xpath("(//android.widget.CheckBox[@content-desc=\"\"])[2]/android.widget.TextView"))
				.click();
		methods.createdept_submitbtn();
		methods.createdept_submitbtn();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"))
				.click();
	}

	@Test
	public static void Settings_014() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.create_department_button();

		methods.selectmember();

		driver.findElement(By.xpath("(//android.widget.CheckBox[@content-desc=\"\"])[3]/android.widget.TextView"))
				.click();
		methods.createdept_submitbtn();
		methods.createdept_default_assigne();

	}

	@Test
	public static void Settings_016() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.create_department_button();
		methods.selectmember();

		driver.findElement(By.xpath("(//android.widget.CheckBox[@content-desc=\"\"])[1]/android.widget.TextView"))
				.click();
		methods.createdept_submitbtn();
		methods.createdept_managerradiobtn();

	}

	@Test
	public static void Settings_017() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.create_department_button();

		methods.createdept_closebtn();

	}

	@Test
	public static void Settings_018() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.scrollDown();

	}

	@Test
	public static void Settings_019() throws Throwable {
		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.scrollDown();
		methods.organizationchart_edit();

	}

	@Test
	public static void Settings_020() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.scrollDown();
		methods.organizationchart_delete();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.View"))
				.click();

	}

	@Test
	public static void Settings_021() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.scrollDown();
		methods.organizationchart_delete();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.widget.TextView"))
				.click();
		System.out.println("Delete popup is displayed");

	}

	@Test
	public static void Settings_022() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.scrollDown();
		methods.scrollDown();
		methods.organizationchart_delete();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Delete\"]/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();

		System.out.println("Deleted a department");

	}

	@Test
	public static void Settings_023() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.scrollDown();
		methods.organizationchart_delete();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.View"))
				.click();
		System.out.println("Delete popup, cancel button is displayed");

	}

	@Test
	public static void Settings_024() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.scrollDown();
		methods.organizationchart_addmember();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Close\"]/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();

	}

	@Test
	public static void Settings_025() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.scrollDown();
		methods.scrollDown();
		methods.organizationchart_addmember();
		Thread.sleep(4000);
		methods.scrollDown();

		methods.scrollDown();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.CheckBox[@content-desc=\"\"])[4]/android.widget.TextView"))
				.click();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();

	}

	@Test
	public static void Settings_026() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.scrollDown();
		methods.organizationchart_addmember();
		methods.scrollDown();
		driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='RNE__Checkbox__Icon'])[6]")).click();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();

	}

	@Test
	public static void Settings_027() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();

		methods.scrollDown();
		methods.organizationchart_addmember();
		methods.scrollDown();
		methods.scrollDown();
		driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[13]")).click();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();

	}

	@Test
	public static void Settings_028() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();

		methods.scrollDown();
		methods.organizationchart_addmember();
		methods.scrollDown();
		methods.scrollDown();
		methods.scrollDown();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//android.view.ViewGroup[@index='0'])[16]")).click();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();

	}

	@Test
	public static void Settings_029() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();

		methods.scrollDown();
		methods.scrollDown();
		methods.organizationchart_edit();
		System.out.println("User cannot edit the department name");
	}

	@Test
	public static void Settings_030() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();

		methods.scrollDown();
		methods.scrollDown();
		methods.organizationchart_edit();
		System.out.println("Updated member is displayed");
	}

	@Test
	public static void Settings_031() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
	}

	@Test
	public static void Settings_032() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.afriddepartmenttyss();
	}

	@Test
	public static void Settings_035() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_lowdropdown();
		methods.createclassification_lowdropdown();
		System.out.println("Low dropdown is is displayed");
	}

	@Test
	public static void Settings_036() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_lowdropdown();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Medium\"]/android.widget.TextView"))
				.click();
		System.out.println("Medium is is displayed");
	}

	@Test
	public static void Settings_037() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_lowdropdown();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"High\"]/android.widget.TextView"))
				.click();
		System.out.println("High is is displayed");
	}

	@Test
	public static void Settings_038() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_lowdropdown();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Critical\"]/android.widget.TextView"))
				.click();
		System.out.println("Critical is is displayed");
	}

	@Test
	public static void Settings_039() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_subscriber();
		System.out.println("Subscriber checkbox displayed");
	}

	@Test
	public static void Settings_040() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_partner();
		System.out.println("Partner checkbox displayed");
	}

	@Test
	public static void Settings_041() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_system();
		System.out.println("System checkbox displayed");
	}

	@Test
	public static void Settings_042() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_responsetimetxtfield_Days("25");
	}

	@Test
	public static void Settings_043() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_responsetimetxtfield_Hours("25");
	}

	@Test
	public static void Settings_044() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_responsetimetxtfield_Minutes("25");
	}

	@Test
	public static void Settings_045() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_resolutiontimetxtfield_Days("25");
	}

	@Test
	public static void Settings_046() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_resolutiontimetxtfield_Hours("25");
	}

	@Test
	public static void Settings_047() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_resolutiontimetxtfield_Minutes("25");
	}

	@Test
	public static void Settings_048() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.scrollDown();
		System.out.println("ISA add field is displayed");

	}

	@Test
	public static void Settings_049() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.scrollDown();
		methods.isa_addnewfield();

	}

	@Test
	public static void Settings_050() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_incidenttype(createdepartment);
		methods.createclassification_subincidenttype(createdepartment);
		methods.createclassification_responsetimetxtfield_Days("25");
		methods.createclassification_responsetimetxtfield_Hours("25");
		methods.createclassification_responsetimetxtfield_Minutes("25");
		methods.createclassification_resolutiontimetxtfield_Days("25");
		methods.createclassification_resolutiontimetxtfield_Hours("25");
		methods.createclassification_resolutiontimetxtfield_Minutes("25");
		methods.scrollDown();
		methods.createclassification_submitbutton();

	}

	@Test
	public static void Settings_051() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		methods.createclassificationsbtn();
		methods.createclassification_submitbutton();
	}

	@Test
	public static void Settings_052() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.ticketsclassified();
		driver.findElement(
				By.xpath("//android.view.ViewGroup[@content-desc=\"Engineering, \"]/android.widget.TextView[1]"))
				.click();
	}

	@Test
	public static void Settings_066() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_unresolved("testautomation11oct1");

	}

	@Test
	public static void Settings_067() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_resolvedandclosed("test121oct1");

	}

	@Test
	public static void Settings_068() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_timeentry("test121oct1");

	}

	@Test
	public static void Settings_069() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_delete("testdata1231oct1");

	}

	@Test
	public static void Settings_070() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_reopen("Testdata11oct1");

	}

	@Test
	public static void Settings_071() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_close("Testdata11oct1");

	}

	@Test
	public static void Settings_072() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_unresolved("testdata11oct1");

	}

	@Test
	public static void Settings_073() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_resolve("testdata11oct1");

	}

	@Test
	public static void Settings_074() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_respond("testdata11oct1");

	}

	@Test
	public static void Settings_075() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_resume("testdata11oct1");

	}

	@Test
	public static void Settings_076() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_pause("testdata11oct1");

	}

	@Test
	public static void Settings_077() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_deesculate("testdata11oct1");

	}

	@Test
	public static void Settings_078() throws Throwable {

		Settingsmethods methods = new Settingsmethods(driver, dc, url);
		methods.username_password(username, password);
		methods.settings();
		methods.actiontickets();
		methods.action_esculated("testdata11oct1");

	}

}
