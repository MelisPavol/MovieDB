import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    };

    @FindBy(xpath = "//li/a[@href='/login']")
    private WebElement loginHomePageButton;

    public LoginPage clickLogin() throws InterruptedException {
        Thread.sleep(3000);
        loginHomePageButton.click();
        return new LoginPage(driver);
    }



}
