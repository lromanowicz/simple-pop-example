package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpConfirmation extends Base {
    @FindBy(tagName = "h2")
    private WebElement pageHeader;

    public SignUpConfirmation(WebDriver driver) {
        super(driver);
    }

    public String getPageHeaderText() {
        return pageHeader.getText();
    }
}
