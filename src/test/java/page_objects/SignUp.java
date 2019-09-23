package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Generators;

public class SignUp extends Base {

    //@FindBy annotation looks for an element
    @FindBy(id = "usernamesignup")
    private WebElement usernameInput;

    @FindBy(id = "emailsignup")
    private WebElement emailInput;

    @FindBy(id = "passwordsignup")
    private WebElement passwordInput;

    @FindBy(id = "passwordsignup_confirm")
    private WebElement passwordConfirmInput;

    @FindBy(css = "a[type=\"button\"]")
    private WebElement submitButton;

    public SignUp(WebDriver driver) {
        super(driver);
    }

    public SignUpConfirmation fillInAndSubmitForm() {
        String password = Generators.password();

        usernameInput.sendKeys(Generators.username());
        emailInput.sendKeys(Generators.email());
        passwordInput.sendKeys(password);
        passwordConfirmInput.sendKeys(password);
        submitButton.click();

        return new SignUpConfirmation(driver);
    }
}
