package Steps;

import Pages.BreadCrumbs;
import Pages.DialogContent;
import io.cucumber.java.en.And;

public class EditDeviceStep {

    DialogContent dc = new DialogContent();
    BreadCrumbs bc=new BreadCrumbs();

    @And("User switch to edit mode")
    public void userSwitchToEditMode() {
        dc.switchToEditMode();
    }


}