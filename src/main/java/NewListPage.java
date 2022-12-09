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

    @FindBy(xpath = "//span[@class='avatar background_color yellow']")
    private WebElement userIcon;
    //public static String nameText = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());;


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

}
