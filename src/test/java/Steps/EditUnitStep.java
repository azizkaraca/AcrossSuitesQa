package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class EditUnitStep {

    DialogContent dc = new DialogContent();

    @And("User refresh the page")
    public void userRefreshThePage() {

        dc.refresh(); // it is for if the page is not appeared first search step (Maximum call stack size exceeded)

    }
}