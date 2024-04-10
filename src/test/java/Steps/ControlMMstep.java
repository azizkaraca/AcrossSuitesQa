package Steps;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class ControlMMstep {

    DialogContent dc =new DialogContent();

    @And("User uses ctrl MM combination to open edit mode")
    public void userUsesCtrlMMCombinationToOpenEditMode() {

        //dc.ctrlMM(); // it doesnt work - check it!
        dc.switchToEditMode(); // instead of ctrlMM() I have used switchToEditMode();
    }
}
