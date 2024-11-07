package demoSite;

import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static final String baseUrl = "http://57.151.123.81:4999/alerts";
    protected WebDriver driver;

    @BeforeMethod
    public void initDriver() {
        // OLD version !! Do not use unless the server you are testing does not have internet
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\myuser\\Downloads\\chromedirver.exe");

        driver = Utils.getDriver();
    }
    @AfterMethod
    public void closeBrowser() {
        try {
            driver.close();
        }
        catch (Exception ex) {
            driver.quit();
        }
    }
}
