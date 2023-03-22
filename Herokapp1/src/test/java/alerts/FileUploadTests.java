package alerts;

import base.Basetests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends Basetests{
    @Test
    public void testFileUpload() throws InterruptedException{

        FileUploadPage uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\kaveri.appana\\IdeaProjects\\Herokapp1\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }

}
