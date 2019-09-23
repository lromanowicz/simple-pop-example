package page_objects;

import com.sun.tools.javac.jvm.Gen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utility.Actions;
import utility.Generators;

public class Contact extends Base {

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "content")
    private WebElement messageInput;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement submitButton;

    @FindBy(css = "h4.alert-success")
    private WebElement messageSentInfo;

    public Contact(WebDriver driver) {
        super(driver);
    }

    public Contact fillInAndSubmitForm() {
        Actions.sendKeys(nameInput, Generators.name());
        Actions.sendKeys(emailInput, Generators.email());
        Actions.sendKeys(messageInput, Generators.quote());
        Actions.click(submitButton);

        return this;
    }

    public void assertThatMessageHasBeenSent() {
        Actions.waitForVisibilityOfElement(driver, messageSentInfo, 10);
        Assert.assertTrue(messageSentInfo.isDisplayed());
    }
}
