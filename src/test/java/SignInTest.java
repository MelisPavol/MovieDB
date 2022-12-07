import helpers.TestValues;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SignInTest extends BaseTest {

    @Test
    void test_US_01_TC_01_Valid_SIng_in() {
        var userName = homePage
                .clickLogin()
                .enterUsername(TestValues.Test_Valid_UserName)
                .enterPassword(TestValues.Test_Valid_Password)
                .clickLoginButton()
                .getUserNameTitle();
        
        assertEquals(userName,"qwertest");

    }
}