package internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fileupload {
    WebDriver driver;
    @Test
    public void uploadFile(){
       // driver.findElement(By.cssSelector("a[href='/upload'']")).click();
        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\kaveri.appana\\IdeaProjects\\herokapp\\resources\\chromedriver.exe");
        driver.findElement(By.id("file-submit")).click();
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
