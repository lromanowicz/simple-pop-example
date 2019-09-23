package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {

    //Custom sendKeys method to do a workaround for some problematic inputs
    public static void sendKeys(WebElement element, String text) {
        System.out.println("Wpisuję tekst: " + text + " w element: " + element.toString());
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public static void click(WebElement element) {
        System.out.println("Klikam w element: " + element.toString());
        element.click();
    }

    public static void waitForVisibilityOfElement(WebDriver driver, WebElement element, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
