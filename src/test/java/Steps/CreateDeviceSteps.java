package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CreateDeviceSteps {

    DialogContent dc =new DialogContent();
    @And("User chooses an Island")
    public void userChoosesAnIsland(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }

    }

    @And("User chooses a Generator")
    public void userChoosesAGenerator(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }

    }

    @And("User goes to Main Menu")
    public void userGoesToMainMenu(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User goes to Management")
    public void userGoesToManagement(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User goes to InfraStructure")
    public void userGoesToInfraStructure(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User goes to Devices")
    public void userGoesToDevices(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User chooses one of device from table")
    public void userChoosesOneOfDeviceFromTable(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User chooses how many device should be entered")
    public void userChoosesHowManyDeviceShouldBeEntered(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @When("User confirms the chooses")
    public void userConfirmsTheChooses(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @Then("User should to be in Devices Area")
    public void userShouldToBeInDevicesArea(DataTable elements) {

        List<String> listElement=elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.verifyUrl(listElement.get(i));

    }

    @Then("User should to see created device in Devices Area")
    public void userShouldToSeeCreatedDeviceInDevicesArea(DataTable elements) {

        List<List<String>> listElement=elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndVerify(listElement.get(i).get(0),listElement.get(i).get(1));

    }

}
