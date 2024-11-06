package juiceShop.tests;

import juiceShop.frameworkUtils.Selectors;
import juiceShop.frameworkUtils.Utils;
import juiceShop.pages.LoginPage;
import juiceShop.pages.LoginPagePF;
import juiceShop.pages.MainPage;
import juiceShop.pages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegisterTest extends BaseTest{

    @DataProvider(name = "RegistrationDataProvider")
    public Iterator<Object[]> registerDp () {
        Collection<Object[]> dp = new ArrayList<>();
       // dp.add(new String[] {"alex@alex.com", "Alex98876%", "alex"});
        dp.add(new String[]{"","",""});
        dp.add(new String[] {"gabi","Ffff0000,","gabi"});
        return dp.iterator();
    }

    @Test(dataProvider = "RegistrationDataProvider")
    public void loginRegister2(String username, String password, String securityAns) {
        driver.get(baseUrl + "/#/login");
        LoginPage lp = new LoginPage(driver);
        lp.awaitDismissModal();
        lp.newUser();
        RegistrationPage rp = new RegistrationPage(driver);
        Assert.assertEquals(rp.getRegisterHeader(), rp.getRegisterPageStatic());
        rp.register(username, password, securityAns);
        rp.clickSubmitButton();
    }
    @Test(dataProvider = "RegistrationDataProvider")
    public void negativeRegister1(String username, String password, String securityAns){
        driver.get(baseUrl + "/#/register");
//        MainPage mp = new MainPage(driver);
//        mp.openSideMenu();
//        mp.clickLoginFromSideMenu();
//        LoginPagePF lp = new LoginPagePF(driver);
//        lp.dismissModal();
//        Assert.assertEquals(lp.getLoginText(),lp.getStaticLoginText());
//        lp.newUser();
        RegistrationPage rp = new RegistrationPage(driver);
        Assert.assertEquals(rp.getRegisterHeader(),rp.getRegisterPageStatic());
        rp.dismissModal();
        rp.register(username, password, securityAns);
        Assert.assertEquals(rp.getEmailError(),rp.getStaticEmailError(),"You should provide a valid email");
        Assert.assertEquals(rp.getPasswordError(),rp.getStaticPasswordError(),"You should choose a correct password");
        Assert.assertEquals(rp.getRepeatPasswordError(),rp.getStaticRepeatPasswordError(),"You have to put the same password");
        Assert.assertEquals(rp.getSecurityAnswerError(),rp.getStaticSecurityAnswerError(),"You have to choose a security question and answer it");




    }

}