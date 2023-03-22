package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindow {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
        element.click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        String s=driver.getWindowHandle();
        System.out.println(s);
        driver.quit();

    }
}
