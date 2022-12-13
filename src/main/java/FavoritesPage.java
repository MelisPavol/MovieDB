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

    @FindBy(xpath = "//div[@class = 'items_wrapper']")
    private WebElement item;

    public Boolean itemIsDisplayed() {

        return item.isDisplayed();}

    public String getTitleMovieTextTheGuardians()  {

        return titleMovieTextTheGuardians.getText();}



}
