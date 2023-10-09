package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuLoaded {

    DialogContent dc = new DialogContent();

    @And("User should wait until url loaded")
    public void userShouldWaitUntilUrlLoaded(String element) {
        dc.waitUntilUrlContains(element);
    }
}
