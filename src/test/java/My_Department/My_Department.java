package My_Department;

import Methodsexists.*;
import org.testng.annotations.Test;

public class My_Department extends baseCofiguration.Configaration {

	static String username = "Tyss";
	static String password = "Onebilltest1";

	@Test
	public static void My_Department_001() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

	}

	@Test
	public static void My_Department_002() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.createticketbtn, "create ticket button");
	}

	@Test
	public static void My_Department_003() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.createticketbtn();
		methods.elementCheck(methods.selecttemplatesdrpdown, "templatesdropdown");

	}

	// TicketsPageTestcases

	@Test
	public static void My_Department_019() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.FristRequseterTicket();
		methods.elementCheck(methods.EditIcon, "Ticketspage");
	}

	@Test
	public static void My_Department_20() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.ticketstatus, "Ticket Status ");
	}

	@Test
	public static void My_Department_021() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.ticketId, "Ticket Id ");
	}

	@Test
	public static void My_Department_022() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.ticketId, "Ticket Id card ");
	}

	@Test
	public static void My_Department_023() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.ticketId, "Ticket Subject ");
	}

	@Test
	public static void My_Department_024() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.ticketId, "Ticket Description");
	}

	@Test
	public static void My_Department_025() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.CreationDate, "Creation Time ");
	}

	@Test
	public static void My_Department_026() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.InternalExternalIcon, "Internal External Icon ");
	}

	@Test
	public static void My_Department_027() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.AttachmentIcon, "AttachmentIcon ");
	}

	@Test
	public static void My_Department_028() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.elementCheck(methods.TimelogIcon, "TimelogIcon ");
	}

	@Test
	public static void My_Department_029() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.FristRequseterTicket();
		methods.elementCheck(methods.EditTicketdetailsIcon, "Edit Details Icon ");
	}

	@Test
	public static void My_Department_030() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
	}

	@Test
	public static void My_Department_031() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_department, "department dropdown");

	}

	@Test
	public static void My_Department_032() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_incidenttype, "IncidentType");
	}

	@Test
	public static void My_Department_033() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_subincidenttype, "Subincident Type");
	}

	@Test
	public static void My_Department_034() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_priority, "Priority");
	}

	@Test
	public static void My_Department_035() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_cancelbtn, "Cancel");
	}

	@Test
	public static void My_Department_036() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();

		methods.editicon_cancelbtn();
	}

	@Test
	public static void My_Department_037() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();
	}

	@Test
	public static void My_Department_038() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();

	}

	@Test
	public static void My_Department_039() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.editbtn, "Edit Button ");
	}

	@Test
	public static void My_Department_040() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.Ticket_commentField, "Comment Field ");
	}

	@Test
	public static void My_Department_041() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.Ticket_commentField).sendKeys("Abcd12345566");
	}

	@Test
	public static void My_Department_042() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.Ticket_commentField).sendKeys("");
	}

	@Test
	public static void My_Department_043() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.updatebtn, "update Button ");
	}

	@Test
	public static void My_Department_044() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Update action dropdown");
		methods.editpage_Backbutton();
	}

	@Test
	public static void My_Department_045() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Action type  Dropdown ");
		methods.elementCheck(methods.updateAction_Dropdown, "Action_Dropdown ");
		methods.elementCheck(methods.updateDescription_Field, "Update Page description");

	}

	@Test
	public static void My_Department_046() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateAction_Dropdown();

	}

	@Test
	public static void My_Department_047() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateActionType_Dropdown();

	}

	@Test
	public static void My_Department_048() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateDescription_Field("Test description");

	}

	@Test
	public static void My_Department_049() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		driver.findElement(methods.updateDescription_Field).sendKeys("");
		methods.updateDescription_Field("Test description");
		methods.updateCloseButton();

	}

	@Test
	public static void My_Department_050() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateCloseButton();

	}

	@Test
	public static void My_Department_051() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateSubmitButton();
		methods.updateCloseButton();
	}

	@Test
	public static void My_Department_052() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		methods.elementCheck(methods.editbtn, "Edit Button ");
		methods.editbtn_backbtn();
	}

	@Test
	public static void My_Department_053() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_tickettype();

	}

	@Test
	public static void My_Department_054() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subject, "subject");

	}

	@Test
	public static void My_Department_055() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_description, "description");
		methods.editbtn_backbtn();

	}

	@Test
	public static void My_Department_056() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");

	}

	@Test
	public static void My_Department_057() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");
		methods.editbtn_backbtn();

	}

	@Test
	public static void My_Department_058() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");
		methods.editbtn_backbtn();

	}

	@Test
	public static void My_Department_059() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_cancel, "cancel");

	}

	@Test
	public static void My_Department_060() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_edit, "Edit button");

	}

	@Test
	public static void My_Department_061() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_cancel();

	}

	@Test
	public static void My_Department_062() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();
		methods.editbtn_edit();

	}

	@Test
	public static void My_Department_146() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		driver.findElement(methods.searchFilter).sendKeys("ak");

	}

	@Test
	public static void My_Department_147() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		driver.findElement(methods.ticketFilter).click();
		methods.elementCheck(methods.filterpopup, "Filter Popup");
		driver.findElement(methods.ticketFilter).click();

	}

	@Test
	public static void My_Department_148() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentpopup, "Department Popup");
		driver.findElement(methods.departmentDropdown).click();

	}

	@Test
	public static void My_Department_149() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentDropdownCheckboxes, "Checkboxes");

	}

	@Test
	public static void My_Department_150() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_Mydepartment();
		driver.findElement(methods.departmentDropdown).click();
		driver.findElement(methods.departmentDropdownCheckboxes).click();
		driver.findElement(methods.departmentDropdown).click();

	}

}
