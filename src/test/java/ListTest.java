import helpers.TestValues;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class ListTest extends BaseTest {

//@Ignore
    @Test
    void test_US_03_TC_01_Create_new_list_Valid_data() throws InterruptedException {
        signIn(TestValues.TEST_VALID_USERNAME, TestValues.TEST_VALID_PASSWORD);

        var lists = homePage
                .clickUserIcon()
                .clickViewProfile()
                .clickListsButton()
                .clickCreateList()
                .enterName(TestValues.listTitle)
                .clickContinueButton()
                .clickUserIcon()
                .clickViewProfile()
                .clickListsButton()
                .getAllLists();

        assertTrue(lists.contains(TestValues.listTitle));
    }
}
