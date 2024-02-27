package actions.commons;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.jetty.log.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class AbstractTest {

	WebDriver driver;

	protected final Log log;

	protected AbstractTest() {
		log = LogFactory.getLog(getClass());
	}

	protected synchronized WebDriver openMultiBrowsers(String browser, String version) {
		if (browser.equalsIgnoreCase("chrome")) {
			// ChromeDriverManager.getInstance().version(version).setup();
			System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("start-maximized");
			chromeOptions.addArguments("disable-infobars");
			driver = new ChromeDriver(chromeOptions);
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxDriverManager.getInstance().version(version).setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chromeheadless")) {
			ChromeDriverManager.getInstance().version(version).setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1400,800");
			log.info("-----------Open chrome browser------------");
			driver = new ChromeDriver(options);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public boolean verifyPassed(boolean condition, String messagePass, String messageFail) {
		boolean result = true;
		try {
			if (condition == true) {
				log.info(messagePass);
			} else {
				log.info(messageFail);
			}
			Assert.assertTrue(condition);
		} catch (Throwable e) {
			result = false;
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return result;
	}

	public boolean verifyFailed(boolean condition, String messagePass, String messageFail) {
		boolean result = true;
		try {
			if (condition == false) {
				log.info(messagePass);
			} else {
				log.info(messageFail);
			}
			Assert.assertFalse(condition);
		} catch (Throwable e) {
			result = false;
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return result;
	}

	public boolean verifyEqual(Object actual, Object expected, String messagePass, String messageFail) {
		boolean result = true;
		try {
			if (actual.equals(expected)) {
				log.info(messagePass);
			} else {
				log.info(messageFail);
			}
			Assert.assertEquals(actual, expected);
		} catch (Throwable e) {
			result = false;
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return result;
	}

	public String randomEmail() {
		Random random = new Random();
		int number = random.nextInt(999999);
		String randomEmail = "automation" + number + "@gmail.com";
		return randomEmail;
	}
	
	public String randomString(){
	    byte[] array = new byte[7]; 
	    new Random().nextBytes(array);
	    String generatedString = new String(array, Charset.forName("UTF-8"));
		return generatedString;
	}
	
	public String randomNumber(){
		Random random = new Random();
		int number = random.nextInt(999999);
		String value = String.valueOf(number);
		return value;
	}

	public void uploadFile(String fileUpload) {
		// creating object of Robot class
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		// copying File path to Clipboard
		StringSelection str = new StringSelection(fileUpload);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		// for pressing and releasing Enter
		rb.delay(400);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(400);
		
		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(400);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(400);
	}

}
