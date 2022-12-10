import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class ListsPage {
    private WebDriver driver;

    public ListsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); //init all elements on this page ,
    }

    @FindBy(xpath = "//a[@class = 'rounded button border_color background_color yellow']")
    private WebElement createListButton;

    public NewListPage clickCreateList() {
        createListButton.click();
        return new NewListPage(driver);
    }

    public List<String> getAllLists() {
        List<String> lists = driver
                .findElements(By.xpath("//div[@class = 'details']/h2/a"))
                .stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
        return lists;
    }
}
