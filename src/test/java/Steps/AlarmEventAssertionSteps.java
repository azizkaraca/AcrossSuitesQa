package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;


public class AlarmEventAssertionSteps {

    DialogContent dc =new DialogContent();

    @Then("User verify the necessary element is displayed")
    public void userVerifyTheNecessaryElementDisplayed(DataTable element) {
        List<String> listElement = element.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndVerify(listElement.get(i));

    }
}
