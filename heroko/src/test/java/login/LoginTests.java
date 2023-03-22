package login;
import base.BaseTests;
import config.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import config.pages.LoginPage;
import config.pages.SecureAreaPage;


import static org.testng.Assert.assertTrue;


public class LoginTests extends BaseTests {
    WebDriver driver;
    @Test
    public void testSuccessfulLogin(){
        ConfigProperties.readConfigProperties();
        BaseTests.setBrowser();
        BaseTests.setBrowserConfig();
        BaseTests.runTest();
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
       //driver.findElement(By.id("nav-search-bar-form")).click();
    }
}
