package alerts;
import base.BaseTests;
import config.ConfigProperties;
import org.testng.annotations.Test;
import config.pages.FileUploadPage;
import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests{
        @Test
        public void testFileUpload() throws InterruptedException{
            ConfigProperties.readConfigProperties();
            BaseTests.setBrowser();
            BaseTests.setBrowserConfig();
            BaseTests.runTest();

            FileUploadPage uploadPage = homePage.clickFileUpload();
            uploadPage.uploadFile(ConfigProperties.path);
            assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
        }

    }


