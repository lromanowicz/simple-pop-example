package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpFormTest extends BaseTest {
    @Test
    public void userShouldBeAbleToRegisterTest() {
        home.open();
        home.openSignUpPage();
        signUp.fillInAndSubmitForm("Jack", "jack@mailinator.com", "hasło", "hasło");
        Assert.assertEquals("Thank you for registration", signUpConfirmation.getPageHeaderText());
    }
}
