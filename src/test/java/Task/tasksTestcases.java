package Task;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class tasksTestcases extends baseCofiguration.Configaration {

	static String username = "Tyss";
	static String password = "Onebilltest1";

	@Test
	public static void tasks_001() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.elementCheck(methods.tasksTab, "Task tab ");
	}

	@Test
	public static void tasks_002() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.elementCheck(methods.createtask, "Task page ");
	}

	@Test
	public static void tasks_003() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.elementCheck(methods.createtask, "Task page with details ");
	}

	@Test
	public static void tasks_004() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.elementCheck(methods.createtask, "Createtaskbutton ");
	}

	@Test
	public static void tasks_005() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.tasknameField, "Createtask Page ");
	}

	@Test
	public static void tasks_006() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.tasknameField, "task name field ");
	}

	@Test
	public static void tasks_007() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.tasknameinput("Descriptionautomationsample1");
	}

	@Test
	public static void tasks_008() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.tasknameinput("");
	}

	@Test
	public static void tasks_009() throws MalformedURLException, InterruptedException {
		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.duedateCalender, "Duedate Calender ");
	}

	@Test
	public static void tasks_010() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.duedateIcon, "duedate Calender Icon");
		methods.elementCheck(methods.duedateCalender, "duedate Calender field");
	}

	@Test
	public static void tasks_011() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.duedateCalender, "due date Calender ");
		methods.duedateIconclick();
		methods.dateselectclick();
	}

	@Test
	public static void tasks_012() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.duedateIconclick();
		methods.elementCheck(methods.Calenderok, "Ok Button ");
		methods.calenderokclick();
		methods.duedateIconclick();
		methods.elementCheck(methods.CalenderCancel, "Cancel Button ");
		methods.calenderCancelclick();

	}

	@Test
	public static void tasks_013() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.timepicker, "time picker ");

	}

	@Test
	public static void tasks_014() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.timePickerIconClick();
		methods.elementCheck(methods.timepickerpopup, "time Picker popup ");
	}

	@Test
	public static void tasks_015() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.timePickerIconClick();
		methods.timepickertimeclick();
	}

	@Test
	public static void tasks_016() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.timePickerIconClick();
		methods.timepickertimeclick();
		methods.timePickerokclick();
		methods.timePickerIconClick();
		methods.timepickertimeclick();
		methods.timePickercancelclick();

	}

	@Test
	public static void tasks_017() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();

	}

	@Test
	public static void tasks_020() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.radioself, "self Radio Button");
		methods.radioselfclick();
	}

	@Test
	public static void tasks_021() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.radioOther, "Other Radio Button");
		methods.radioOtherclick();
	}

	@Test
	public static void tasks_022() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.radioOtherclick();
		methods.elementCheck(methods.userfield, "user Field");
	}

	@Test
	public static void tasks_023() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.radioOtherclick();
		methods.userfieldInput();
	}

	@Test
	public static void tasks_024() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.DescriptionField, "Description Field");
	}

	@Test
	public static void tasks_025() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.Descriptioninput("Description123 Test Description");

	}

	@Test
	public static void tasks_026() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.Descriptioninput("");

	}

	@Test
	public static void tasks_027() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.closebutton, "Close Button ");
		methods.closebuttonclick();
	}

	@Test
	public static void tasks_028() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.submitbutton, "Submit Button ");
		methods.submitbuttonclick();
	}

	@Test
	public static void tasks_029() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.createTaskclick();
		methods.elementCheck(methods.backIcon, "Back Icon ");
		methods.backIconclick();
	}

	@Test
	public static void tasks_030() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.elementCheck(methods.taskserachfield, "task search field");
		methods.taskserachfieldInput("Tsr");

	}

	@Test
	public static void tasks_031() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.elementCheck(methods.todaydropdown, "Period Dropdown ");
		methods.taskTodayclick();
		methods.elementCheck(methods.todaydropdownpopup, "Period Options ");
	}

	@Test
	public static void tasks_032() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.taskTodayclick();
		methods.periodoptionallclick();
		methods.elementCheck(methods.dotsIcon, "3 dots Icon ");
		methods.dotsIconclick();

	}

	@Test
	public static void tasks_033() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.taskTodayclick();
		methods.periodoptionallclick();
		methods.dotsIconclick();
		methods.elementCheck(methods.Edittaskoption, "Edit Option ");
		methods.elementCheck(methods.Deletetaskoption, "Delete Option ");
	}

	@Test
	public static void tasks_034() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.taskTodayclick();
		methods.periodoptionallclick();
		methods.dotsIconclick();
		methods.Editoptionclick();

	}

	@Test
	public static void tasks_035() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.taskTodayclick();
		methods.periodoptionallclick();
		methods.dotsIconclick();
		methods.Deleteoptionclick();

	}

	@Test
	public static void tasks_036() throws MalformedURLException, InterruptedException {

		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.taskfilterClick();
		methods.taskpriorityhighsliderclick();
		methods.taskpriorityhighsliderclick();
		methods.taskprioritymediumsliderclick();
		methods.taskprioritymediumsliderclick();
		methods.taskprioritynormalSliderclick();
		methods.taskprioritynormalSliderclick();

	}

	@Test
	public static void tasks_037() throws MalformedURLException, InterruptedException {
		tasksmethod methods = new tasksmethod(driver, dc, url);
		methods.username_password(username, password);
		methods.taskTabclick();
		methods.taskfilterClick();
		methods.taskStatusNotstartedclick();

	}

}
