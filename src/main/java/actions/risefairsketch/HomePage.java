package actions.risefairsketch;

import org.openqa.selenium.WebDriver;

import actions.commons.AbstractPage;
import interfaces.risefairsketch.HomePageInterfaces;

public class HomePage extends AbstractPage {

	WebDriver driver;

	public HomePage(WebDriver driver_) {
		driver = driver_;
	}

	public void verifyHomePageIsDisplayed() {
		verifyPassed(isElementDisplayed(driver, HomePageInterfaces.TXT_USERNAME), "Home page is displayed",
				"HomePage is NOT displayed");
		// String actualTitle = getTitle(driver);
		// String expectedTitle = "Dashboard | RISE - Ultimate Project Manager
		// and CRM";
		// verifyEqual(actualTitle, expectedTitle, "Home Page is displayed",
		// "Title display " + actualTitle);
	}

	public void selectMenu(String menu) {
		clickToElement(driver, String.format(HomePageInterfaces.TXT_MENU, menu));
	}
	
	public void selectMenuProject(){
		clickToElement(driver, HomePageInterfaces.MENU_PROJECTS);
	}

}
