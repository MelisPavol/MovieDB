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

    @FindBy(xpath = "//a/h2")
    private WebElement titleMovieTextTheGuardians;

    @FindBy(xpath = "//div/h2[text() = 'My Favorites']")
    private WebElement favPageTitle;

    public String getPageTitle() {

        return favPageTitle.getText();}

    public String getTitleMovieTextTheGuardians()  {

        return titleMovieTextTheGuardians.getText();}



}
