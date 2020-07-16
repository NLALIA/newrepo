import org.testng.Assert;
import org.testng.annotations.*;

import java.util.jar.JarOutputStream;

public class HomeTest {
    Calculator calculator;

    @BeforeSuite
    @Parameters({"calcName","type"})
    public void setUp(String calcName,String t){
        calculator = new Calculator(calcName);
        System.out.println("Hello this is the start of the testing environment");
        System.out.println("The name of the calculator is "+calcName);
        System.out.println(t);
    }

    @BeforeTest
    @Parameters("type")
    public void setUpdateTest(String t){
        System.out.println(t);
    }

    @Parameters({"MethodName"})
    @Test
    public void testSum(String st){
        System.out.println(" From param test");
        //calculator = new Calculator("hh");
        System.out.println("We are testing the "+st+" method.");
        Assert.assertEquals(calculator.sum(5,6),11,0);
    }

    @Test
    public void testSubstraction(){
        calculator = new Calculator("ab");
        Assert.assertEquals(calculator.substraction(10,5),5,0);
    }

    @Test
    public void testMultiplication(){
        calculator = new Calculator("cd");
        Assert.assertEquals(calculator.multiplication(5,2),10);
    }

    @Test
    public void testGetName(){
        calculator = new Calculator("NAVDEEP");
        Assert.assertEquals(calculator.getName(),"NAVDEEP");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Hello, I am after suite method");
    }
}
