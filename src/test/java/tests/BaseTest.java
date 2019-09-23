package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page_objects.Contact;
import page_objects.Home;
import page_objects.SignUp;
import page_objects.SignUpConfirmation;

public class BaseTest {
    //Declare class fields
    private WebDriver driver;
    protected Home home;

    //Runs once before each @Test method
    @BeforeMethod
    public void setUp() {

        //This line downloads and sets the chromedriver path.
        //It will check what browser version is installed on your machine.
        WebDriverManager.chromedriver().setup();

        //Open Chrome
        driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open URL
        driver.get("http://jacekokrojek.github.io/jak-to-zrobic-w-js/index.html");

        //Initialize Home object
        home = new Home(driver);
    }

    //Runs once after each @Test method
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
