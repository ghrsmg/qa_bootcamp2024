import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CalculatorNgTest {
    Calculator c;
    @DataProvider
    public Object[][] calculatorDataProviderClassic(){
        return new Object[][]{
                {20,8,12,"+","Addition failed"},
                {1000, 555, 445, "+", "Addition failed"},
                {1,0,1,"+","Addition failed"}
        };
    }
    @DataProvider
    public Iterator<Object[]> calculatorDataProvider(){
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new Object[]  {20,8,12,"+","Addition failed"});
        return dp.iterator();
    }
    private void setupGeneric(){
        c = new Calculator();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("target/report.html");
        extent = new ExtentReports();
    }
    @BeforeMethod
    public void setUp(){
        c = new Calculator();
    }
    @Test(testName = "AdditionPositive", groups = {"addition","calculator"})
    public void test01(){
        Assert.assertEquals(37, c.compute(24,13,"+"),"Addition failed");
    }
    @Test(testName = "AdditionNegative", groups = {"addition","calculator"})
    public void test02(){
        Assert.assertEquals(-23, c.compute(-11,-12,"+"),"Addition failed");
    }
    @Test(testName = "AdditionParameters", groups = {"adittion","calculator"})
    @Parameters({"exp","d1","d2","op","errMess" })
    public void test03(String exp, String d1, String d2, String op,String errMess){
        Assert.assertEquals(Double.parseDouble(exp),c.compute(Double.parseDouble(d1), Double.parseDouble(d2), op),errMess);
    }
    @Test(testName = "AdditionDataProviderClassic", groups = {"addition", "calculator"}, dataProvider = "calculatorDataProviderClassic")
    public void test04(double exp, double d1, double d2, String op, String message){
        Assert.assertEquals(exp, c.compute(d1,d2,op), message);
    }
    @Test(testName = "AdditionDataProvider", groups = {"addition", "calculator"}, dataProvider = "calculatorDataProvider")
    public void test05(double exp, double d1, double d2, String op, String message){
        Assert.assertEquals(exp, c.compute(d1,d2,op), message);
    }


}
