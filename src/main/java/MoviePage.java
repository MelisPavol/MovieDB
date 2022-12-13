import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoviePage {
    private WebDriver driver;

    public MoviePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }

    @FindBy(xpath = "//li/a[@id='favourite']")
    private WebElement heardsFavoriteMovie;

    @FindBy(xpath = "//li/a[@data-role='tooltip']")
    private  WebElement userIcon;

    @FindBy(xpath = "//li/span[@class='k-link k-menu-link']")
    private WebElement overviewButton;

    public MoviePage clickHeardsFavoriteMovie(){
        heardsFavoriteMovie.click();
        return this;
    }
    public UserDropDownMenu clickUserIcon(){
        userIcon.click();
        return new UserDropDownMenu(driver);
    }

    public MoviePage clickOverViewButton(){
        overviewButton.click();
        return this;
    }


}
