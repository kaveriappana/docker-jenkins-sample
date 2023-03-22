package testsuite1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Chrometest {
    WebDriver driver;
    @Test
    public void login()
    {

        WebElement clickon = driver.findElement(By.cssSelector("a[href=\"/login\"]"));
        clickon.click();
        WebElement input = driver.findElement(By.cssSelector("input[id='username']"));
        input.sendKeys("tomsmith");
        WebElement input2 = driver.findElement(By.cssSelector("input[id='password']"));
        input2.sendKeys("SuperSecretPassword!");
        WebElement input3 = driver.findElement(By.cssSelector("button[class='radius']"));
        input3.click();
        WebElement  text = driver.findElement(By.cssSelector("div[id=\"flash\"]"));
        String s=text.getText();
        Assert.assertTrue(s.contains("You logged into a secure area!"));
       driver.findElement(By.cssSelector("a[href='/logout']")) .click();
    }

  // @Test
  // public void logout()
   // {

       //driver.findElements(By.xpath("//i[text()='Logout']"));

      // driver.findElement(By.xpath("//i[text()='Logout']")).click();
      // driver.findElement(By.cssSelector("a[href='/logout']")).click();
       // WebElement  text = driver.findElement(By.cssSelector("div[id=\"flash\"]"));
       // String s=text.getText();
       // Assert.assertTrue(s.contains("You logged out of the secure area!"));

  // }
    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
