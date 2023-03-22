package utiles;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate=driver.navigate();
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }
    public void goTo(String url){
        driver.navigate().to(url);
    }
    public void switchToTab(String tabTitle){
     //String windows ;
      //driver.getWindowHandles();
        System.out.println("Number of tabs: "+ driver.getWindowHandles().size());
        System.out.println("Window handles:");
        driver.getWindowHandles().forEach(System.out::println);
        for(String window : driver.getWindowHandles()){
            driver.switchTo().window(window);

            System.out.println("current window title:"+ driver.getTitle());
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }

    }
}
