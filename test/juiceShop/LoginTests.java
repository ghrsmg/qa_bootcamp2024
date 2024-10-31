package juiceShop;

import frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {

    static final String baseUrl = Utils.getConfigProperty("properties");

    WebDriver driver;

    @BeforeMethod
    public void initDriver() {
        // OLD version !! Do not use unless the server you are testing does not have internet
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\myuser\\Downloads\\chromedirver.exe");

        driver = Utils.getDriver();
    }

    @Test
    public void mainPage() {
        driver.get(baseUrl + "/#/");
    }

    @Test
    public void login01(){

        driver.get(baseUrl + "/#/login");

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement dismissModalElement = driver.findElement(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted > span.mat-button-wrapper > mat-icon"));
       // WebElement dismissModalElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted > span.mat-button-wrapper > mat-icon")));
        WebElement dismissModalElement = Utils.waitForElement(driver,5,By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted > span.mat-button-wrapper > mat-icon"));
        dismissModalElement.click();
//        FluentWait wait = new FluentWait<>(driver);
//        try {
//            wait.wait(5000);
//            wait.pollingEvery(Duration.ofSeconds(1));
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("")));

        WebElement loginElement = driver.findElement(By.id("email"));
        loginElement.sendKeys("alex@alex.com");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Abc123$");

        WebElement submitButton = driver.findElement(By.id("loginButton"));
        submitButton.click();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

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