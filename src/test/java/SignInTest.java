import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest{

    @Test
    public void doTest() {
        var a = 2;
        Assert.assertEquals(2, a);
    }
    @Test
    public void doTestFailed() {
        var a = 2;
        Assert.assertEquals(2, a);
    }
}
