import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {
    public static void main(String args[])
    {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.opencart.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        WebElement login = driver.findElement(By.xpath("//div[@class='navbar-right hidden-xs']//child::a[text()='Login']"));
        login.click();
        driver.quit();
    }
}
