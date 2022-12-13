import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavoritesPage {
    private WebDriver driver;

    public FavoritesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a/h2[text()='The Guardians of the Galaxy Holiday Special']")
    private WebElement titleMovieTextTheGuardians;

    public String getTitleMovieTextTheGuardians() throws InterruptedException {
        Thread.sleep(3000);
        return titleMovieTextTheGuardians.getText();}



}
