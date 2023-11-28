package All_Departments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Methodsexists.*;

public class All_Department extends baseCofiguration.Configaration {

	static String username = "Tyss";
	static String password = "Onebilltest1";
	static String newtag = "new tag 5";
	static String newtagvalu1 = "new tag test aut5";

	@Test
	public static void All_Departments__001() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

	}

	@Test
	public static void All_Departments__002() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

	}

	@Test
	public static void All_Departments__004() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.firsttkt, "Tickets which is raised by user as");

	}

	@Test
	public static void All_Departments__005() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.createticketbtn, "create ticket button");

	}

	@Test
	public static void All_Departments__006() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.create_as_template, "Create ticket page is open as");

	}

	@Test
	public static void All_Departments__007() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.firsttkt();
		methods.elementCheck(methods.editbtn, "Edit button as");

	}

	@Test
	public static void All_Departments__008() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.selecttemplatesdrpdown, "templatesdropdown");

	}

	@Test
	public static void All_Departments__009() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.tickettype, "ticketTypedropdown");

	}

	@Test
	public static void All_Departments__010() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.subject, "SubjectField");
	}

	@Test
	public static void All_Departments__011() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.description, "DescriptionFiled");
	}

	@Test
	public static void All_Departments__012() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.description("Testing Description Ak1");
	}

	@Test
	public static void All_Departments__013() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.description("testdata1");
	}

	@Test
	public static void All_Departments__014() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.AccountnameField, "AccountnameField");
		methods.elementCheck(methods.CustomerContactnameField, "CustomerContactNameField ");

	}

	@Test
	public static void All_Departments__015() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.AccountTypeDropdown, "AccountTypeDropdown");

	}

	@Test
	public static void All_Departments__022() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.CustomerContactnameField, "CustomerContactNameField ");

	}

	@Test
	public static void All_Departments__024() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.department_Dropdown, "Department name");
	}

	@Test
	public static void All_Departments__026() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.incidenttype, "IncedentType Dropdown");
	}

	@Test
	public static void All_Departments__032() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.scrollDown();
		methods.elementCheck(methods.attachment, "Attachment");
	}

	@Test
	public static void All_Departments__033() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.create_as_template, "create as template Button ");
	}

	@Test
	public static void All_Departments__037() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.createticketbtn();
		methods.elementCheck(methods.create_button_in_createnewtkt, "create_button");

	}

	// TicketsPageTestcases

	@Test
	public static void All_Departments__039() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.elementCheck(methods.EditIcon, "Ticketspage");
	}

	@Test
	public static void All_Departments__40() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.ticketstatus, "Ticket Status ");
	}

	@Test
	public static void All_Departments__041() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.ticketId, "Ticket Id ");
	}

	@Test
	public static void All_Departments__042() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.ticketId, "Ticket Id card ");
	}

	@Test
	public static void All_Departments__043() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.ticketId, "Ticket Subject ");
	}

	@Test
	public static void All_Departments__044() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.ticketId, "Ticket Description");
	}

	@Test
	public static void All_Departments__045() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.CreationDate, "Creation Time ");
	}

	@Test
	public static void All_Departments__046() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.InternalExternalIcon, "Internal External Icon ");
	}

	@Test
	public static void All_Departments__047() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.AttachmentIcon, "AttachmentIcon ");
	}

	@Test
	public static void All_Departments__048() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.elementCheck(methods.TimelogIcon, "TimelogIcon ");
	}

	@Test
	public static void All_Departments__049() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.elementCheck(methods.EditTicketdetailsIcon, "Edit Details Icon ");
	}

	@Test
	public static void All_Departments__050() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
	}

	@Test
	public static void All_Departments__051() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_department, "department dropdown");

	}

	@Test
	public static void All_Departments__052() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_incidenttype, "IncidentType");
	}

	@Test
	public static void All_Departments__053() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_subincidenttype, "Subincident Type");
	}

	@Test
	public static void All_Departments__054() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_priority, "Priority");
	}

	@Test
	public static void All_Departments__055() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.elementCheck(methods.editicon_cancelbtn, "Cancel");
	}

	@Test
	public static void All_Departments__056() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();

		methods.editicon_cancelbtn();
	}

	@Test
	public static void All_Departments__057() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();
	}

	@Test
	public static void All_Departments__058() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.EditTicketdetailsIcon).click();
		methods.editicon_submitbtn();

	}

	@Test
	public static void All_Departments__059() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.editbtn, "Edit Button ");
	}

	@Test
	public static void All_Departments__060() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.Ticket_commentField, "Comment Field ");
	}

	@Test
	public static void All_Departments__061() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.Ticket_commentField).sendKeys("Abcd12345566");
	}

	@Test
	public static void All_Departments__062() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.Ticket_commentField).sendKeys("");
	}

	@Test
	public static void All_Departments__063() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		methods.elementCheck(methods.updatebtn, "update Button ");
	}

	@Test
	public static void All_Departments__064() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Update action dropdown");
		methods.editpage_Backbutton();
	}

	@Test
	public static void All_Departments__065() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();

		methods.elementCheck(methods.updateActionType_Dropdown, "Action type  Dropdown ");
		methods.elementCheck(methods.updateAction_Dropdown, "Action_Dropdown ");
		methods.elementCheck(methods.updateDescription_Field, "Update Page description");

	}

	@Test
	public static void All_Departments__066() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateAction_Dropdown();

	}

	@Test
	public static void All_Departments__067() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateActionType_Dropdown();

	}

	@Test
	public static void All_Departments__070() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateDescription_Field("Test description");

	}

	@Test
	public static void All_Departments__071() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		driver.findElement(methods.updateDescription_Field).sendKeys("");
		methods.updateDescription_Field("Test description");
		methods.updateCloseButton();

	}

	@Test
	public static void All_Departments__072() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateCloseButton();

	}

	@Test
	public static void All_Departments__073() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		driver.findElement(methods.updatebtn).click();
		methods.updateSubmitButton();
		methods.updateCloseButton();
	}

	@Test
	public static void All_Departments__074() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		methods.elementCheck(methods.editbtn, "Edit Button ");
		methods.editbtn_backbtn();
	}

	@Test
	public static void All_Departments__075() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_tickettype();

	}

	@Test
	public static void All_Departments__076() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subject, "subject");

	}

	@Test
	public static void All_Departments__077() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_description, "description");
		methods.editbtn_backbtn();

	}

	@Test
	public static void All_Departments__078() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");

	}

	@Test
	public static void All_Departments__079() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_subscribername, "subscribername");

	}

	@Test
	public static void All_Departments__080() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

	}

	@Test
	public static void All_Departments__081() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_cancel, "cancel");

	}

	@Test
	public static void All_Departments__082() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.elementCheck(methods.editbtn_edit, "Edit button");

	}

	@Test
	public static void All_Departments__083() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();

		methods.editbtn_cancel();

	}

	@Test
	public static void All_Departments__084() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		driver.findElement(methods.editbtn).click();
		methods.editbtn_edit();

	}

	///////////////////////////////////////// icon

	@Test
	public static void All_Departments__085() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		methods.iconbtn();
		methods.iconbtn();

	}

	@Test
	public static void All_Departments__086() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		methods.iconbtn();

		methods.elementCheck(methods.iconbtn_tags, "Tags icon");

		methods.iconbtn();

	}

	@SuppressWarnings("static-access")

	@Test
	public static void All_Departments__088() throws Throwable {

		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);

		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();

		methods.FristRequseterTicket();

		methods.iconbtn();

		methods.iconbtn_tags();

		methods.xycordinates(50, 677);

	}

	@Test
	public static void All_Departments__089() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_tags();
		methods.newtags(newtag);

	}

	@Test
	public static void All_Departments__090() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_tags();
		driver.findElement(methods.newtags).click();
		methods.newtags_cancel();
		methods.newtags_cancel();

	}

	@Test
	public static void All_Departments__091() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_tags();
		methods.newtags(newtagvalu1);
		methods.newtags_submit();

	}

	@Test
	public static void All_Departments__092() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_watcher, "Watcher");

	}

	@SuppressWarnings("static-access")

	@Test
	public static void All_Departments__093() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_watcher();
		methods.xycordinates(20, 677);

	}

	@Test
	public static void All_Departments__094() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_watcher();

		methods.elementCheck(methods.watcher_internal, "Internal radio button ");
		methods.elementCheck(methods.watcher_external, "External radio button ");

	}

	@SuppressWarnings("static-access")

	@Test
	public static void All_Departments__095() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_watcher();

		driver.findElement(methods.watcher_textfield).click();
		methods.xycordinates(20, 677);
		methods.xycordinates(20, 677);

	}

	@Test
	public static void All_Departments__096() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_clone, "Clone");
		methods.iconbtn();
	}

	@Test
	public static void All_Departments__097() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();

	}

	@Test
	public static void All_Departments__098() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_subject, "Subject field");

	}

	@Test
	public static void All_Departments__099() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_describtion, "Clone description");

	}

	@Test
	public static void All_Departments__100() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.clone_describtion("describition value");

	}

	@Test
	public static void All_Departments__101() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.clone_describtion("");

	}

	@Test
	public static void All_Departments__102() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_customername, "Customer name");
		methods.elementCheck(methods.clone_accountname, "account name");

	}

	@Test
	public static void All_Departments__103() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_customercontact, "Customer contact");

	}

	@Test
	public static void All_Departments__104() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.clone_accountname("");

	}

	@Test
	public static void All_Departments__106() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.elementCheck(methods.clone_department, "Department");

	}

	@Test
	public static void All_Departments__107() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.clone_department();

	}

	@Test
	public static void All_Departments__108() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_incidenttype, "INCIDENTTYPE");

	}

	@Test
	public static void All_Departments__110() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();

	}

	@Test
	public static void All_Departments__109() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_incidentsubtype, "SUBINCIDENTTYPE");

	}

	@Test
	public static void All_Departments__111() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.clone_priority();
		methods.clone_priority();

	}

	@Test
	public static void All_Departments__112() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_priority, "Priority");

	}

	@Test
	public static void All_Departments__113() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_cancel, "cancel");

	}

	@Test
	public static void All_Departments__114() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.clone_cancel();

	}

	@Test
	public static void All_Departments__115() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.elementCheck(methods.clone_submit, "Create");

	}

	@Test
	public static void All_Departments__116() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.firsttkt();
		methods.iconbtn();
		methods.iconbtn_clone();
		methods.scrollDown();
		methods.clone_submit();
		System.out.println("Successfully cloned");

	}

	@Test
	public static void All_Departments__117() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_history, "History");
	}

	@Test
	public static void All_Departments__118() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_history();
	}

	@Test
	public static void All_Departments__119() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_history();
		methods.elementCheck(methods.history_data, "History data as");
	}

	@Test
	public static void All_Departments__120() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_properties, "properties");
	}

	@Test
	public static void All_Departments__121() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_properties();
	}

	@Test
	public static void All_Departments__122() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_properties();
		methods.elementCheck(methods.properties_data, "Formcard");
	}

	@Test
	public static void All_Departments__123() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_timelog, "Timelog");
	}

	@Test
	public static void All_Departments__124() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
	}

	@Test
	public static void All_Departments__125() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.elementCheck(methods.timelog_timehistory, "History of the the ticket");
	}

	@Test
	public static void All_Departments__126() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.elementCheck(methods.timelog_timeentry, "Timeentry");
	}

	@Test
	public static void All_Departments__127() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();

	}

	@Test
	public static void All_Departments__128() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_taskowner, "Task Owner field");

	}

	@Test
	public static void All_Departments__129() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_timecompletion, "timecompletion");

	}

	@Test
	public static void All_Departments__130() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_calender, "Calender");

	}

	@Test
	public static void All_Departments__131() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_Billable, "Billable");
		methods.elementCheck(methods.timeentry_Nonbillable, "Non billable");

	}

	@Test
	public static void All_Departments__132() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_Hours, "Hours");

	}

	@Test
	public static void All_Departments__133() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_Hours(50);
	}

	@Test
	public static void All_Departments__134() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_Hours(0);

	}

	@Test
	public static void All_Departments__135() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_Hours(50);

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public static void All_Departments__136() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_minutes, "Minutes");

	}

	@Test
	public static void All_Departments__137() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_minutes(0);

	}

	@Test
	public static void All_Departments__138() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_timelogactiontype, "Time log actions");

	}

	@Test
	public static void All_Departments__139() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_timelogactiontype();
		methods.timeentry_timelogactiontype();

	}

	@Test
	public static void All_Departments__140() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_description, "description");

	}

	@Test
	public static void All_Departments__141() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_description("type of data");

	}

	@Test
	public static void All_Departments__142() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_description("");

	}

	@Test
	public static void All_Departments__143() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.elementCheck(methods.timeentry_close, "Close");
		methods.elementCheck(methods.timeentry_submit, "Submit");

	}

	@Test
	public static void All_Departments__144() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_taskowner();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]"))
				.click();
		methods.timeentry_Hours(50);
		methods.timeentry_minutes(50);
		methods.timeentry_timelogactiontype();
		driver.findElement(
				By.xpath("//android.view.ViewGroup[@content-desc=\"Professional Services\"]/android.widget.TextView"))
				.click();
		methods.timeentry_description("description");

	}

	@Test
	public static void All_Departments__145() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_timelog();
		methods.timelog_timeentry();
		methods.timeentry_close();
		methods.timelog_backbtn();
	}

	@Test
	public static void All_Departments__146() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_addon, "Addon");
		methods.iconbtn();

	}

	@Test
	public static void All_Departments__147() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.elementCheck(methods.iconbtn_addon, "add-on Icon ");
		methods.iconbtn();
	}

	@Test
	public static void All_Departments__148() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addontemplatedropdown, "addon template dropdown ");

	}

	@Test
	public static void All_Departments__149() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addontickettypedropdown, "addon Ticket Type dropdown ");

	}

	@Test
	public static void All_Departments__150() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();

		methods.elementCheck(methods.SubjectField, "Subject Field ");

	}

	@Test
	public static void All_Departments__151() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();

		methods.elementCheck(methods.addonDescriptionField, "Description Field ");

	}

	@Test
	public static void All_Departments__152() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		driver.findElement(methods.addonDescriptionField).sendKeys("Descrption 12334");

	}

	@Test
	public static void All_Departments__153() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		driver.findElement(methods.addonDescriptionField).sendKeys("");

	}

	@Test
	public static void All_Departments__154() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addonCustomername, "Customer name");
		methods.elementCheck(methods.addonCustomerContact, "Customer Contact");
		methods.elementCheck(methods.addonCustomeraccount, "Customer Account");

	}

	@Test
	public static void All_Departments__155() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addonCustomerContact, "Customer Contact");
		methods.elementCheck(methods.addonCustomeraccount, "Customer Account");

	}

	@Test
	public static void All_Departments__156() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addonDepartment, "Department Field ");

	}

	@Test
	public static void All_Departments__157() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.elementCheck(methods.addonDepartment, "Department dropdown");

	}

	@Test
	public static void All_Departments__158() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonincedentType, "incedent Type ");

	}

	@Test
	public static void All_Departments__159() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonincedentsubType, "incedent SubType ");

	}

	@Test
	public static void All_Departments__160() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.addonincedentsubType();
		methods.addonincedentsubType();
	}

	@Test
	public static void All_Departments__161() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonPriority, " Priority dropdown");

	}

	@Test
	public static void All_Departments__162() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonAttachmentButton, "Attachment");

	}

	@Test
	public static void All_Departments__163() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addoncreateTemplateButton, "Create as template");
		//

	}

	@Test
	public static void All_Departments__164() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.addoncreateTemplateButton();
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.view.ViewGroup[2]/android.widget.TextView"))
				.click();

	}

	@Test
	public static void All_Departments__165() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		methods.elementCheck(methods.addonSubmit, "Submit Button ");
	}

	@Test
	public static void All_Departments__166() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.iconbtn_addon();
		methods.scrollDown();
		driver.findElement(methods.addonSubmit).click();
	}

	@Test
	public static void All_Departments__167() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		methods.elementCheck(methods.AssosiateaddonIcon, "Assosiate addon Icon ");
		methods.iconbtn();
	}

	@Test
	public static void All_Departments__168() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		driver.findElement(methods.AssosiateaddonIcon).click();
		methods.AssosiateaddonIcon_close();

	}

	@Test
	public static void All_Departments__169() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		methods.FristRequseterTicket();
		methods.iconbtn();
		driver.findElement(methods.AssosiateaddonIcon).click();
		methods.elementCheck(methods.AssosiateaddonRadios1, "Within Account");
		methods.elementCheck(methods.AssosiateaddonRadios2, "Within Hirechery");
		methods.elementCheck(methods.AssosiateaddonRadios3, "Across Account");
	}

	@Test
	public static void All_Departments__171() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		driver.findElement(methods.searchFilter).sendKeys("ak");

	}

	@Test
	public static void All_Departments__172() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		driver.findElement(methods.ticketFilter).click();
		methods.elementCheck(methods.filterpopup, "Filter Popup");
		driver.findElement(methods.ticketFilter).click();

	}

	@Test
	public static void All_Departments__173() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentpopup, "Department Popup");
		driver.findElement(methods.departmentDropdown).click();

	}

	@Test
	public static void All_Departments__174() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		driver.findElement(methods.departmentDropdown).click();
		methods.elementCheck(methods.departmentDropdownCheckboxes, "Checkboxes");

	}

	@Test
	public static void All_Departments__175() throws Throwable {
		methodsstore methods = new methodsstore(driver, dc, url);
		methods.username_password(username, password);
		methods.ticketsbtn();
		methods.requesterdropdown();
		methods.requesterdropdown_alldepartments();
		driver.findElement(methods.departmentDropdown).click();
		driver.findElement(methods.departmentDropdownCheckboxes).click();
		driver.findElement(methods.departmentDropdown).click();

	}

}
