import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
    private WebDriver driver;

    public UserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }

    @FindBy(xpath = "(//a[normalize-space()='qwertest'])[1]")
    private WebElement userNameTitle;


    public String getUserNameTitle(){return userNameTitle.getText();}






}
