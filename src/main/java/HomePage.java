import org.openqa.selenium.JavascriptExecutor;
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

    @FindBy(xpath = "//li/a[@title='Profile and Settings']")
    private WebElement userIcon;

    public LoginPage clickLogin() {
        loginHomePageButton.click();
        return new LoginPage(driver);
    }

    public UserDropDownMenu clickUserIcon() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", userIcon);

        //userIcon.click();
        return new UserDropDownMenu(driver);
    }
}
