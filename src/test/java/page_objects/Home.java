package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    @FindBy(xpath = "(//div[@class=\"carousel-caption\"]/a)[1]")
    private WebElement openSignUpPageButton;

    public Home(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("http://jacekokrojek.github.io/jak-to-zrobic-w-js/index.html");
    }

    public void openSignUpPage() {
        openSignUpPageButton.click();
    }
}
