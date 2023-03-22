package Base;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        //import org.testng.Assert;
//import org.testng.Assert;

public class Keypress {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.cssSelector("a[href='/key_presses']")).click();
        driver.findElement(By.id("target")).sendKeys("123");
       // driver.findElement(By.id("result")).getText();

        String title = driver.getTitle();
        System.out.println(title);


        //driver.quit();
    }
}
