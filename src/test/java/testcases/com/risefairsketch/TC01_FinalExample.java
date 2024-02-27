package testcases.com.risefairsketch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import actions.commons.AbstractTest;
import actions.risefairsketch.HomePage;
import actions.risefairsketch.LoginPage;
import actions.risefairsketch.ProjectPage;

public class TC01_FinalExample extends AbstractTest {
	WebDriver driver;
	String uniqueTitle;

	@Parameters({ "browser", "version" })
	@BeforeTest
	public void beforeTest(String browser, String version) {

		uniqueTitle = randomEmail();

		driver = openMultiBrowsers(browser, version);
		loginPage = new LoginPage(driver);

		log.info("Step 01 - Open rise fairsketch page");
		loginPage.openLoginPage("https://rise.fairsketch.com/");

		log.info("Step 02 - Login with username ");
		loginPage.loginWithEmailAndPassword("admin@demo.com", "riseDemo");
	}

	@Test
	public void TC01_CreateTask() {

		homePage = new HomePage(driver);
		log.info("VP - Verify Login successfully");
		homePage.verifyHomePageIsDisplayed();

		log.info("Step 1 - Tạo mới project");
		log.info("Step 1.1 - Open menu Project");
		homePage.selectMenuProject();
		
		projectPage = new ProjectPage(driver);
		log.info("Step 1.2 - Click Add Project button");
		projectPage.clickAddProject();
		
		log.info("VP - Verify Add project popup displays");
		projectPage.verifyAddProjectPopupIsDisplayed();
		
		log.info("Step 1.3 - Enter Project title");
		String titleProject = randomNumber();
		projectPage.enterTitleProject(titleProject);
		
		log.info("Step 1.4 - Click Save and Continue button");
		projectPage.clickSaveAndContinueInAddProjectPopup();
		
		log.info("VP - Verify Add member popup displays");
		projectPage.verifyAddMemberPopupIsDisplayed();
		
		log.info("Step 2 - Add member");
		log.info("Step 2.1 - Add member Thomas");
		projectPage.selectMemberThomas();
		
		log.info("Step 2.2 - Click Add more member");
		projectPage.clickAddMore();
		
		log.info("Step 2.3 - Add member Wood");
		projectPage.selectMemberWood();
		
		log.info("Step 2.4 - Click Save and continue");
		projectPage.clickSaveAndContinueAddMemberPopup();
		
		log.info("VP - Verify Add multiple task popup displays");
		projectPage.verifyAddMultipleTaskPopupDisplayed();
		
		log.info("Step 2.4 - Click Close button");
		projectPage.clickCloseMultipleTaskPopup();
		
		log.info("VP - Verify popup disappear");
		projectPage.verifyAddMultipleTaskPopupIsDisappeared();
		
		log.info("Step 3 - Open project detail page");
		log.info("Step 3.1 - Search project name");
		projectPage.searchProjectName(titleProject);
		
		log.info("Step 3.2 - Open Project");
		projectPage.openProject();
		
		log.info("VP - Verify Project detail page display");
		projectPage.verifyProjectDetailPageIsDisplayed(titleProject);
		
		log.info("Step 4 - Add 03 tasks");
		log.info("Step 4.1 - Open Task list tab");
		projectPage.openTaskListTab();
		
		log.info("Step 4.2 - Click Add multiple button");
		projectPage.clickAddMultipleTask();
		
		log.info("VP - Verify Add multiple task popup displays");
		projectPage.verifyAddMultipleTaskPopupDisplayed();
		
		log.info("Step 4.3 - Enter task title 01");
		projectPage.enterTaskTitle("Task 01");
		
		log.info("Step 4.4 - Click Save and Add more");
		projectPage.clickSaveAndAddMore();
		
		log.info("Step 4.5 - Click Close button");
		projectPage.clickCloseMultipleTaskPopup();
		
		log.info("Step 4.6 - Click Add multiple button");
		projectPage.clickAddMultipleTask();
		
		log.info("VP - Verify Add multiple task popup displays");
		projectPage.verifyAddMultipleTaskPopupDisplayed();
		
		log.info("Step 4.7 - Enter task title 02");
		projectPage.enterTaskTitle("Task 02");
		
		log.info("Step 4.8 - Click Save and Add more");
		projectPage.clickSaveAndAddMore();

		log.info("Step 4.9 - Click Close button");
		projectPage.clickCloseMultipleTaskPopup();
		
		log.info("Step 4.10 - Click Add multiple button");
		projectPage.clickAddMultipleTask();
		
		log.info("VP - Verify Add multiple task popup displays");
		projectPage.verifyAddMultipleTaskPopupDisplayed();
		
		log.info("Step 4.11 - Enter task title 03");
		projectPage.enterTaskTitle("Task 03");
		
		log.info("Step 4.12 - Click Save and Add more");
		projectPage.clickSaveAndAddMore();
		
		log.info("Step 4.13 - Click Close");
		projectPage.clickCloseMultipleTaskPopup();
		
		log.info("VP - Verify Add multiple task disappear");
		projectPage.verifyAddMultipleTaskPopupIsDisappeared();
		
		log.info("Step 5 - Mark done for 03 tasks");
		log.info("Step 5.1 - Mark done task");
		projectPage.markDoneTask();
		
		log.info("Step 6 - Upload 02 files");
		log.info("Step 6.1 - Open Upload file tab");
		projectPage.openFilesTab();
		
		log.info("Step 6.2 - Click Add file");
		projectPage.clickAddFiles();
		
		log.info("Step 6.3 - Click Upload file");
		projectPage.clickUploadFile();
		
		log.info("Step 6.4 - Upload file");
		projectPage.uploadFile();
		
		log.info("VP - Verify Upload file successful");
		projectPage.verifyFileIsUploadedSuccessfully();
		
		log.info("Step 7 - Comment and reply");
		
		log.info("Step 8 - Add 01 contract");
		
		log.info("Step 9 - Mark project as completed");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	private LoginPage loginPage;
	private HomePage homePage;
	private ProjectPage projectPage;
}
