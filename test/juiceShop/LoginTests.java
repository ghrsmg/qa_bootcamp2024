package juiceShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {
    WebDriver driver;
    static final String baseUrl = "http://57.151.123.81:3000/#/";
    @BeforeMethod
    public void initDriver(){
        driver = new ChromeDriver();
    }

    @Test
    public void mainPage(){
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.close();
    }
    @Test
    public void login01(){
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement dismisModalElement = driver.findElement(By.cssSelector("#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted"));
        dismisModalElement.click();
        WebElement loginElement = driver.findElement(By.id("email"));
        loginElement.sendKeys("alex@alex.com");
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Abc123$");
        WebElement submitElement = driver.findElement(By.id("loginButton"));
       // driver.close();

    }
    @AfterMethod
    public void closeBrowser(){
        try {
            driver.close();
        }
        catch (Exception e){
            driver.quit();
        };

    }
}
