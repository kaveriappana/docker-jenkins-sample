package base;

import com.google.common.io.Files;
import config.ConfigProperties;
import logsandreports.LoggerTest;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import config.pages.Homepage;
import utiles.WindowManager;
import utilies.EventReporter;
import java.io.File;
import java.io.IOException;

public class BaseTests {
    static String browser;
    static String url;
    public static String username;
    public static String password;
    public static String path;
    public static String option;
    static WebDriver driver;
    //private static EventFiringWebDriver driver;
    //public EventFiringWebDriver driver;
    public static Homepage homePage;

    @BeforeClass
    //set Browser settings
    public static void setBrowser() {
        browser = ConfigProperties.browser;
        url = ConfigProperties.url;

         String projectLocation = System.getProperty("user.dir");
        // static String configFilename = "C:\\Users\\kaveri.appana\\IdeaProjects\\heroko\\log4j.properties";
         String configFilename= projectLocation+"\\log4j.properties";
          final Logger logger =Logger.getLogger(LoggerTest.class.getName());
          PropertyConfigurator.configure(configFilename);
        //System.out.println(browser);
        username = ConfigProperties.username;
        password = ConfigProperties.password;
        path = ConfigProperties.path;
        option=ConfigProperties.option;
    }

    public static void setBrowserConfig() {

        if (browser.contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            //driver = new EventFiringWebDriver(new ChromeDriver());
           // driver.register(new EventReporter());
        }
        if (browser.contains("Edge")) {
            System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
            driver = new EdgeDriver();
           // driver = new EventFiringWebDriver(new ChromeDriver());
            //driver.register();
        }
        if (browser.contains("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    public static void runTest() {
        //String url = ConfigProperties.readConfigProperties();
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new Homepage(driver);
        System.out.println(driver.getTitle());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE== result.getStatus()){
            File screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            //System.out.println("Screenshot taken:"+ screenshot.getAbsolutePath());

            try {
                Files.move(screenshot, new File("resources/screenshotrs/"+result.getName()+".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }


    }
}
