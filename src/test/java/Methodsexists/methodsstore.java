package Methodsexists;

import java.awt.List;
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

@SuppressWarnings("deprecation")
public class methodsstore {
	DesiredCapabilities dc;
	URL url;

	static AndroidDriver driver;

	@SuppressWarnings("static-access")
	public methodsstore(AndroidDriver driver, DesiredCapabilities dc, URL url) {

		this.driver = driver;
		this.dc = dc;
		this.url = url;
	}

	public By username1 = By.xpath("//android.widget.EditText[@text='Username']");
	public By password1 = By.xpath("//android.widget.EditText[@text='Password']");
	public By Signin = By.xpath("//android.widget.TextView[@text='Sign In']");

	public By ticketsbtn = By.xpath(

			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");

	public By requesterdropdown = By.xpath("//android.view.ViewGroup[@content-desc=\"Requester Tickets, \"]");

	public By requesterdropdown_alldepartments = By.xpath("//android.widget.TextView[@text='All Departments']");

	// public By Mytickets = By.xpath("//android.widget.TextView[@text='My
	// Tickets']");

	public By requestertickets = By.xpath("//android.widget.TextView[@text='Requester tickets']");

	public By firsttkt = By.xpath("(//android.widget.TextView[@index='5'])[1]");

	public By EditIcon = By.xpath("//android.view.ViewGroup[@content-desc=\"\"]");

	public By ticketstatus = By.xpath(
			"(//android.view.ViewGroup[@content-desc='Open'])[2]/android.view.ViewGroup[2]/android.widget.TextView");

	public By ticketId = By.xpath("(//android.view.ViewGroup[@content-desc='Open'])[1]");

	public By ticketDescription = By.xpath(
			"//android.view.ViewGroup[@content-desc='TestYantra_Subscriber ServiceDesk, #TARSR13507 Oct test data automation , Oct test data automation , 6 hours ago']/android.widget.TextView[3]");

	public By CreationDate = By.xpath("(//android.view.ViewGroup[@index='0'])[47]");

	public By InternalExternalIcon = By.xpath("(//android.view.ViewGroup[@index='0'])[47]");

	public By AttachmentIcon = By.xpath("(//android.view.ViewGroup[@index='0'])[47]");

	public By TimelogIcon = By.xpath("(//android.view.ViewGroup[@index='0'])[47]");

	public By EditTicketdetailsIcon = By.xpath(
			"(//android.view.ViewGroup[@content-desc=\"\"])[1]/android.view.ViewGroup[2]/android.widget.TextView");

	public By EditTicketdetailsPage = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView");

	public By DepartmentnameDropown = By.xpath("");

	public By IncedentTypeDropown = By.xpath("");

	public By IncedentSubTypeDropown = By.xpath("");

	public By EditDetailsPopup_CancelButton = By.xpath("");

	public By EditDetailsPopup_SubmitButton = By.xpath("");

	public By Edit_PriorityDropown = By.xpath("");

	public By Ticket_commentField = By.xpath("//android.widget.EditText[@text='Enter your comments...']");

	public By FristRequseterTicket = By.xpath("(//android.view.ViewGroup[@index='0'])[48]");

	public By firsttktdata = By.xpath("(//android.widget.TextView[@index=3])[1]");

	public By createticketbtn = By.xpath("//android.widget.TextView[@text='New Ticket']");

	public By editbtn_ontkt = By.xpath("//android.view.ViewGroup[@content-desc=\"Edit Ticket\"]");

	public By editbtn = By.xpath("//android.view.ViewGroup[@content-desc=\"Edit Ticket\"]/android.view.ViewGroup[2]");

	public By editbtn_tickettype = By.xpath("(//android.widget.TextView[@text=''])[1]");

	public By editbtn_subject = By.xpath("(//android.widget.EditText[@index='1'])[1]");

	public By editbtn_description = By.xpath("(//android.widget.EditText[@index='1'])[2]");

	public By editbtn_subscriber = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Subscriber, \"]/android.widget.TextView[2]");

