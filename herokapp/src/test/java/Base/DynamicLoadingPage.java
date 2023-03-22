package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

public class DynamicLoadingPage {
    WebDriver driver;
    //By startButton = By.cssSelector("div[id='start'] button");
    //By startButton = By.xpath("//button[text()='Start']");
    By startButton = By.cssSelector("#start button");
    By loadingIndicator = By.id("loading");
    By loadedText = By.id("finish");



    public void clickStart() {
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }

    @Test

    public void Test() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[href='/dynamic_loading']")).click();

        driver.findElement(By.cssSelector("a[href='/dynamic_loading/1']")).click();
        clickStart();
        assertEquals(getLoadedText(), "Hello World!", "Loaded text incorrect");
        driver.quit();

    }
}