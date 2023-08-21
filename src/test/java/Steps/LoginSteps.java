package Steps;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    DialogContent dc =new DialogContent();

    @Given("Navigate to Web Page {string}")
    public void navigateToWebPage(String url)
    {
        GWD.getDriver().get(url);
        //GWD.getDriver().get("http://10.10.10.79:31193/signin");
        //GWD.getDriver().get("http://192.168.200.160:30003/signin");

    }

    @When("User Enters Email {string} and Password {string} and Click Button")
    public void userEntersEmailAndPasswordAndClickButton(String email, String password)
    {
        dc.findAndSend("email",email);
        dc.findAndSend("password",password);
        dc.findAndClick("loginButton");
        // here navigate back method can be added and check if it is navigating back or not.
        // It should not navigate back as expected and stand in logged page !!!

    }

    @Then("User Should Login Successfully")
    public void userShouldLoginSuccessfully()
    {
        dc.verifyCurrentUrl("dashboard");
    }

}
