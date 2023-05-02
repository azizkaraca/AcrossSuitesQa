package Steps;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class ControlDoubleMstep {

    DialogContent dc =new DialogContent();

    @And("User uses ctrl MM combination to open edit mode")
    public void userUsesCtrlMMCombinationToOpenEditMode() {

        dc.findAndClick("dashboard");
        dc.ctrlMM();
        dc.rightClick("powerRight");
        dc.findAndClick("edit");
        dc.findAndClick("edit2");
        dc.findAndClick("plants");
        dc.findAndClick("plants"); // If I don't click it again I cannot achieve the dropDown menu!
        dc.findAndClick("gavdosIn");
        dc.findAndClick("devicesIn");
        dc.findAndClick("testIn");
        dc.findAndVerify("gavdosTest");
    }
}
