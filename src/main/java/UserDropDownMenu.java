import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDropDownMenu {

    private WebDriver driver;

    public UserDropDownMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//a[text() = 'View profile'])[1]")
    private WebElement viewProfile;

    @FindBy(xpath = "(//a[text()= 'Lists'])[1]")
    private WebElement lists;

    public UserPage clickViewProfile() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewProfile);
        return new UserPage(driver);
    }
}
