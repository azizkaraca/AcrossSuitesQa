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
    }
    @Given("Navigate to QA Environment")
    public void navigateToQAEnvironment() {
        GWD.getDriver().get("http://10.10.10.79:30003/signin");
    }
    @Given("Navigate to DEV Environment")
    public void navigateToDEVEnvironment() {
        GWD.getDriver().get("http://10.10.10.91:3000/signin");
    }
    @Given("Navigate to PROD Environment")
    public void navigateToPRODEnvironment() {
        GWD.getDriver().get("http://192.168.200.160:30003/signin");
    }

    @When("User Enters Email {string} and Password {string} and Click Button")
    public void userEntersEmailAndPasswordAndClickButton(String email, String password)
    {
        dc.pageSizeZoomOut();
        dc.findAndSend("email",email);
        dc.findAndSend("password",password);
        dc.findAndClick("loginButton");

    }
    @When("Login with PPC user credentials")
    public void loginWithPPCUserCredentials() {
        dc.pageSizeZoomOut();
        dc.findAndSend("email","ppc@maseurope.com");
        dc.findAndSend("password","Ppc123456!");
        dc.findAndClick("loginButton");
    }
    @When("Login with MAS user credentials")
    public void loginWithMASUserCredentials() {
        dc.pageSizeZoomOut();
        dc.findAndSend("email","mas@maseurope.com");
        dc.findAndSend("password","ma$_@8miN%");
        dc.findAndClick("loginButton");
    }

    @Then("Login should be successfully")
    public void loginShouldBeSuccessfully()
    {
        dc.verifyCurrentUrl("dashboard");
    }



}
