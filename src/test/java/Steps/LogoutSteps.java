package Steps;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LogoutSteps {

    DialogContent dc = new DialogContent();

    @And("Change language to English")
    public void changeLanguageToEnglish() {
        dc.findAndClick("languageButton");
        dc.findAndClick("english");
            }

    @And("Go to MyAccount")
    public void goToMyAccount()
    {
        dc.findAndClick("burgerMenu");
        dc.findAndClick("downArrow");

    }

    @And("Click Logout Button")
    public void clickLogoutButton()
    {
        dc.findAndClick("logout");

    }

    @Then("User Should Logout Successfully")
    public void userShouldLogoutSuccessfully()
    {
        dc.verifyCurrentUrl("signin");

    }

}
