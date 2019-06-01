package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends Base {

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

    public void fillInAndSubmitForm(String username, String email, String password, String passwordConfirm) {
        usernameInput.sendKeys(username);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        passwordConfirmInput.sendKeys(passwordConfirm);
        submitButton.click();
    }
}
