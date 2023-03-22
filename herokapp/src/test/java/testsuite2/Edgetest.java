package testsuite2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Edgetest {
    public WebDriver driver;

    @Test
    public void login() {


        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement clickon = driver.findElement(By.cssSelector("a[href=\"/login\"]"));
        clickon.click();
        WebElement input = driver.findElement(By.cssSelector("input[id='username']"));
        input.sendKeys("tomsmith");
        WebElement input2 = driver.findElement(By.cssSelector("input[id='password']"));
        input2.sendKeys("SuperSecretPassword!");
        WebElement input3 = driver.findElement(By.cssSelector("button[class='radius']"));
        input3.click();
        WebElement text = driver.findElement(By.cssSelector("div[id=\"flash\"]"));
        String s = text.getText();
        Assert.assertTrue(s.contains("You logged into a secure area!"));
    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}

