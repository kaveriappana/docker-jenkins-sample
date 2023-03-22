package Base;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class Inputfield {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.cssSelector("a[href='/inputs']")).click();
        driver.findElement(By.cssSelector("input[type='number']")).click();

        driver.quit();

    }
}