package ass3ApplyingChildaxesmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWebDriverChildMethod {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 */

	@BeforeTest
	public void setUp() {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a WebSite
		driver.navigate().to("https://itmeo.com/");

		// Maximize current window
		driver.manage().window().maximize();

	}

	/**
	 * Test using 'Child' axes method, Type of XPath
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// ex1 ------- 'Child' axes method
		WebElement textMethod1 = driver.findElement(By.xpath("//div[@class='logo']//child::a"));
		textMethod1.getLocation();
		System.out.println("ex1 DONE Successfully the location of WebElement is =" + textMethod1.getLocation());

		// ex2 ------- 'Child' axes method with Contain() method
		// "input"
		WebElement textMethod2 = driver.findElement(By.xpath(
				"//ul[@class='features-checklist main-screen__features']//li[@class='features-checklist__item']//child::span[contains(text(),'Ready-to-use products')]"));
		textMethod2.getLocation();
		System.out.println("ex2 DONE Successfully the location of WebElement is =" + textMethod2.getLocation());

		// ex3 ------- 'Child' axes method with AND operation
		WebElement textMethod3 = driver
				.findElement(By.xpath("//li//child::a[contains(text(),'Log In') and @href='/login']"));
		System.out.println("ex3 DONE Successfully the location of WebElement is =" + textMethod3.getLocation());

		// ex4 ------- 'Child' axes method with OR operation
		WebElement textMethod4 = driver.findElement(By.xpath(
				"//form//child::input[contains(@placeholder,'Your email address') or @class='footer-subscribe-form__input']"));
		textMethod4.getLocation();
		System.out.println("ex4 DONE Successfully the location of WebElement is =" + textMethod4.getLocation());
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.quit();
	}
}
