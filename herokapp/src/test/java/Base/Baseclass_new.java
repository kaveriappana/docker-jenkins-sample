package Base;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass_new {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        // driver.quit();
    }

    public static void main(String args[]) {

        Baseclass_new amazon = new Baseclass_new();
        amazon.setUp();
    }


}
