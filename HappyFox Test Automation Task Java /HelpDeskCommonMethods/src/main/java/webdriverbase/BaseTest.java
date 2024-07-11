package webdriverbase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
    	// We can use webdriverManager to initialize the chromedriver.
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\D drive\\automation\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close(); // We dont need to use both close() and quit(). driver.quit() itself close all browser windows and safely end the session.
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}


