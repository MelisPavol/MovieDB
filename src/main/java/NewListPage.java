import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewListPage {
    private WebDriver driver;

    public NewListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "description")
    private WebElement description;
    @FindBy(id = "step_1_submit")
    private WebElement continueButton;

    @FindBy(xpath = "//li/a[@title='Profile and Settings']")
    private WebElement userIcon;

    @FindBy(xpath = "//li[text()='name must be provided']")
    private WebElement invalidText;

    public NewListPage enterName(String nameText) {
        name.sendKeys(nameText);
        return this;
    }
    public NewListPage clickContinueButton() {
        continueButton.click();
        return this;
    }
    public UserDropDownMenu clickUserIcon() throws InterruptedException {
        Thread.sleep(1000);
        userIcon.click();
        return new UserDropDownMenu(driver);
    }
    public String invalidTextfield(){
        return invalidText.getText();
    }
}
