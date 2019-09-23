package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpFormTest extends BaseTest {
    @Test
    public void userShouldBeAbleToRegisterTest() {
        home
                .openSignUpPage()
                .fillInAndSubmitForm()
                .assertThatPageHeaderIsCorrect();
    }
}
