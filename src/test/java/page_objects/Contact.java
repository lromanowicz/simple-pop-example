package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Actions;

public class Contact extends Base {

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "content")
    private WebElement messageInput;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement submitButton;

    @FindBy(css = "span.message > h3")
    private WebElement messageSentInfo;

    public Contact(WebDriver driver) {
        super(driver);
    }

    public void fillInAndSubmitForm(String name, String email, String message) {
        Actions.sendKeys(nameInput, name);
        Actions.sendKeys(emailInput, email);
        Actions.sendKeys(messageInput, message);
        Actions.click(submitButton);
    }

    public String getMessageSentInformation() {
        Actions.waitForVisibilityOfElement(driver, By.cssSelector("span.message > h3"), 10);
        return messageSentInfo.getText();
    }
}
