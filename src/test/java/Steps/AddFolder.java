package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.awt.*;
import java.util.List;

public class AddFolder {

    DialogContent dc = new DialogContent();

    @And("User choose folder from PC")
    public void userChooseFolderFromPC(String text) throws AWTException {

        dc.chooseFolder(text);

        }

}