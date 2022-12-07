import helpers.TestValues;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SignInTest extends BaseTest {

    @Test
    void test_US_01_TC_01_Valid_Sing_in() {
        var userName = homePage
                .clickLogin()
                .enterUsername(TestValues.TEST_VALID_USERNAME)
                .enterPassword(TestValues.TEST_VALID_PASSWORD)
                .clickLoginButton()
                .getUserNameTitle();

        assertEquals(userName,"qwertest");
    }
    @Test
    void test_US_01_TC_02_Invalid_Sing_in(){
        var invalidSignInText = homePage
                .clickLogin()
                .enterUsername(TestValues.TEST_INVALID_USERNAME)
                .enterPassword(TestValues.TEST_INVALID_PASSWORD)
                .clickLoginButtonInvalid()
                .getInvalidSignInText();

        System.out.println("Print" + invalidSignInText);
        assertEquals(invalidSignInText,"  There was a problem");

    }


}
