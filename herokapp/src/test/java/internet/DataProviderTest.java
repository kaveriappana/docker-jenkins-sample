package internet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderTest {
    WebDriver driver;
    @Test(dataProvider ="Authentication" )
    public void chromeTest(String username ,String password)
    {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement clickon = driver.findElement(By.cssSelector("a[href=\"/login\"]"));
        clickon.click();
        WebElement input = driver.findElement(By.cssSelector("input[id='username']"));
        input.sendKeys(username);
        WebElement input2 = driver.findElement(By.cssSelector("input[id='password']"));
        input2.sendKeys(password);
        WebElement input3 = driver.findElement(By.cssSelector("button[class='radius']"));
        input3.click();
        WebElement  text = driver.findElement(By.cssSelector("div[id=\"flash\"]"));
        String s=text.getText();
        Assert.assertTrue(s.contains("You logged into a secure area!"));
        driver.quit();
    }

    @DataProvider
    public Object[][] Authentication() throws Exception{

        Object[][] testObjArray = DatareadingFromExcel.getTableArray("C:\\Users\\kaveri.appana\\IdeaProjects\\herokapp\\src\\test\\java\\testdata\\automation_data1.xlsx","Sheet1");
        return (testObjArray);
    }


}
