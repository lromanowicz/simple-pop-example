package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String pageName) {
        driver.findElement(By.xpath("//ul[@class=\"nav\"]//a[text()=\"" + pageName + "\"]")).click();
    }
}
