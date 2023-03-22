package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Draganddrop {
    WebDriver driver;
 @Test
    public void Drag(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href='/drag_and_drop']")).click();
        // WebElement From=driver.findElement(By.cssSelector("a[href='/drag_and_drop']"));
        Actions act=new Actions(driver);
       //act.Drag().build().perform();
        driver.quit();
    }
}