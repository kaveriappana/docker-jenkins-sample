package config.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import java.base.BaseTests;
public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");
Logger logger = Logger.getLogger(LoginPage.class.getName());
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void setUsername(String username){
        logger.info("Entering "+username+" in username field");
        driver.findElement(usernameField).sendKeys(username);
        logger.info("Entered "+username+" in username field");
    }

    public void setPassword(String password){
        logger.info("Entering"+password+"in password field");
        driver.findElement(passwordField).sendKeys(password);
        logger.info("Entered"+password+"in password field");
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }


}
