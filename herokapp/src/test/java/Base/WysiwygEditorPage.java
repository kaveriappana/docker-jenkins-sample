package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class WysiwygEditorPage {

    WebDriver driver;
    String editorIframeId = "mce_0_ifr";
    By textArea = By.id("tinymce");

    By decreaseIndentButton = By.cssSelector("button[title='Increase indent']");


    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){

        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

    public void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    @Test
    public void Test()
 {
     System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

     driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com");

     String title = driver.getTitle();
     System.out.println(title);

     driver.manage().window().maximize();
     driver.findElement(By.cssSelector("a[href='/tinymce']")).click();
     clearTextArea();

     String text1 = "hello ";
     String text2 = "world";
     setTextArea(text1);
     decreaseIndention();
     setTextArea(text2);
     Assert.assertEquals(getTextFromEditor(), text1+text2, "Text from editor is incorrect");
     driver.quit();
 }
}



