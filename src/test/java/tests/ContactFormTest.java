package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactFormTest extends BaseTest {
    @Test
    public void userShouldBeAbleToSendContactFormTest() {
        home.open();
        home.openPage("Contact");
        contact.fillInAndSubmitForm("Jack", "jack@mailinator.com", "Message Text");
        String actualText = contact.getMessageSentInformation();

        Assert.assertEquals("Your message has been sent.", actualText);
    }
}
