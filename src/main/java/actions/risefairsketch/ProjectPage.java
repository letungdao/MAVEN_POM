package actions.risefairsketch;

import org.openqa.selenium.WebDriver;

import actions.commons.AbstractPage;
import interfaces.risefairsketch.ProjectPageInterfaces;

public class ProjectPage extends AbstractPage {

	WebDriver driver;

	public ProjectPage(WebDriver driver_) {
		driver = driver_;
	}

	public void verifyProjectPageIsDisplayed() {
		verifyPassed(isElementDisplayed(driver, ProjectPageInterfaces.HDR_PAGE), "Project page is displayed",
				"Project page is NOT displayed");
	}

	public void clickAddProject() {
		clickToElement(driver, ProjectPageInterfaces.BTN_ADD_PROJECT);
	}

	public void clickClosePopup() {
		clickToElement(driver, ProjectPageInterfaces.BTN_CLOSE);
	}

	public void openTaskListTab() {
		clickToElement(driver, ProjectPageInterfaces.TAB_TASKLIST);
	}

	public void openFilesTab() {
		clickToElement(driver, ProjectPageInterfaces.TAB_FILES);
	}

	public void openCommentTab() {
		clickToElement(driver, ProjectPageInterfaces.TAB_COMMENTS);
	}

	public void openContractTab() {
		clickToElement(driver, ProjectPageInterfaces.TAB_CONTRACTS);
	}

	public void searchProjectName(String prjName) {
		sendkeyToElement(driver, ProjectPageInterfaces.TXB_SEARCH, prjName);
	}

	public void openProject() {
		clickToElement(driver, ProjectPageInterfaces.LNK_PROJECTNAME);
	}

	public void verifyProjectDetailPageIsDisplayed(String prjName) {
		verifyPassed(isElementDisplayed(driver, String.format(ProjectPageInterfaces.HDR_PROJECTNAME, prjName)),
				"Project detail page is displayed", "Project detail page is NOT displayed");
	}

	public void markDoneTask() {
		for (int i = 0; i < 3; i++) {
			clickToElement(driver, ProjectPageInterfaces.CBX_STATUS);
			refresh(driver);
		}
	}

	public void verifyAllTasksMarkDone() {
		verifyFailed(isElementDisplayed(driver, ProjectPageInterfaces.CBX_STATUS), "All tasks mark DONE",
				"All tasks DO NOT mark DONE");
	}

	// Add multiple task
	public void clickAddMultipleTask() {
		clickToElement(driver, ProjectPageInterfaces.BTN_ADDMULTIPLETASKLIST);
	}

	public void verifyAddMultipleTaskPopupDisplayed() {
		verifyPassed(isElementDisplayed(driver, ProjectPageInterfaces.HDR_ADDMULTIPLETASK),
				"Add multiple task popup is displayed", "Add multiple task popup is NOT displayed");
	}

	public void enterTaskTitle(String title) {
		sendkeyToElement(driver, ProjectPageInterfaces.TXB_TITLE, title);
	}

	public void clickSaveAndAddMore() {
		clickToElement(driver, ProjectPageInterfaces.BTN_SAVEANDADDMORE);
	}

	public void clickCloseMultipleTaskPopup() {
		clickToElement(driver, ProjectPageInterfaces.BTN_CLOSE_ADDMULTIPLETASK);
	}

	// Add project popup
	public void verifyAddProjectPopupIsDisplayed() {
		verifyPassed(isElementDisplayed(driver, ProjectPageInterfaces.HDR_ADD_PROJECT_POPUP),
				"Add project popup is displayed", "Add project popup is NOT displayed");
	}

	public void enterTitleProject(String title) {
		sendkeyToElement(driver, ProjectPageInterfaces.TXB_TITLE_ADD_RPOJECT_POPUP, title);
	}

	public void clickSaveAndContinueInAddProjectPopup() {
		clickToElement(driver, ProjectPageInterfaces.BTN_SAVE_AND_CONTINUE_ADDPROJECT);
	}

	// Add member popup
	public void verifyAddMemberPopupIsDisplayed() {
		verifyPassed(isElementDisplayed(driver, ProjectPageInterfaces.HDR_ADDPROJECTMEMBER),
				"Add project member popup is displayed", "Add project member popup is NOT displayed");
	}

	public void clickAddMore() {
		clickToElement(driver, ProjectPageInterfaces.BTN_ADDMEMBER);
	}

	public void clickSaveAndContinueAddMemberPopup() {
		clickToElement(driver, ProjectPageInterfaces.BTN_SAVE_AND_CONTINUE_ADDMEMBER);
	}

	public void selectMemberThomas() {
		clickToElement(driver, ProjectPageInterfaces.DDL_FIRSTMEMBER);
		clickToElement(driver, ProjectPageInterfaces.OPT_MEMBER_THOMAS);
	}

	public void selectMemberWood() {
		clickToElement(driver, ProjectPageInterfaces.DDL_LASTMEMBER);
		clickToElement(driver, ProjectPageInterfaces.OPT_MEMBER_WOOD);
	}

	public void verifyAddMultipleTaskPopupIsDisappeared() {
		verifyPassed(isElementNOTDisplay(driver, ProjectPageInterfaces.HDR_ADDMULTIPLETASK),
				"Add multiple task popup is disappeared", "Add multiple task popup is NOT disappeared");
	}

	// File tab
	public void clickAddFiles() {
		clickToElement(driver, ProjectPageInterfaces.BTN_ADD_FILES);
	}

	public void verifyAddFilesPopupIsDisappeared() {
		verifyPassed(isElementNOTDisplay(driver, ProjectPageInterfaces.HDR_ADD_FILES_POPUP),
				"Add files popup is disappeared", "Add files popup is NOT disappeared");
	}

	public void clickUploadFile() {
		clickToElement(driver, ProjectPageInterfaces.BTN_UPLOADFILE);
	}

	public void clickSaveFile() {
		clickToElement(driver, ProjectPageInterfaces.BTN_SAVEFILE);
	}

	public void clickCloseAddFilePopup() {
		clickToElement(driver, ProjectPageInterfaces.BTN_CLOSE_ADDFILES);
	}

	public void uploadFile() {
		String fileName = "G:\\workspace\\MAVEN_C1023L1_POM\\MAVEN_C1023L1_POM\\resources\\dataTest\\dragon.png";
		uploadFile(fileName);
	}
}
