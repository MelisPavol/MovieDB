import helpers.TestValues;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchTest extends BaseTest {

    @Test
    void test_US_02_TC_01_Valid_search_text_field() {
        var movie_Title = homePage
                .clickLogin()
                .enterUsername(TestValues.TEST_VALID_USERNAME)
                .enterPassword(TestValues.TEST_VALID_PASSWORD)
                .clickLoginButton()
                .clickSearchIcon()
                .enterTextSearchTextField(TestValues.TEST_SEATCH_VALID_TEXT_AT_SEARCH_TEXT_FIELD)
                .enterSearch()
                .getTextAlienVsPredator();

        assertEquals(movie_Title,"Aliens vs Predator: Requiem");
    }
    @Test
    void test_US_02_TC_02_Invalid_search_text_field() {
        var invalidSearchText = homePage
                .clickLogin()
                .enterUsername(TestValues.TEST_VALID_USERNAME)
                .enterPassword(TestValues.TEST_VALID_PASSWORD)
                .clickLoginButton()
                .clickSearchIcon()
                .enterInvalidSearchText(TestValues.TEST_SEARCH_INVALID_TEXT_AT_SEARCH_TEXT_FIELD)
                .enterSearch()
                .getInvalidSearchText();

        assertEquals(invalidSearchText,"There are no movies that matched your query.");
    }


}
