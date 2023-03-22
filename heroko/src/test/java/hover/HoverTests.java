package hover;

import base.BaseTests;
import config.ConfigProperties;
import org.testng.annotations.Test;
import config.pages.HoversPage;
import static org.testng.Assert.*;



public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        ConfigProperties.readConfigProperties();
        BaseTests.setBrowser();
        BaseTests.setBrowserConfig();
        BaseTests.runTest();

        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
