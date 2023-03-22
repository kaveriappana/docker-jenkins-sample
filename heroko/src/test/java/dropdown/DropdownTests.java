package dropdown;

import base.BaseTests;
import config.ConfigProperties;
import org.testng.annotations.Test;
import config.pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        ConfigProperties.readConfigProperties();
        BaseTests.setBrowser();
        BaseTests.setBrowserConfig();
        BaseTests.runTest();
        DropdownPage dropDownPage = homePage.clickDropDown();

        //String option = "Option 1";
        //dropDownPage.selectFromDropDown(option);
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOptions();

        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }

}
