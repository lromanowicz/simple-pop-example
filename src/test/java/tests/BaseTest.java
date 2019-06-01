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
    private WebDriver driver;
    protected Home home;
    protected SignUp signUp;
    protected SignUpConfirmation signUpConfirmation;
    protected Contact contact;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        home = new Home(driver);
        signUp = new SignUp(driver);
        signUpConfirmation = new SignUpConfirmation(driver);
        contact = new Contact(driver);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
