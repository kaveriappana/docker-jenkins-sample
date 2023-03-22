package Base;
import config.PropertiesFile;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 public class Baseclass_java {
     private WebDriver driver;
        public void setUp(){
            System.setProperty("webdriver.chrome.driver",PropertiesFile.path);
            driver = new ChromeDriver();
            System.setProperty("app",PropertiesFile.url);
            System.out.println(driver.getTitle());
           driver.quit();
        }
        public static void main(String args[]){

            //Baseclass_java amazon = new Baseclass_java();
            //.setUp();
        }


    }

