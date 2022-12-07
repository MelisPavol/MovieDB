import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li/a[@href='/login' and text()='Login']")
    private WebElement loginButton;

    public LoginPage clickLogin() {
        loginButton.click();
        return new LoginPage(driver);
    }



}
