package internet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
//import utility.ExcelUtils;

public class DataProviderWithExcel_001 {

    WebDriver driver;

    @BeforeMethod

    public void beforeMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

       // driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // driver.get("https://www.store.demoqa.com");

    }

    @Test(dataProvider="Authentication")

    public void Registration_data(String sUserName,String sPassword)throws  Exception{

        WebElement clickon = driver.findElement(By.cssSelector("a[href=\"/login\"]"));
        clickon.click();
        WebElement input = driver.findElement(By.cssSelector("input[id='username']"));
        input.sendKeys(sUserName);
        System.out.println(sUserName);
        WebElement input2 = driver.findElement(By.cssSelector("input[id='password']"));
        input2.sendKeys(sPassword);
        System.out.println(sUserName);
        WebElement input3 = driver.findElement(By.cssSelector("button[class='radius']"));
        input3.click();
        WebElement  text = driver.findElement(By.cssSelector("div[id=\"flash\"]"));
        String s=text.getText();
        Assert.assertTrue(s.contains("You logged into a secure area!"));


    }

    @DataProvider

    public Object[][] Authentication() throws Exception{

        Object[][] testObjArray = DatareadingFromExcel.getTableArray("C:\\Users\\kaveri.appana\\IdeaProjects\\herokapp\\src\\test\\java\\testdata\\automation_data1.xlsx","Sheet1");
        return (testObjArray);



    }

    @AfterMethod

    public void afterMethod() {

        driver.close();

    }


}
