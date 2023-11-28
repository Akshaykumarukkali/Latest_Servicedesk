package Partnertickets;

import Methodsexists.*;
import org.testng.annotations.Test;

public class Partnertestcases extends baseCofiguration.Configaration {

	static String username = "Tyss";
	static String password = "Onebilltest1";

	@Test
	public static void Partnertickets_001() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

	}

	@Test
	public static void Partnertickets_002() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.createticketbtn, "create ticket button");
	}

	@Test
	public static void Partnertickets_039() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.FristRequseterTicket();
		methods.elementCheck(methods.EditIcon, "Ticketspage");
	}

	@Test
	public static void Partnertickets_40() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.ticketstatus, "Ticket Status ");
	}

	@Test
	public static void Partnertickets_041() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.ticketId, "Ticket Id ");
	}

	@Test
	public static void Partnertickets_042() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.ticketId, "Ticket Id card ");
	}

	@Test
	public static void Partnertickets_043() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.ticketId, "Ticket Subject ");
	}

	@Test
	public static void Partnertickets_044() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.ticketId, "Ticket Description");
	}

	@Test
	public static void Partnertickets_045() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.CreationDate, "Creation Time ");
	}

	@Test
	public static void Partnertickets_046() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.InternalExternalIcon, "Internal External Icon ");
	}

	@Test
	public static void Partnertickets_047() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.AttachmentIcon, "AttachmentIcon ");
	}

	@Test
	public static void Partnertickets_048() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.elementCheck(methods.TimelogIcon, "TimelogIcon ");
	}

	@Test
	public static void Partnertickets_049() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.FristRequseterTicket();
		methods.elementCheck(methods.EditTicketdetailsIcon, "Edit Details Icon ");
	}

	@Test
	public static void Partnertickets_050() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
	}

	@Test
	public static void Partnertickets_051() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_department, "department dropdown");

	}

	@Test
	public static void Partnertickets_052() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_incidenttype, "IncidentType");
	}

	@Test
	public static void Partnertickets_053() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_subincidenttype, "Subincident Type");
	}

	@Test
	public static void Partnertickets_054() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_priority, "Priority");
	}

	@Test
	public static void Partnertickets_055() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_cancelbtn, "Cancel");
	}

	@Test
	public static void Partnertickets_056() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();

		methods.editicon_cancelbtn();
	}

	@Test
	public static void Partnertickets_057() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();
	}

	@Test
	public static void Partnertickets_058() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();

	}

	@Test
	public static void Partnertickets_059() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.editbtn, "Edit Button ");
	}

	@Test
	public static void Partnertickets_060() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.Ticket_commentField, "Comment Field ");
	}

	@Test
	public static void Partnertickets_061() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.Ticket_commentField).sendKeys("Abcd12345566");
	}

	@Test
	public static void Partnertickets_062() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.Ticket_commentField).sendKeys("");
	}

	@Test
	public static void Partnertickets_063() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.updatebtn, "update Button ");
	}

	@Test
	public static void Partnertickets_064() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Update action dropdown");
		methods.editpage_Backbutton();
	}

	@Test
	public static void Partnertickets_065() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Action type  Dropdown ");
		methods.elementCheck(methods.updateAction_Dropdown, "Action_Dropdown ");
		methods.elementCheck(methods.updateDescription_Field, "Update Page description");

	}

	@Test
	public static void Partnertickets_066() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateAction_Dropdown();

	}

	@Test
	public static void Partnertickets_067() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateActionType_Dropdown();

	}

	@Test
	public static void Partnertickets_070() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateDescription_Field("Test description");

	}

	@Test
	public static void Partnertickets_071() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		driver.findElement(methods.updateDescription_Field).sendKeys("");
		methods.updateDescription_Field("Test description");
		methods.updateCloseButton();

	}

	@Test
	public static void Partnertickets_072() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateCloseButton();

	}

	@Test
	public static void Partnertickets_073() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateSubmitButton();
		methods.updateCloseButton();
	}

	@Test
	public static void Partnertickets_074() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		methods.elementCheck(methods.editbtn, "Edit Button ");
		methods.editbtn_backbtn();
	}

	@Test
	public static void Partnertickets_075() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_tickettype();

	}

	@Test
	public static void Partnertickets_076() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subject, "subject");

	}

	@Test
	public static void Partnertickets_077() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_description, "description");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Partnertickets_078() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");

	}

	@Test
	public static void Partnertickets_079() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Partnertickets_080() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Partnertickets_081() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_cancel, "cancel");

	}

	@Test
	public static void Partnertickets_082() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_edit, "Edit button");

	}

	@Test
	public static void Partnertickets_083() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_cancel();

	}

	@Test
	public static void Partnertickets_084() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();
		methods.editbtn_edit();

	}

	@Test
	public static void Partnertickets_171() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		driver.findElement(methods.searchFilter).sendKeys("ak");

	}

	@Test
	public static void Partnertickets_172() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		driver.findElement(methods.ticketFilter).click();
		methods.elementCheck(methods.filterpopup, "Filter Popup");
		driver.findElement(methods.ticketFilter).click();

	}

	@Test
	public static void Partnertickets_173() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentpopup, "Department Popup");
		driver.findElement(methods.departmentDropdown).click();

	}

	@Test
	public static void Partnertickets_174() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentDropdownCheckboxes, "Checkboxes");

	}

	@Test
	public static void Partnertickets_175() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_partnertickets();
		driver.findElement(methods.departmentDropdown).click();
		driver.findElement(methods.departmentDropdownCheckboxes).click();
		driver.findElement(methods.departmentDropdown).click();

	}

}
