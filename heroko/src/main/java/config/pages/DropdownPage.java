package config.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown= By.id("dropdown");
    Logger logger = Logger.getLogger(LoginPage.class.getName());
    public DropdownPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void selectFromDropDown(String option){
        logger.info("entering"+option+"in select option");
        findDropDownElement().selectByVisibleText(option);
        logger.info("entered"+option+"in the select option field");

    }
    public List<String > getSelectedOptions(){
        List<WebElement> SelectedElements = findDropDownElement().getAllSelectedOptions();
        return SelectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    public Select findDropDownElement(){
        return new  Select(driver.findElement(dropdown));
    }
}
