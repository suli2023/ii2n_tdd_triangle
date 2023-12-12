import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TriangleTest {
    Triangle triangle;
    @BeforeTest
    public void initTest() {
        this.triangle = new Triangle();
    }
    @Test
    public void testCalcArea_30_35() {
        double actual = this.triangle.calcArea(30, 35);
        double expected = 525.0;
        Assert.assertEquals(actual, expected);        
    }
    @Test
    public void testCalcArea_105_130() {
        double actual = this.triangle.calcArea(105, 130);
        double expected = 6825.0;
        Assert.assertEquals(actual, expected);
    }
}
