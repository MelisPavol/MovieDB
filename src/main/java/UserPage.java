import org.openqa.selenium.Keys;
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

    @FindBy(xpath = "//a[@class='search']")
    private WebElement searchIcon;

    @FindBy(xpath = "//input[@id='search_v4']")
    private WebElement searchTextField;

    @FindBy(xpath = "//input[@id='search_v4']")
    private WebElement searchTextFieldEnter;

    public String getUserNameTitle(){return userNameTitle.getText();}

    public UserPage clickSearchIcon(){
        searchIcon.click();
        return this;
    }
    public UserPage enterTextSearchTextField(String movie){
        searchTextField.sendKeys(movie);
        searchTextField.click();
        return this;
    }
    public MoviePageAlienVsPredator searchEnter (){
        searchTextFieldEnter.sendKeys(Keys.ENTER);
        return new MoviePageAlienVsPredator(driver);

    }






}
