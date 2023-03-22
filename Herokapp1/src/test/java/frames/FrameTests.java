package frames;
import base.Basetests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import pages.FileUploadPage;
import pages.WysiwygEditorPage;

public class FrameTests extends Basetests{

    @Test

    public void testWysiwyg(){

       WysiwygEditorPage editor= homePage.clickWysiwygEditor();
        editor.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

      editor.setTextArea(text1);
       editor.decreaseIndention();
      editor.setTextArea(text2);

       assertEquals(editor.getTextFromEditor(), text1+text2, "Text from editor is incorrect");
    }

}
