package internet;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Search {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        String title = driver.getTitle();
        System.out.println(title);
        WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
        search.click();
        WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
       ele.sendKeys("Iphone13promax");
        driver.findElement(By.id("nav-search-submit-button")).click();

        String exp ="Iphone13promax";

        List<WebElement> listofItems = driver.findElements(By.xpath("//span[text()='RESULTS']"));

        for (WebElement we:listofItems)
        {
            //for (int i=0; i<=exp.length(); i++){
                if(we.getText().equals(exp)){
                    System.out.println("matched");
                    //System.out.println(exp);
                }
            }
        }

   }


