package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



    public class HomePage {
        private WebDriver driver;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public LoginPage clickFormAuthentication() {
            clicklink("Form Authentication");
            //driver.findElement(formAuthenticationLink).click();
            return new LoginPage(driver);
        }
        public DropdownPage clickDropDown(){
            clicklink("Dropdown");
            return new DropdownPage(driver);
        }
        public LargeAndDeepDomPage clickLargeAndDeepDom(){
            clicklink("Large & Deep DOM");
            return new LargeAndDeepDomPage(driver);
        }
        public InfiniteScrollPage clickInfiniteScroll(){
            clicklink("Infinite Scroll");
            return new InfiniteScrollPage(driver);
        }

        public WysiwygEditorPage clickWysiwygEditor(){
            clicklink("WYSIWYG Editor");
            return new WysiwygEditorPage(driver);
        }
        public KeyPressesPage clickKeyPresses(){
            clicklink("Key Presses");
            return new KeyPressesPage(driver);
        }
        public FileUploadPage clickFileUpload(){
            clicklink("File Upload");
            return new FileUploadPage(driver);
        }

        public void clicklink(String linkTest){
            driver.findElement(By.linkText(linkTest)).click();
        }
    }



