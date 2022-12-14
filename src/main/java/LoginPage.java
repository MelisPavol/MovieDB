import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameTextField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@id='login_button']")
    private WebElement loginButtonLoginPage;

    @FindBy(xpath = "//h2/span")
    private WebElement invalidSingInText;


    public LoginPage enterUsername (String userName){
        usernameTextField.click();
        usernameTextField.sendKeys(userName);
        return this;
    }
    public LoginPage enterPassword(String password){
        passwordTextField.click();
        passwordTextField.sendKeys(password);
        return this;
    }
    public UserPage clickLoginButton(){
        loginButtonLoginPage.click();
        return new UserPage(driver);
    }
    public LoginPage clickLoginButtonInvalid(){
        loginButtonLoginPage.click();
        return this;
    }
    public String getInvalidSignInText(){return invalidSingInText.getText();}



}
