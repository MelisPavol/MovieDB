import helpers.TestValues;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FavoritesTest extends BaseTest {

    @Test
    void test_US_04_TC_01_Add_to_favourite() {
        var movieTitleFromFavoritesPage = homePage
                .clickLogin()
                .enterUsername(TestValues.TEST_VALID_USERNAME)
                .enterPassword(TestValues.TEST_VALID_PASSWORD)
                .clickLoginButton()
                .clickSearchIcon()
                .enterTextSearchTextField(TestValues.TEST_SEARCH_MOVIE_AT_SEARCH_TEXT_FIELD)
                .enterSearch()
                .clickMovieTheGuardians()
                .clickHeardsFavoriteMovie()
                .clickUserIcon()
                .clickViewProfile()
                .clickOverViewButton()
                .clickFavotitesOverview()
                .clickFavotitesMovies()
                .getTitleMovieTextTheGuardians();

        assertEquals(movieTitleFromFavoritesPage,"The Guardians of the Galaxy Holiday Special");
    }
}