	public By editbtn_incidenttype = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Edit Ticket, Customer Name, , 5201 Great America Parkway , Suite 320, SANTA CLARA,UNITED STATES,95054, Attachments\"]/android.view.ViewGroup[3]/android.widget.EditText");

	public By editbtn_subincidenttype = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Edit Ticket, Customer Name, , 5201 Great America Parkway , Suite 320, SANTA CLARA,UNITED STATES,95054, Attachments\"]/android.view.ViewGroup[4]/android.widget.EditText");

	public By editbtn_subscriberdropdown = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Subscriber, \"]/android.widget.TextView[1]");

	public By editbtn_subscribername = By.xpath("(//android.widget.EditText[@index='1'])[3]");

	public By editbtn_subscribersubname = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");

	public By editbtn_attachment = By.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.widget.TextView");

	public By editbtn_cancel = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By editbtn_backbtn = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By editbtn_edit = By.xpath("//android.widget.TextView[@text='Edit']");

	public By editpage_Backbutton = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Close\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By editicon_department = By.xpath("(//android.view.ViewGroup[@index='0'])[10]");

	public By editicon_incidenttype = By.xpath("(//android.view.ViewGroup[@index='0'])[13]");

	public By editicon_subincidenttype = By.xpath("(//android.view.ViewGroup[@index='0'])[17]");

	public By editicon_assigne = By.xpath("(//android.view.ViewGroup[@index='0'])[21]");

	public By editicon_priority = By.xpath("(//android.view.ViewGroup[@index='0'])[25]");

	public By editicon_cancelbtn = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By editicon_submitbtn = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By updatebtn = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Update Ticket\"]/android.view.ViewGroup[2]");

	public By updateAction_Dropdown = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Action Type, \"]/android.widget.TextView[1]");

	public By updateActionType_Dropdown = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Action, \"]/android.widget.TextView[1]");

	public By updateDescription_Field = By.xpath("//android.widget.EditText[@text='Description']");

	public By updateCloseButton = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Close\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By updateSubmitButton = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By selecttemplatesdrpdown = By.xpath("//android.widget.TextView[@text='Select Templates']");

	public By createtktbackbtn = By.xpath("(//android.view.ViewGroup[@index='0'])[25]");

	public By tickettype = By.xpath("(//android.widget.TextView[@index='0'])[3]");

	public By tickettype_Internal = By
			.xpath("//android.view.ViewGroup[@content-desc='Internal Ticket']/android.widget.TextView");

	public By tickettype_External = By
			.xpath("//android.view.ViewGroup[@content-desc='External Ticket']/android.widget.TextView");

	public By tickettype_System = By
			.xpath("//android.view.ViewGroup[@content-desc='System Ticket']/android.widget.TextView");

	// List
	// TicketTypeOptions=List.of(tickettype_Internal,tickettype_External,tickettype_System);
	public By AccountTypeDropdown = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Subscriber, \"]/android.widget.TextView[1]");

	public By subject = By.xpath("//android.widget.EditText[@text='Subject']");

	public By description = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText");

	public By subscribertextfield = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText");

	public By department_Dropdown = By.xpath("//android.view.ViewGroup[@content-desc=\"Engineering, \"]");

	public By incidenttype = By.xpath("//android.view.ViewGroup[@content-desc=\"Product Defect, \"]");

	public By incidentsubtype = By.xpath("//android.view.ViewGroup[@content-desc=\"Application Issue, \"]");

	public By prioritydropdown = By.xpath("//android.view.ViewGroup[@content-desc=\"Low, \"]");

	public By AccountnameField = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup[2]");

	public By CustomerContactnameField = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Customer Contact Name, \"]/android.widget.TextView[1]");

	public By attachment = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");

	public By create_as_template = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Create As Template\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.View");

	public By newtemplatename = By.xpath("//android.widget.EditText[@text='Template Name']");

	public By createtemplatebutton = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Create\"]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");

	public By create_button_in_createnewtkt = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Create\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By tagicon = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");

	public By dotsbutton_Insidetkt = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By watcherbutton = By.xpath("//android.view.ViewGroup[@content-desc=\"Watcher\"]/android.widget.TextView");

	public By watcherintertextfield = By.xpath("//android.widget.EditText[@text='New Watcher']");

	public By historyicon = By.xpath("//android.view.ViewGroup[@content-desc=\"History\"]/android.widget.TextView");

	public By historybackicon = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By filterbtn = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By taginsideticket = By.xpath("//android.view.ViewGroup[@content-desc=\"Tags\"]/android.widget.TextView");

	public By createtagtextfield = By.xpath("//android.widget.EditText[@text='New Tags']");

	public By update_backbtn = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	///
	///
	///// Icon path
	///
	///
	public By iconbtn = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By iconbtn_tags = By.xpath("//android.view.ViewGroup[@content-desc=\"Tags\"]");

	public By newtags = By.xpath("//android.widget.EditText[@text='New Tags']");

	public By newtags_cancel = By.xpath("//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.widget.TextView");

	public By newtags_submit = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By iconbtn_watcher = By.xpath("//android.view.ViewGroup[@content-desc=\"Watcher\"]/android.widget.TextView");

	public By iconbtn_clone = By.xpath("//android.view.ViewGroup[@content-desc=\"Clone\"]/android.widget.TextView");

	public By clone_customername = By.xpath("//android.widget.TextView[@text='']");

	public By clone_accountname = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText");

	public By clone_customercontact = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText");

	public By clone_department = By.xpath("(//android.widget.TextView[@index='0'])[4]");

	public By clone_incidenttype = By.xpath("(//android.widget.TextView[@index='0'])[5]");

	public By clone_incidentsubtype = By.xpath("(//android.widget.TextView[@index='0'])[6]");

	public By clone_priority = By.xpath("(//android.widget.TextView[@index='0'])[7]");

	public By clone_attachment = By.xpath("(//android.widget.TextView[@index='0'])[8]");

	public By clone_cancel = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Cancel\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By clone_submit = By.xpath("(//android.widget.TextView[@index='0'])[10]");

	public By iconbtn_history = By.xpath("//android.view.ViewGroup[@content-desc=\"History\"]/android.widget.TextView");

	public By history_back = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By history_data = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup");

	public By iconbtn_properties = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Properties\"]/android.widget.TextView");

	public By properties_data = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup");

	public By properties_backbtn = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By iconbtn_timelog = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Time Log\"]/android.widget.TextView");

	public By timelog_backbtn = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By timelog_timehistory = By.xpath(
			"//android.view.ViewGroup[@content-desc=\", Time Entry\"]/android.view.ViewGroup[2]/android.widget.TextView[2]");

	public By timelog_timeentry = By.xpath(
			"//android.view.ViewGroup[@content-desc=\", Time Entry\"]/android.view.ViewGroup[2]/android.widget.TextView[2]");

	public By timeentry_taskowner = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"New Time Entry, Billable Duration, Non-Billable Duration\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.View");

	public By timeentry_timecompletion = By.xpath("(//android.view.View[@index='0'])[3]");

	public By timeentry_calender = By.xpath("(//android.view.View[@index='0'])[4]");

	public By timeentry_Billable = By.xpath("(//android.view.View[@index='0'])[5]");

	public By timeentry_Nonbillable = By.xpath("(//android.view.View[@index='0'])[6]");

	public By timeentry_Hours = By.xpath("//android.widget.EditText[@text='Hour(s)']");

	public By timeentry_minutes = By.xpath("//android.widget.EditText[@text='Minute(s)']");

	public By timeentry_timelogactiontype = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Time-log Action Type, \"]/android.widget.TextView[1]");

	public By timeentry_description = By.xpath("//android.widget.EditText[@text='Description']");

	public By timeentry_close = By.xpath("(//android.view.View[@index='0'])[10]");

	public By timeentry_submit = By.xpath("(//android.view.View[@index='0'])[10]");

	public By timeentry_backbtn = By
			.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[2]/android.widget.TextView");

	public By iconbtn_addon = By.xpath("//android.view.ViewGroup[@content-desc=\"Add-On\"]/android.widget.TextView");

	public By AssosiateaddonIcon = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Associate Add-On\"]/android.widget.TextView");

	public By iconbtn_viewtask = By
			.xpath("//android.view.ViewGroup[@content-desc=\"View Tasks\"]/android.widget.TextView");

	public By watcher_internal = By.xpath("(//android.view.ViewGroup[@index='0'])[7]");

	public By watcher_external = By.xpath("(//android.view.ViewGroup[@index='0'])[11]");

	public By watcher_textfield = By.xpath("//android.widget.EditText[@text='New Watcher']");

	public By clone_subject = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText");

	public By clone_describtion = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
	public By addontemplatedropdown = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Select Templates, \"]/android.widget.TextView[1]");
	public By addontickettypedropdown = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");
	public By SubjectField = By.xpath("//android.widget.EditText[@text='Subject']");
	public By addonDescriptionField = By.xpath("//android.widget.EditText[@text='Description']");
	public By addonCustomerContact = By.xpath("(//android.widget.EditText[@index='1'])[3]");
	public By addonCustomername = By.xpath("(//android.widget.TextView[@text=''])[3]");
	public By addonCustomeraccount = By.xpath("(//android.widget.TextView[@index='0'])[5]");
	public By addonDepartment = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.view.ViewGroup[2]");
	public By addonincedentType = By.xpath("(//android.widget.TextView[@index='0'])[5]");
	public By addonincedentsubType = By.xpath("(//android.widget.TextView[@index='0'])[6]");
	public By addonPriority = By.xpath("(//android.widget.TextView[@index='0'])[7]");
	public By addonAttachmentButton = By.xpath("//android.view.ViewGroup[@content-desc=\"\"]/android.widget.TextView");
	public By addoncreateTemplateButton = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Create As Template\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.View");
	public By addonSubmit = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Create\"]/android.view.ViewGroup[2]/android.widget.TextView");
	public By AssosiateaddonRadios1 = By.xpath("(//android.view.ViewGroup[@index='0'])[8]");
	public By AssosiateaddonRadios2 = By.xpath("(//android.view.ViewGroup[@index='0'])[12]");
	public By AssosiateaddonRadios3 = By.xpath("(//android.view.ViewGroup[@index='0'])[15]");
	public By AssosiateaddonselectField = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Associate AddOn, Within Account, Within Heirarchy, Across Account\"]/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.EditText");
	public By AssosiateaddonselectFieldsuggestions1 = By.xpath("(//android.view.ViewGroup[@index='0'])[29]");
	public By AssosiateaddonSubmit = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"Submit\"]/android.view.ViewGroup[2]/android.widget.TextView");
	public By searchFilter = By.xpath("//android.widget.EditText[@text='Search']");
	public By ticketFilter = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");
	public By filterpopup = By.xpath(
			"//android.view.ViewGroup[@content-desc=\"\"]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.View");
	public By departmentDropdown = By
			.xpath("//android.view.ViewGroup[@content-desc=\"Departments, \"]/android.view.ViewGroup[2]");
	public By departmentpopup = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup");
	public By departmentDropdownCheckboxes = By.xpath("(//android.view.ViewGroup[@index='1'])[31]");
	public By ticketbtn = By.xpath(

			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]");;

	public void username_password(String username, String password) throws InterruptedException {

		driver.findElement(username1).sendKeys(username);
		driver.findElement(password1).sendKeys(password);
		driver.findElement(Signin).click();

	}

	public void ticketsbtn() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ticketsbtn));
		driver.findElement(ticketsbtn).click();
	}

	public void requesterdropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(requesterdropdown));
		driver.findElement(requesterdropdown).click();
	}

	public void editicon_department() {
		driver.findElement(editicon_department).click();
	}

	public void editicon_incidenttype() {
		driver.findElement(editicon_incidenttype).click();
	}

	public void editicon_subincidenttype() {
		driver.findElement(editicon_subincidenttype).click();
	}

	public void editicon_assigne() {
		driver.findElement(editicon_assigne).click();
	}

	public void editicon_priority() {
		driver.findElement(editicon_priority).click();
	}

	public void editicon_cancelbtn() {
		driver.findElement(editicon_cancelbtn).click();
	}

	public void editicon_submitbtn() {
		driver.findElement(editicon_submitbtn).click();
	}

	public void requestertickets() {
		driver.findElement(requestertickets).click();
	}

	public void firsttkt() {
		driver.findElement(firsttkt).click();
	}

	public String firsttktdata() {
		return driver.findElement(firsttktdata).getText();
	}

	public void editbtn_ontkt() {
		driver.findElement(editbtn_ontkt).click();
	}

	public void editbtn() {
		driver.findElement(editbtn).click();
	}

	public void editbtn_tickettype() {
		driver.findElement(editbtn_tickettype).click();
	}

	public void editbtn_cancel() {
		driver.findElement(editbtn_cancel).click();
	}

	public void FristRequseterTicket() throws Throwable {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FristRequseterTicket));
		driver.findElement(FristRequseterTicket).click();
	}

	public void editbtn_backbtn() {
		driver.findElement(editbtn_backbtn).click();
	}

	public void editbtn_edit() {
		driver.findElement(editbtn_edit).click();
	}

	public void editbtn_subject(String value) {
		driver.findElement(editbtn_subject).sendKeys(value);
	}

	public void editbtn_description(String value) {
		driver.findElement(editbtn_description).sendKeys(value);
	}

	public void editpage_Backbutton() {
		driver.findElement(editpage_Backbutton).click();
	}

	public void updatebtn() {
		driver.findElement(updatebtn).click();
	}

	public void update_backbtn() {
		driver.findElement(update_backbtn).click();
	}

	public void createtktbackbtn() {
		driver.findElement(createtktbackbtn).click();
	}

	public void createticketbtn() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(createticketbtn));
		driver.findElement(createticketbtn).click();
	}

	public void updateAction_Dropdown() {
		driver.findElement(updateAction_Dropdown).click();
	}

	public void updateActionType_Dropdown() {
		driver.findElement(updateActionType_Dropdown).click();
	}

	public void updateDescription_Field(String value) {
		driver.findElement(updateDescription_Field).sendKeys(value);
	}

	public void updateCloseButton() {
		driver.findElement(updateCloseButton).click();
	}

	public void updateSubmitButton() {
		driver.findElement(updateSubmitButton).click();
	}

	public void selecttemplatesdrpdown() {
		driver.findElement(selecttemplatesdrpdown).click();
	}

	public void tickettype() {
		driver.findElement(tickettype).click();
	}

	public void subject(String subtext) {
		driver.findElement(subject).sendKeys(subtext);

	}

	public void description(String description1) {
		driver.findElement(description).sendKeys(description1);

	}

	public void tagicon() {
		driver.findElement(tagicon).click();
		;

	}

	public void subscribertextfield(String subscribertextfield1) throws Throwable {
		driver.findElement(subscribertextfield).sendKeys(subscribertextfield1);
		driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"TestYantra_Subscriber ServiceDesk, TARSR41302, bhavani.gowda@onebillsoftware.com\"]/android.view.ViewGroup/android.widget.TextView[2]"))
				.click();

	}

	public void department_Dropdown() {
		driver.findElement(department_Dropdown).click();
	}

	public void incidenttype() {
		driver.findElement(incidenttype).click();
	}

	public void incidentsubtype() {
		driver.findElement(incidentsubtype).click();
	}

	public void prioritydropdown() {
		driver.findElement(prioritydropdown).click();
	}

	public void attachment() {
		driver.findElement(attachment).click();
	}

	public void create_as_template() {
		driver.findElement(create_as_template).click();
	}

	public void newtemplatename(String templatename) {
		driver.findElement(newtemplatename).sendKeys(templatename);
	}

	public void createtemplatebutton() {
		driver.findElement(createtemplatebutton).click();
	}

	public void create_button_in_createnewtkt() {
		driver.findElement(create_button_in_createnewtkt).click();
	}

	public void dotsbutton_Insidetkt() {
		driver.findElement(dotsbutton_Insidetkt).click();
	}

	public void watcherbutton() {
		driver.findElement(watcherbutton).click();
	}

	public void watcherintertextfield(String value) {
		driver.findElement(watcherintertextfield).sendKeys(value);
	}

	public void historyicon() {
		driver.findElement(historyicon).click();
	}

	public void historybackicon() {
		driver.findElement(historybackicon).click();
	}

	public void filterbtn() {
		driver.findElement(filterbtn).click();
	}

	public void taginsideticket() {
		driver.findElement(taginsideticket).click();
	}

	public void createtagtextfield(String value) throws Throwable {
		driver.findElement(createtagtextfield).sendKeys(value);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"))
				.click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();

	}

	public static void verifyDropdownOptions(RemoteWebDriver driver, String dropdownId, List optionIds,
			int Option_Count) {
		RemoteWebElement dropdown = (RemoteWebElement) driver.findElement(By.id(dropdownId));

		dropdown.click();

		int j = Option_Count;
		for (int i = 0; i < j; i++) {
			String optionId = optionIds.getItem(i);
			WebElement option = driver.findElement(By.id(optionId));

			// Check if the option is displayed
			if (option.isDisplayed()) {
				System.out.println("Option '" + optionId + "' is visible and verified.");
			} else {
				System.out.println("Option '" + optionId + "' verification failed.");
			}
		}
	}

	public void elementCheck(By ele, String name) {
		try {

			driver.findElements(ele);

			System.out.println(name + " Element is present on the page.");
		} catch (NoSuchElementException e) {
			// If the element is not found, NoSuchElementException is thrown
			System.out.println(name + " Element is not present on the page.");
		}

	}

	public static void xycordinates(int x, int y) {

		// Create a TouchAction to press and release at the specified coordinates
		@SuppressWarnings("rawtypes")
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(x, y)).release().perform();
	}

	@SuppressWarnings({ "rawtypes" })
	public void scrollDown() throws Throwable {
		Thread.sleep(7000);
		@SuppressWarnings("unused")
		int scrollDistance = 2; // Adjust this value to control the scroll distance

		// Get the dimensions of the screen
		int screenHeight = driver.manage().window().getSize().getHeight();

		// Calculate scroll start and end coordinates
		int startX = driver.manage().window().getSize().getWidth() / 2;
		int startY = (int) (screenHeight * 0.7); // Start scroll from 70% down the screen
		int endY = (int) (screenHeight * 0.2); // End scroll at 20% down the screen

		// Create a TouchAction instance and perform the scroll gesture
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(startX, startY)))
				.moveTo(PointOption.point(startX, endY)).release().perform();
	}

	@SuppressWarnings({ "rawtypes" })
	public void scrollDownengineerdropdown() {
		@SuppressWarnings("unused")
		int scrollDistance = 2; // Adjust this value to control the scroll distance

		// Get the dimensions of the screen
		int screenHeight = driver.manage().window().getSize().getHeight();

		// Calculate scroll start and end coordinates
		int startX = driver.manage().window().getSize().getWidth() / 2;
		int startY = (int) (screenHeight * 0.6); // Start scroll from 60% down the screen
		int endY = (int) (screenHeight * 0.2); // End scroll at 20% down the screen

		// Create a TouchAction instance and perform the scroll gesture
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(startX, startY)))
				.moveTo(PointOption.point(startX, endY)).release().perform();
	}

	@SuppressWarnings({ "rawtypes" })
	public void scrollforselecttemplate() {
		int scrollDistance = 2; // Adjust this value to control the scroll distance
		for (scrollDistance = 1; scrollDistance < 3; scrollDistance++) {
			// Get the dimensions of the screen
			int screenHeight = driver.manage().window().getSize().getHeight();

			// Calculate scroll start and end coordinates
			int startX = driver.manage().window().getSize().getWidth() / 2;
			int startY = (int) (screenHeight * 0.4); // Start scroll from 40% down the screen
			int endY = (int) (screenHeight * 0.2); // End scroll at 20% down the screen

			// Create a TouchAction instance and perform the scroll gesture
			TouchAction touchAction = new TouchAction(driver);
			touchAction.longPress(LongPressOptions.longPressOptions().withPosition(PointOption.point(startX, startY)))
					.moveTo(PointOption.point(startX, endY)).release().perform();
		}
	}

	public void iconbtn() {
		driver.findElement(iconbtn).click();
	}

	public void iconbtn_tags() {
		driver.findElement(iconbtn_tags).click();
	}

	public void newtags(String string) {
		driver.findElement(newtags).sendKeys(string);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView"))
				.click();

	}

	public void newtags_cancel() {
		driver.findElement(newtags_cancel).click();

	}

	public void newtags_submit() {
		driver.findElement(newtags_submit).click();

	}

	public void iconbtn_watcher() {
		driver.findElement(iconbtn_watcher).click();

	}

	public void iconbtn_clone() throws Throwable {
		driver.findElement(iconbtn_clone).click();

	}

	public void clone_describtion(String value) {
		driver.findElement(clone_describtion).sendKeys(value);
	}

	public void clone_cancel() {
		driver.findElement(clone_cancel).click();
	}

	public void clone_accountname(String string) {
		driver.findElement(clone_accountname).sendKeys(string);

	}

	public void clone_department() {
		driver.findElement(clone_department).click();

	}

	public void clone_incidenttype() {
		driver.findElement(clone_incidenttype).click();

	}

	public void clone_priority() {
		driver.findElement(clone_priority).click();

	}

	public void clone_submit() {
		driver.findElement(clone_submit).click();

	}

	public void iconbtn_history() {
		driver.findElement(iconbtn_history).click();

	}

	public void history_back() {
		driver.findElement(history_back).click();

	}

	public void iconbtn_properties() {
		driver.findElement(iconbtn_properties).click();

	}

	public void properties_backbtn() {
		driver.findElement(properties_backbtn).click();

	}

	public void iconbtn_timelog() {
		driver.findElement(iconbtn_timelog).click();

	}

	public void timelog_backbtn() throws Throwable {
		driver.findElement(timelog_backbtn).click();

	}

	public void timelog_timeentry() {
		driver.findElement(timelog_timeentry).click();

	}

	public void timeentry_backbtn() {
		driver.findElement(timeentry_backbtn).click();

	}

	public void timeentry_Hours(int hourvalue) throws Throwable {

		String j = Integer.toString(hourvalue);
		driver.findElement(timeentry_Hours).sendKeys(String.valueOf(j));

	}

	public void timeentry_minutes(int string) {
		driver.findElement(timeentry_minutes).sendKeys(String.valueOf(string));
	}

	public void timeentry_timelogactiontype() {
		driver.findElement(timeentry_timelogactiontype).click();

	}

	public void timeentry_description(String value12) {
		driver.findElement(timeentry_description).sendKeys(value12);

	}

	public void timeentry_taskowner() {
		driver.findElement(timeentry_taskowner).click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]"))
				.click();

	}

	public void timeentry_submit() {
		driver.findElement(timeentry_submit).click();

	}

	public void timeentry_close() {
		driver.findElement(timeentry_close).click();

	}

	public void iconbtn_addon() throws Throwable {
		driver.findElement(iconbtn_addon).click();
	}

	public void addonDepartment() {
		driver.findElement(addonDepartment).click();

	}

	public void addonincedentsubType() {
		driver.findElement(addonincedentsubType).click();
	}

	public void addoncreateTemplateButton() {
		driver.findElement(addoncreateTemplateButton).click();

	}

	public void addonIcon() {
		driver.findElement(AssosiateaddonIcon).click();

	}

	public void AssosiateaddonIcon_close() {

		By AssosiateaddonIcon_close = By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Close\"]/android.view.ViewGroup[2]/android.widget.TextView");
		driver.findElement(AssosiateaddonIcon_close).click();
	}

	public void requesterdropdown_alldepartments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(requesterdropdown_alldepartments));
		driver.findElement(requesterdropdown_alldepartments).click();
	}

	public void requesterdropdown_Mydepartment() throws InterruptedException {
		driver.findElement(requesterdropdown_Mydepartment).click();
		Thread.sleep(2000);
	}

	By requesterdropdown_Mydepartment = By.xpath("//android.widget.TextView[@text='My Departments']");

	public void requesterdropdown_mywatchlist() throws InterruptedException {
		driver.findElement(requesterdropdown_mywatchlist).click();
	}

	By requesterdropdown_mywatchlist = By.xpath("//android.widget.TextView[@text='My Watchlist']");

	public void requesterdropdown_mytickets() throws InterruptedException {
		driver.findElement(requesterdropdown_mytickets).click();
	}

	By requesterdropdown_mytickets = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");

	public void requesterdropdown_partnertickets() throws InterruptedException {
		driver.findElement(requesterdropdown_partnertickets).click();
	}

	By requesterdropdown_partnertickets = By.xpath("//android.widget.TextView[@text='Partner Tickets']");

	public void requesterdropdown_suspensetickets() throws InterruptedException {
		driver.findElement(requesterdropdown_suspensetickets).click();
		Thread.sleep(2000);
	}

	By requesterdropdown_suspensetickets = By.xpath("//android.widget.TextView[@text='Suspense Tickets']");

	public void requesterdropdown_systemticekts() throws InterruptedException {
		driver.findElement(requesterdropdown_systemticekts).click();
	}

	By requesterdropdown_systemticekts = By.xpath("//android.widget.TextView[@text='System Tickets']");

}
