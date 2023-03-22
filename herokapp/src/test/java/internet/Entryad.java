package internet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Entryad {
    WebDriver driver;
    @Test
    public void model(){
        driver.findElement(By.linkText("Entry Ad")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("div.modal-footer"))));
        //driver.findElement(By.xpath("button[//p[text()='Close']]")).click();
       driver.findElement(By.cssSelector("div.modal-footer")).click();
    }
    @BeforeMethod
    public void run(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}


