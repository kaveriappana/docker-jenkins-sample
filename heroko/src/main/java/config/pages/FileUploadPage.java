package config.pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");
    Logger logger = Logger.getLogger(LoginPage.class.getName());
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public void uploadFile(String path){
        logger.info("Entering "+path+"in the uploadfile field");
        driver.findElement(inputField).sendKeys(path);
        logger.info("Entered"+path+"in the upload file field");
        clickUploadButton();
    }
    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }

}
