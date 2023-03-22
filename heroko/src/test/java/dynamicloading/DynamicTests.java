package dynamicloading;

import base.BaseTests;
import config.ConfigProperties;
import config.pages.DynamicLoadingPage;
import config.pages.HoversPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicTests extends BaseTests {
    WebDriver driver;
    @Test
    public void Tests() {
        ConfigProperties.readConfigProperties();
        BaseTests.setBrowser();
        BaseTests.setBrowserConfig();
        BaseTests.runTest();

        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        driver.findElement(By.cssSelector("a[href='/dynamic_loading']")).click();

        driver.findElement(By.cssSelector("a[href='/dynamic_loading/1']")).click();
        dynamicLoadingPage.clickStart();
        Assert.assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
