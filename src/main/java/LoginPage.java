import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    };

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameTextField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "//input[@id='login_button']")
    private WebElement loginButtonLoginPage;



    public LoginPage enterusername (String userName){
        usernameTextField.click();
        usernameTextField.sendKeys(userName);
        return this;
    }
    public LoginPage enterpassword(String password){
        passwordTextField.click();
        passwordTextField.sendKeys(password);
        return this;
    }
    public UserPage loginButton(){
        loginButtonLoginPage.click();
        return new UserPage(driver);
    }


}
