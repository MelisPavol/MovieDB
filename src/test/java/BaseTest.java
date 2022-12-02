import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;


    @BeforeTest
    void setup() {
        WebDriverManager.chromedriver().setup();
        var link = "https://www.themoviedb.org/";
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(link);
        homePage = new HomePage(driver);

    }

    @AfterTest
    void closeBrowser() {
          driver.close(); //Close webdriver!
        // driver.quit(); //Close chrome  browser
    }
    @Test
    void test (){

    }
}
