package config.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
    WebDriver driver;

    //By startButton = By.cssSelector("div[id='start'] button");
    //By startButton = By.xpath("//button[text()='Start']");
    By startButton = By.cssSelector("#start button");
    By loadingIndicator = By.id("loading");
    By loadedText = By.id("finish");

public DynamicLoadingPage(WebDriver driver){
    this.driver=driver;
}
    public void clickStart() {
       // driver.findElement(startButton).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }
    public void clickExample1(){
    driver.findElement(By.cssSelector("a[href='/dynamic_loading/1']")).click();
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }

}
