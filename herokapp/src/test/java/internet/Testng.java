package internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Testng {
    WebDriver driver;
    @Test(priority = 1)

    public void b_testCase1() {
        System.out.println("This is the A Normal Test Case");
    }
    @Test(priority = 1)

    public void a_testCase3() {

        WebElement clickon = driver.findElement(By.cssSelector("a[href=\"/login\"]"));
        clickon.click();
        WebElement input = driver.findElement(By.cssSelector("input[id='username']"));
        input.sendKeys("tomsmith");
        WebElement input2 = driver.findElement(By.cssSelector("input[id='password']"));
        input2.sendKeys("SuperSecretPassword!");
        WebElement input3 = driver.findElement(By.cssSelector("button[class='radius']"));
        input3.click();
        WebElement  text = driver.findElement(By.cssSelector("div[id=\"flash\"]"));
        String s=text.getText();
        Assert.assertTrue(s.contains("You logged into a secure area!"));
    }

    public void testCase2() {
        System.out.println("This is the A Normal Test Case2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite");
    }


}
