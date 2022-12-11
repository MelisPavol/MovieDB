import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }

    @FindBy(xpath = "//a/h2[text()='Aliens vs Predator: Requiem']")
    private WebElement movieAlienVsPredator;

    @FindBy(xpath = "//div/p[text()='There are no movies that matched your query.']")
    private WebElement invalidSearchText;

    public String getTextAlienVsPredator(){
        return movieAlienVsPredator.getText();
    }

    public String getInvalidSearchText(){return invalidSearchText.getText();}



}
