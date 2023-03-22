package base;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import utlies.EventReporter;

public class Basetests {
    static String browser;
    static String url;
    public static String username;
    public static String password;
   // static WebDriver driver;
    private EventFiringWebDriver driver;

   // private WebDriver driver;
    public static HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        homePage = new HomePage(driver);
    }

    @AfterClass
    public void close() {
        driver.quit();

    }

}
