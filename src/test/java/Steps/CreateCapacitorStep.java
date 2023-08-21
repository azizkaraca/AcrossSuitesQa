package Steps;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.UnhandledAlertException;
import java.util.List;

public class CreateCapacitorStep {

    DialogContent dc = new DialogContent();

    @And("User goes to Capacitors")
    public void userGoesToCapacitors(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User accepts alert")
    public void userAcceptsAlert() {
        GWD.getDriver().switchTo().alert().accept();

    }
}
