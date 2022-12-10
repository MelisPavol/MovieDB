import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoviePageAlienVsPredator {
    private WebDriver driver;

    public MoviePageAlienVsPredator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }

    @FindBy(xpath = "//a/h2[text()='Aliens vs Predator: Requiem']")
    private WebElement movieAlienVsPredator;


    public String getTextAlienVsPredator(){
        return movieAlienVsPredator.getText();
    }



}
