import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginApp {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaveri.appana\\IdeaProjects\\SampleProject\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/login");

    }
}
