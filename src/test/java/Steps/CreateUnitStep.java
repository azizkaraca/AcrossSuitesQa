package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;


import java.util.List;

public class CreateUnitStep {

    DialogContent dc = new DialogContent();

    @And("User goes to Units")
    public void userGoesToUnits(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
                     dc.findAndClick(listElement.get(i));
        }
    }
}