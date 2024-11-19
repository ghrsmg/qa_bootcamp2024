package others;

import org.testng.annotations.*;

public class MyFirstTestngTests {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Running the code before suite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Running the the code before class");
    }
    @BeforeGroups(groups = "print")
    public void beforeGroups(){
        System.out.println("Running before groups");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Running before test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Running before method");
    }
    @Test(testName = "My first test", description = "the first test", groups = "basicTest", priority = 2)
    public void test01(){
        System.out.println("My first testng test");
    }
    @Test(groups = {"print"})
    public void test02(){
        printSomething("test02");

    }
    @Test (groups = {"print"}, enabled = false)
    public void test03(){
        printSomething("test03");
    }
    private void printSomething(String something){
        System.out.println("Printing something: " + something);
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Running after the method");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Running after test");
    }
    @AfterGroups
    private void afterGroups(){
        System.out.println("Running after groups");
    }
    @AfterClass
    private void afterClass(){
        System.out.println("running after class");
    }
    @AfterSuite
    private void afterSuite(){
        System.out.println("Running code after suite");
    }
}
