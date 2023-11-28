package Requestertickets;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import Methodsexists.*;

public class requestertktstestcase extends baseCofiguration.Configaration {

	static String username = "Tyss";
	static String password = "Onebilltest1";

	@Test
	public static void Requester_001() throws MalformedURLException, InterruptedException {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.firsttkt();

	}

	@Test
	public static void Requester_002() throws MalformedURLException, InterruptedException {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.requesterdropdown, "TicketDropdown");

	}

	@Test
	public static void Requester_003() throws MalformedURLException, InterruptedException {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

	}

	@Test
	public static void Requester_004() throws MalformedURLException, InterruptedException {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

	}

	@Test
	public static void Requester_005() throws MalformedURLException, InterruptedException {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.elementCheck(methods.createticketbtn, "create ticket");
		methods.createticketbtn();

	}

	@Test
	public static void Requester_006() throws MalformedURLException, InterruptedException {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.createticketbtn();
	}

	@Test
	public static void Requester_007() throws MalformedURLException, InterruptedException {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.firsttkt();
		methods.editbtn();

	}

	@Test
	public static void Requester_039() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.EditIcon, "Ticketspage");
	}

	@Test
	public static void Requester_40() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.elementCheck(methods.ticketstatus, "Ticket Status ");
	}

	@Test
	public static void Requester_041() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.elementCheck(methods.ticketId, "Ticket Id ");
	}

	@Test
	public static void Requester_042() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.elementCheck(methods.ticketId, "Ticket Id card ");
	}

	@Test
	public static void Requester_043() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.elementCheck(methods.ticketId, "Ticket Subject ");
	}

	@Test
	public static void Requester_044() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.elementCheck(methods.ticketId, "Ticket Description");
	}

	@Test
	public static void Requester_045() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.elementCheck(methods.CreationDate, "Creation Time ");
	}

	@Test
	public static void Requester_046() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.elementCheck(methods.InternalExternalIcon, "Internal External Icon ");
	}

	@Test
	public static void Requester_047() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.elementCheck(methods.AttachmentIcon, "AttachmentIcon ");
	}

	@Test
	public static void Requester_048() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.elementCheck(methods.TimelogIcon, "TimelogIcon ");
	}

	@Test
	public static void Requester_049() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.EditTicketdetailsIcon, "Edit Details Icon ");
	}

	@Test
	public static void Requester_050() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
	}

	@Test
	public static void Requester_051() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_department, "department dropdown");

	}

	@Test
	public static void Requester_052() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_incidenttype, "IncidentType");
	}

	@Test
	public static void Requester_053() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_subincidenttype, "Subincident Type");
	}

	@Test
	public static void Requester_054() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_priority, "Priority");
	}

	@Test
	public static void Requester_055() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_cancelbtn, "Cancel");
	}

	@Test
	public static void Requester_056() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();

		methods.editicon_cancelbtn();
	}

	@Test
	public static void Requester_057() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();
	}

	@Test
	public static void Requester_058() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();

	}

	@Test
	public static void Requester_059() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.editbtn, "Edit Button ");
	}

	@Test
	public static void Requester_060() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.Ticket_commentField, "Comment Field ");
	}

	@Test
	public static void Requester_061() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.Ticket_commentField).sendKeys("Abcd12345566");
	}

	@Test
	public static void Requester_062() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.Ticket_commentField).sendKeys("");
	}

	@Test
	public static void Requester_063() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.updatebtn, "update Button ");
	}

	@Test
	public static void Requester_064() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Update action dropdown");
		methods.editpage_Backbutton();
	}

	@Test
	public static void Requester_065() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Action type  Dropdown ");
		methods.elementCheck(methods.updateAction_Dropdown, "Action_Dropdown ");
		methods.elementCheck(methods.updateDescription_Field, "Update Page description");

	}

	@Test
	public static void Requester_066() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateAction_Dropdown();

	}

	@Test
	public static void Requester_067() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateActionType_Dropdown();

	}

	@Test
	public static void Requester_070() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateDescription_Field("Test description");

	}

	@Test
	public static void Requester_071() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		driver.findElement(methods.updateDescription_Field).sendKeys("");
		methods.updateDescription_Field("Test description");
		methods.updateCloseButton();

	}

	@Test
	public static void Requester_072() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateCloseButton();

	}

	@Test
	public static void Requester_073() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateSubmitButton();
		methods.updateCloseButton();
	}

	@Test
	public static void Requester_074() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		methods.elementCheck(methods.editbtn, "Edit Button ");
		methods.editbtn_backbtn();
	}

	@Test
	public static void Requester_075() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_tickettype();

	}

	@Test
	public static void Requester_076() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subject, "subject");

	}

	@Test
	public static void Requester_077() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_description, "description");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_078() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");

	}

	@Test
	public static void Requester_079() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_080() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");
		methods.editbtn_backbtn();

	}

	@Test
	public static void Requester_081() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_cancel, "cancel");

	}

	@Test
	public static void Requester_082() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_edit, "Edit button");

	}

	@Test
	public static void Requester_083() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_cancel();

	}

	@Test
	public static void Requester_084() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();
		methods.editbtn_edit();

	}

	@Test
	public static void Requester_171() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		driver.findElement(methods.searchFilter).sendKeys("ak");

	}

	@Test
	public static void Requester_172() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		driver.findElement(methods.ticketFilter).click();
		methods.elementCheck(methods.filterpopup, "Filter Popup");
		driver.findElement(methods.ticketFilter).click();

	}

	@Test
	public static void Requester_173() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentpopup, "Department Popup");
		driver.findElement(methods.departmentDropdown).click();

	}

	@Test
	public static void Requester_174() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentDropdownCheckboxes, "Checkboxes");

	}

	@Test
	public static void Requester_175() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();

		driver.findElement(methods.departmentDropdown).click();
		driver.findElement(methods.departmentDropdownCheckboxes).click();
		driver.findElement(methods.departmentDropdown).click();

	}

}
