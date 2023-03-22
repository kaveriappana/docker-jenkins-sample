package keys;
import base.Basetests;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTests extends Basetests {
    @Test
    public void testBackspace(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
    }
}
