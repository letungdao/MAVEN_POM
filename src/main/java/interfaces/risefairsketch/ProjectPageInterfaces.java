package interfaces.risefairsketch;

public class ProjectPageInterfaces {
	public static final String HDR_PROJECTNAME = "//h1[contains(.,'%s')]";
	public static final String HDR_PAGE = "//h1[text()='Projects']";
	public static final String BTN_ADD_PROJECT = "//a[@title='Add project']";
	public static final String BTN_ADD_FILES = "//a[@title='Add files']";
	public static final String BTN_ADD_CONTRACT = "//a[@title='Add contract']";
	public static final String BTN_ADDMULTIPLETASKLIST = "//div[@id='project-tasks_list-section']//a[@title='Add multiple tasks']";
	public static final String LNK_PROJECTNAME = "//table[@id='project-table']//tbody//tr[1]//td[2]//a";
	public static final String BTN_CLOSE = "//form//button[contains(.,'Close')]";
	public static final String TXB_SEARCH = "//div[@id='project-table_filter']//input";
	public static final String CBX_STATUS = "(//table[@id='task-table']//a[contains(@data-act,'status-checkbox')]/span)[1]";
	
	//Add project popup
	public static final String HDR_ADD_PROJECT_POPUP = "//h4[text()='Add project']";
	public static final String TXB_TITLE_ADD_RPOJECT_POPUP = "//input[@id='title']";
	public static final String BTN_SAVE_AND_CONTINUE_ADDPROJECT = "//button[@id='save-and-continue-button']";
	
	//Add contract popup
	public static final String HDR_ADD_CONTRACT_POPUP = "//h4[text()='Add contract']";
	public static final String TXB_TITLE_ADD_CONTRACT_POPUP = "//input[@id='title']";
	public static final String BTN_SAVE_ADDCONTRACT = "//button[contains(.,'Save')]";
	public static final String TXB_CONTRACTDATE = "//input[@id='contract_date']";
	public static final String TXB_VALIDUNTIL = "//input[@id='valid_until']";
	
	//Add files popup
	public static final String HDR_ADD_FILES_POPUP = "//h4[text()='Add files']";
	public static final String BTN_UPLOADFILE = "//div[@id='file-upload-dropzone']//button";
	public static final String BTN_SAVEFILE = "//button[@id='file-save-button']";
	public static final String BAR_PROGRESS = "//div[@id='uploaded-file-previews']//div[contains(@class,'complete')]//div[contains(@class,'progress-bar-success')]";
	public static final String BTN_CLOSE_ADDFILES = "//form//button[contains(.,'Close')]";
	
	//Comments section
	public static final String TXA_COMMENTS = "//textarea[@class='note-codable']";
	public static final String BTN_POSTCOMMENT = "//button[contains(.,'Post Comment')]";
	public static final String LNK_REPLY = "//a[contains(.,'Reply')]";
	public static final String TXA_REPLY = "//div[contains(@id,'reply-dropzone')]//textarea";
	public static final String BTN_POSTREPLY = "//button[contains(.,'Post Reply')]";
	
	//Add member popup
	public static final String HDR_ADDPROJECTMEMBER = "//h4[text()='Add new project member']";
	public static final String DDL_LASTMEMBER = "(//div[@id='s2id_user_id'])[last()]";
	public static final String DDL_FIRSTMEMBER = "(//div[@id='s2id_user_id'])[1]";
	public static final String DDL_SECONDMEMBER = "(//div[@id='s2id_user_id'])[2]";
	public static final String BTN_ADDMEMBER = "//a[@id='add-more-user']";
	public static final String OPT_MEMBER_THOMAS = "//div[@id='select2-drop']//li[contains(.,'Thomas')]";
	public static final String OPT_MEMBER_WOOD = "//div[@id='select2-drop']//li[contains(.,'Wood')]";
	public static final String BTN_SAVE_AND_CONTINUE_ADDMEMBER = "//button[@id='save-and-continue-button']";
	
	//Add multiple task popup
	public static final String HDR_ADDMULTIPLETASKS = "//h4[text()='Add multiple tasks']";
	public static final String HDR_ADDMULTIPLETASK = "//h4[text()='Add multiple tasks']";
	public static final String TXB_TITLE = "//input[@name='title']";
	public static final String BTN_SAVEANDADDMORE = "//button[@id='save-and-add-button']";
	public static final String BTN_CLOSE_ADDMULTIPLETASK = "//form[@id='task-form']//button[contains(.,'Close')]";
	
	//Tabs
	public static final String TAB_TASKLIST = "//a[text()='Tasks List']";
	public static final String TAB_FILES = "//ul[@id='project-tabs']//a[contains(.,'Files')]";
	public static final String TAB_COMMENTS = "//ul[@id='project-tabs']//a[contains(.,'Comments')]";
	public static final String TAB_CONTRACTS = "//ul[@id='project-tabs']//a[contains(.,'Contracts')]";
	public static final String TAB_OVERVIEW = "//ul[@id='project-tabs']//a[contains(.,'Overview')]";
}