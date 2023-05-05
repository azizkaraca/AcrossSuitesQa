package Steps;

import Pages.BreadCrumbs;
import Pages.DialogContent;
import Pages._Parent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BreadCrumbsSteps extends _Parent {

    BreadCrumbs bc = new BreadCrumbs();
    DialogContent dc = new DialogContent();

    @And("User selects a Generator")
    public void userSelectsAGenerator(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
    @And("User selects a Breadcrumb")
    public void userSelectsABreadcrumb(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            bc.findAndClick(listElement.get(i));
        }
    }

    @Then("User should to be in Correct Url")
    public void userShouldToBeInCorrectUrl(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            bc.verifyCurrentUrl(listElement.get(i));

    }
}
