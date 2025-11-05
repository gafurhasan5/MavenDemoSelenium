package calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class calculatorTestDemo {
    @Test
    public void addPositivenumber() {
        calculatorTest calc = new calculatorTest();
        int res=calc.add(3,5);
        System.out.println("res of 5+3="+res);
        Assert.assertEquals(res,8,"Addition failed");
    }
}
