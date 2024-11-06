package juiceShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import juiceShop.frameworkUtils.Utils;

public class RegistrationPage extends BasePage {

    // register page
    private static final String REGISTER_HEADER = "body > app-root > div > mat-sidenav-container > mat-sidenav-content > app-register > div > mat-card > h1";
    private static final String REGISTER_EMAIL = "emailControl";
    private static final String MODAL_SELECTOR = "#mat-dialog-0 > app-welcome-banner > div > div:nth-child(3) > button.mat-focus-indicator.close-dialog.mat-raised-button.mat-button-base.mat-primary.ng-star-inserted > span.mat-button-wrapper > mat-icon";//CSS

    private static final String REGISTER_PASSWORD = "passwordControl";
    private static final String REGISTER_CONFIRM = "repeatPasswordControl";
    private static final String SECURITY_QUESTION = "securityQuestion";
    private static final String SECURITY_OPTION1 = "#mat-option-0 > span";
    private static final String SECURITY_ANSWER = "securityAnswerControl";
    private static final String REGISTER_SUBMIT_BUTTON = "registerButton";
    private static final String COOKIES_MODAL = "body > div.cc-window.cc-floating.cc-type-info.cc-theme-classic.cc-bottom.cc-right.cc-color-override--1225450786 > div > a";

    private static final String REGISTER_STATIC_TEXT = "User Registration";
    private static final String PROVIDE_EMAIL_ERROR = "#mat-error-9";
    private static final String PROVIDE_PASSWORD_ERROR = "#mat-error-10";
    private static final String REPEAT_PASSWORD_ERROR = "#mat-error-11";
    private static final String SECURITY_ANSWER_ERROR = "#mat-error-13";
    private static final String PROVIDE_EMAIL_ERROR_TEXT = "Please provide an email address.";
    private static final String PROVIDE_PASSWORD_ERROR_TEXT = "Please provide a password.";
    private static final String REPEAT_PASSWORD_ERROR_TEXT = "Please repeat your password.";
    private static final String SECURITY_ANSWER_ERROR_TEXT = "#Please provide an answer to your security question.";

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public String getRegisterHeader() {
        return driver.findElement(By.cssSelector(REGISTER_HEADER)).getText();
    }

    public String getRegisterPageStatic() {
        return REGISTER_STATIC_TEXT;
    }

    public void register(String email, String password, String securityAnswer) {
        WebElement emailField = driver.findElement(By.id(REGISTER_EMAIL));
        WebElement passwordField = driver.findElement(By.id(REGISTER_PASSWORD));
        WebElement passwordConfirm = driver.findElement(By.id(REGISTER_CONFIRM));

        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        passwordConfirm.clear();
        passwordConfirm.sendKeys(password);

        WebElement securityQuestionDropDown = Utils.waitForElement(driver, 10, By.name(SECURITY_QUESTION));
        securityQuestionDropDown.click();
        WebElement securityQ1 =  Utils.waitForElement(driver, 5, By.cssSelector(SECURITY_OPTION1));
        securityQ1.click();
        WebElement securityAnswerField = driver.findElement(By.id(SECURITY_ANSWER));
        securityAnswerField.clear();
        securityAnswerField.sendKeys(securityAnswer);

        WebElement cookiesButton = driver.findElement(By.cssSelector(COOKIES_MODAL));
        cookiesButton.click();

    }
    public void clickSubmitButton(){
        WebElement submitButton = Utils.waitForElementClickable(driver, 10, By.id(REGISTER_SUBMIT_BUTTON));
        submitButton.click();
    }
    public String getEmailError(){
        return driver.findElement(By.cssSelector(PROVIDE_EMAIL_ERROR)).getText();
    }
    public String getStaticEmailError(){
        return PROVIDE_EMAIL_ERROR_TEXT;
    }
    public String getPasswordError(){
        return driver.findElement(By.cssSelector(PROVIDE_PASSWORD_ERROR)).getText();
    }
    public String getStaticPasswordError(){
        return PROVIDE_PASSWORD_ERROR_TEXT;
    }
    public String getRepeatPasswordError(){
        return driver.findElement(By.cssSelector(REPEAT_PASSWORD_ERROR)).getText();
    }
    public String getStaticRepeatPasswordError(){
        return REPEAT_PASSWORD_ERROR_TEXT;
    }
    public String getSecurityAnswerError(){
        return driver.findElement(By.cssSelector(SECURITY_ANSWER_ERROR)).getText();
    }
    public String getStaticSecurityAnswerError(){
        return SECURITY_ANSWER_ERROR_TEXT;
    }
    public void dismissModal(){
        WebElement modalElement = driver.findElement(By.cssSelector(MODAL_SELECTOR));
        modalElement.click();
    }




}