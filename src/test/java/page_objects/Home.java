package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {

    @FindBy(xpath = "(//div[@class=\"carousel-caption\"]/a)[1]")
    private WebElement openSignUpPageButton;

    @FindBy(xpath = "//a[text()=\"Contact\"]")
    private WebElement contactLink;

    public Home(WebDriver driver) {
        super(driver);
    }

    public SignUp openSignUpPage() {
        openSignUpPageButton.click();
        return new SignUp(driver);
    }

    public Contact openContactPage() {
        contactLink.click();
        return new Contact(driver);
    }
}
