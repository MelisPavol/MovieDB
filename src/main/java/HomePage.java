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

    @FindBy(xpath = "//li/a[@href='/login']")
    private WebElement loginHomePageButton;

    @FindBy(xpath = "//span[@class='avatar background_color yellow']")
    private WebElement userIcon;

    public LoginPage clickLogin() {
        loginHomePageButton.click();
        return new LoginPage(driver);
    }

    public UserDropDownMenu clickUserIcon() {
        userIcon.click();
        return new UserDropDownMenu(driver);
    }
}
