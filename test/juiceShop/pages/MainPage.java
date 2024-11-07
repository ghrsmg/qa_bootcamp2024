package juiceShop.pages;

import juiceShop.frameworkUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    private static final String ALL_PRODUCTS_SELECTOR = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-search-result > div > div > div.heading.mat-elevation-z6 > div.ng-star-inserted";

    private static final String ALL_PRODUCTS_TEXT = "All Products";
    private static final String OPEN_SIDE_MENU = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-navbar > mat-toolbar > mat-toolbar-row > button:nth-child(1) > span.mat-button-wrapper > mat-icon";//css
    private static final String NAVBAR_LOGIN_BUTTON = "#navbarLoginButton";//css
    private static final String ACCOUNT_BUTTON = "#navbarAccount";
    private static final String DISMISS_MODAL = ".close-dialog";
    @FindBy(css = ALL_PRODUCTS_SELECTOR)
    WebElement products;

    public String getProductsText() {
        return products.getText();
    }

    public String getProductsStaticText() {
        return ALL_PRODUCTS_TEXT;
    }

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void openSideMenu(){
        WebElement openSideMenubutton = driver.findElement(By.cssSelector(OPEN_SIDE_MENU));
        openSideMenubutton.click();
    }
    public void clickAccountButton(){
        WebElement accountButton = driver.findElement(By.cssSelector(ACCOUNT_BUTTON));
        accountButton.click();

    }
    public void clickLoginFromMainPage(){

        WebElement loginButton = driver.findElement(By.cssSelector(NAVBAR_LOGIN_BUTTON));
        loginButton.click();
    }
    public void dismissModal() {
//        WebElement modalElement = driver.findElement(By.cssSelector(DISMISS_MODAL));
//        modalElement.click();
        Utils.waitForElement(driver,10,By.cssSelector(DISMISS_MODAL)).click();
    }




}