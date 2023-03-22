package Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Instant;

public class Alertsandpopups {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("JavaScript Alerts")).click();
       // alerts
        //driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        //Alert alert = driver.switchTo().alert();
       // Thread.sleep(2000);
       // alert.accept();

       // driver.findElement(By.linkText("JavaScript Alerts")).click();
       // driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        //Alert alert = driver.switchTo().alert();
       // Thread.sleep(2000);
        //alert.dismiss();

        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Instant wait;
        Thread.sleep(2000);
        Alert palert = driver.switchTo().alert();
        //String text = palert.getText();
       // System.out.println(text);
       // palert.sendKeys("hello");
        palert.accept();


        //driver.quit();
    }
    }
