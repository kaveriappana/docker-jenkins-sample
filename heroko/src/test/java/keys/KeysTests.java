package keys;

import base.BaseTests;
import config.ConfigProperties;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import config.pages.KeyPressesPage;
import static org.testng.Assert.*;

public class KeysTests extends BaseTests {


    @Test
    public void test(){
        ConfigProperties.readConfigProperties();
        BaseTests.setBrowser();
        BaseTests.setBrowserConfig();
        BaseTests.runTest();

        KeyPressesPage keyPage = homePage.clickKeyPresses();
       keyPage.enterText(ConfigProperties.text);

    }
    @Test
    public void testBackspace(){
        ConfigProperties.readConfigProperties();
        BaseTests.setBrowser();
        BaseTests.setBrowserConfig();
        BaseTests.runTest();

        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.backSpace("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }
    @Test
    public void testEneterPi(){
        ConfigProperties.readConfigProperties();
        BaseTests.setBrowser();
        BaseTests.setBrowserConfig();
        BaseTests.runTest();

        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
    }

}


