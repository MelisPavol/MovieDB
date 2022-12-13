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

    @FindBy(xpath = "//div[@id ='card_movie_5fd2c42d37b3a900408a77bf']")
    private WebElement cardTheGuardians;

    public Boolean cardIsDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        return cardTheGuardians.isDisplayed();}

    public String getTitleMovieTextTheGuardians() throws InterruptedException {
        Thread.sleep(3000);
        return titleMovieTextTheGuardians.getText();}



}
