package juiceShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    private static final String ALL_PRODUCTS_SELECTOR = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-search-result > div > div > div.heading.mat-elevation-z6 > div.ng-star-inserted";

    private static final String ALL_PRODUCTS_TEXT = "All Products";
    private static final String OPEN_SIDE_MENU = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-navbar > mat-toolbar > mat-toolbar-row > button:nth-child(1) > span.mat-button-wrapper > mat-icon";//css
    private static final String LOGIN_SIDE_MENU_BUTTON = "<span class=\"mat-list-item-content\"><span mat-ripple=\"\" class=\"mat-ripple mat-list-item-ripple\"></span><span class=\"mat-list-text\"></span><mat-icon _ngcontent-jwl-c131=\"\" role=\"img\" class=\"mat-icon notranslate material-icons mat-ligature-font mat-icon-no-color\" aria-hidden=\"true\" data-mat-icon-type=\"font\"> exit_to_app </mat-icon><span _ngcontent-jwl-c131=\"\" class=\"menu-text truncate\"> Login </span></span>";//css
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
    public void clickLoginFromSideMenu(){
        WebElement loginButton = driver.findElement(By.cssSelector(LOGIN_SIDE_MENU_BUTTON));
        loginButton.click();
    }
}