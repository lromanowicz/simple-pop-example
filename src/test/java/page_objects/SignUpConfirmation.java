package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignUpConfirmation extends Base {

    @FindBy(tagName = "h2")
    private WebElement pageHeader;

    public SignUpConfirmation(WebDriver driver) {
        super(driver);
    }

    public void assertThatPageHeaderIsCorrect() {
        Assert.assertEquals(pageHeader.getText(), "Thank you for registration");
    }
}
