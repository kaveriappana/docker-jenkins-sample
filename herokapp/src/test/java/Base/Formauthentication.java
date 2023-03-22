package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Formauthentication {
    public static void main(String args[])throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[class='radius']")).click();
        WebElement flashmessage = driver.findElement(By.id("flash"));
        String successmessage = flashmessage.getText();
        Assert.assertTrue(successmessage.contains("You logged into a secure area!"));
        driver.quit();
    }

}

