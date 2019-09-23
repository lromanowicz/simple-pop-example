package tests;

import org.testng.annotations.Test;

public class ContactFormTest extends BaseTest {

    //@Test declares method as a test
    @Test
    public void userShouldBeAbleToSendContactFormTest() {
        home
                .openContactPage()
                .fillInAndSubmitForm()
                .assertThatMessageHasBeenSent();
    }
}
