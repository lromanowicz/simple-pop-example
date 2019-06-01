package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {
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

    public static void waitForVisibilityOfElement(WebDriver driver, By locator, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
