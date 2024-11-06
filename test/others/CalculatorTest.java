package others;
import Calculator.Calculator;
import org.junit.jupiter.api.*;



public class CalculatorTest {
    Calculator c;
    @BeforeAll
    public static void classSetup(){
        System.out.println("Preparing the class for tests");

    }
    @BeforeEach
    public void testSetup(){
        System.out.println("The method runs before each test!");
        c = new Calculator();
    }
    @Test
    public void testAddition01(){
        double result = c.compute(3,4,"+");
        Assertions.assertEquals(7,result,"add failed");
    }
    @Test
    public void testAddition02(){
        Assertions.assertEquals(14.5,c.compute(10,4.5,"+"));
    }
    @Test()
    public void testInvalidOperator(){
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class,()->
        {c.compute(5,7,"ABC");}, "Operator not valid");
    }
    @Test()
    public void testDivisionByZero(){
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class,()->
        {c.compute(5,0,"/");}, "Operator not valid");
    }
    @Test
    public void testSubstraction(){
    Assertions.assertEquals(10,c.compute(5,-5,"-"),"substraction failed!");
    }
    @Test
    public void testMultiplication(){
        Assertions.assertEquals(14,c.compute(7,2,"*"),"multiplication failed!");
    }
    @Test
    public void testSquareRoot01(){
        Assertions.assertEquals(8,c.compute(64,0,"SQRT"),"Square root failed!");
    }
    @Test
    public void testSquareRoot02(){
        Assertions.assertEquals(Math.sqrt(2),c.compute(2,0,"SQRT"),"Square root failed!");
    }
    @AfterEach
    public void cleanTest(){
        System.out.println("Cleanup after the test.");
    }
    @AfterAll
    public static void  cleanClass(){
        System.out.println("Tests done!");
    }

}
