import org.openqa.selenium.JavascriptExecutor;
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
    @FindBy(xpath = "//a[@class = 'k-link k-menu-link' and text() ='Lists']")
    private WebElement listsButton;

    @FindBy(xpath = "//a[@class='logo']")
    private WebElement logo;

    @FindBy(xpath = "//li[@class='true k-item k-menu-item k-state-default k-first']")
    private WebElement overviewButton;

    @FindBy(xpath = "//li[@class='true k-item k-menu-item k-state-default k-first']")
    private WebElement favoritesOfOverview;

    @FindBy(xpath = "//a[@href='/u/qwertest/favorites']")
    private WebElement favoritesMovies;

    public UserPage clickFavotitesOverview() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", favoritesOfOverview);
        return this;
    }

    public FavoritesPage clickFavotitesMovies() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", favoritesMovies);
        return new FavoritesPage(driver);
    }
    public UserPage clickOverView() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", overviewButton);
        return this;
    }
    public String getUserNameTitle(){return userNameTitle.getText();}

    public ListsPage clickListsButton(){
        listsButton.click();
        return new ListsPage(driver);
    }
    public UserPage clickSearchIcon(){
        searchIcon.click();
        return this;
    }
    public UserPage enterTextSearchTextField(String movie){
        searchTextField.sendKeys(movie);
        searchTextField.click();
        return this;
    }
    public SearchPage enterSearch(){
        searchTextFieldEnter.sendKeys(Keys.ENTER);
        return new SearchPage(driver);

    }

    public HomePage clickLogo(){
        logo.click();
        return new HomePage(driver);
    }
    public UserPage enterInvalidSearchText(String invalidSearch){
        searchTextField.sendKeys(invalidSearch);
        searchTextField.click();
        return this;
    }
    public UserPage clickOverViewButton(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", overviewButton);
        return this;
    }

}
