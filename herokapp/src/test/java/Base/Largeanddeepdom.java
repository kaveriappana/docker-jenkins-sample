package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Largeanddeepdom {
    WebDriver driver;

    @Test
    public void scrolltotable() {
        driver.findElement(By.cssSelector("a[href='/large']")).click();
        WebElement tableElement = driver.findElement(By.id("large-table"));
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);

    }
@Test
public void infinatescroll()
{
    driver.findElement(By.cssSelector("a[href='/infinite_scroll']")).click();
    By textBlocks = By.className("jscroll-added");

   // String script = "window.scrollTo(0, document.body.scrollHeight)";

}
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
    }

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

