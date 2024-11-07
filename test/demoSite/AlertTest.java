package demoSite;

import juiceShop.frameworkUtils.Utils;
import juiceShop.tests.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    @Test
    public void alertTest(){
        driver.get(baseUrl);
        driver.findElement(By.cssSelector("#svelte > div.container-fluid > div.main.row > div.content > h1")).click();
        WebElement el =  Utils.waitForElement(driver,5,By.id("alert-trigger"));

        driver.findElement(By.id("alert-trigger")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.id("confirm-trigger")).click();
        Alert confirm = driver.switchTo().alert();
        confirm.accept();
        driver.findElement(By.id("prompt-trigger")).click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("ana are mere");
        prompt.accept();
    }
}
