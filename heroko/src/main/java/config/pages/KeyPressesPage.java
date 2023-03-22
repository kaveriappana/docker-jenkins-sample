package config.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");
    Logger logger = Logger.getLogger(LoginPage.class.getName());
    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterText(String text){
        logger.info("entering"+text+"in the input field");
        driver.findElement(inputField).sendKeys(text);
        logger.info("entered"+text+"in the input field");
        System.out.println(text);
    }
    public void backSpace(String text){
        driver.findElement(inputField).sendKeys(text);

    }
    public void enterPi(){
        enterText(Keys.chord(Keys.ALT,"P") + "=3.14");

    }
    public String getResult(){

        return driver.findElement(resultText).getText();
    }
}
