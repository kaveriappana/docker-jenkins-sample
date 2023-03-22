package javascript;
import base.Basetests;
import org.testng.annotations.Test;
public class JavaScriptTests extends Basetests{

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
