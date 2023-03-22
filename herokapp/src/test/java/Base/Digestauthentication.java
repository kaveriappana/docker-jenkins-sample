package Base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.time.Instant;

import java.time.Instant;

public class Digestauthentication  {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[href='/digest_auth']")).click();
        //Instant wait;
       // Thread.sleep(2000);
        driver.findElement(By.name("User")).sendKeys("admin");
        driver.findElement(By.name("Pass")).sendKeys("admin");
          //WebElement element= driver.findElement((By.cssSelector("button['name=sign']")));
         // element.click();
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("admin");
        driver.switchTo().alert().sendKeys("admin");
       // String alertMessage= driver.switchTo().alert().getText();
        //System.out.println(alertMessage);
        alert.accept();
       // driver.quit();

    }
}
