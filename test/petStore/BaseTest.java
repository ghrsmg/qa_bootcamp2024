package petStore;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import juiceShop.frameworkUtils.Utils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static String petStoreBaseUrl = Utils.getConfigProperty("petStoreUrl");
    protected RequestSpecification httpRequest;
    @BeforeMethod
    public void setupUp(){
        RestAssured.baseURI = petStoreBaseUrl;
        httpRequest = RestAssured.given();
    }
}
