package navigation;

import base.BaseTests;
import config.ConfigProperties;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests{
    @Test
    public void testNavigator(){
        ConfigProperties.readConfigProperties();
        BaseTests.setBrowser();
        BaseTests.setBrowserConfig();
        BaseTests.runTest();
        //homePage.clickDynamicLoading().clickStart();
        //homePage.clickDynamicLoading().getLoadedText();
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");

    }
    @Test
    public void testSwitchTab(){
        ConfigProperties.readConfigProperties();
        BaseTests.setBrowser();
        BaseTests.setBrowserConfig();
        BaseTests.runTest();
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}



