package dropdown;

import base.Basetests;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.HomePage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends Basetests {
    @Test
    public void testSelectOption(){
        DropdownPage dropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
      List<String> selectedOptions = dropDownPage.getSelectedOptions();

       assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
       assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
