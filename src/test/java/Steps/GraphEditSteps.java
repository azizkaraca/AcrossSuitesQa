package Steps;

import Pages.DialogContent;
import io.cucumber.java.en.And;

public class GraphEditSteps {

    DialogContent dc = new DialogContent();

    @And("User right click to reach edit on graph")
    public void userRightClickToReachEditOnGraph() {
        dc.findAndClick("blankAreaGraph");
        dc.rightClick("blankAreaGraph");
        dc.findAndClick("edit");
    }
}
