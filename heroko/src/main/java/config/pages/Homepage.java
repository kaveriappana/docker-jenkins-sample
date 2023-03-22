package config.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Homepage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    //private By keyPressesLink = By.linkText("Key Presses");
    public Homepage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }




    private void clickLink(String linkTest) {
        driver.findElement(By.linkText(linkTest)).click();
    }
        }




