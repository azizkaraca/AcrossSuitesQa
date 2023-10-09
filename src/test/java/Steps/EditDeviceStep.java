package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class EditDeviceStep {

    DialogContent dc = new DialogContent();

    @And("User switch to edit mode")
    public void userSwitchToEditMode() {
        dc.switchToEditMode();
    }

    @And("User edits the some data")
    public void userEditsTheSomeData(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

}