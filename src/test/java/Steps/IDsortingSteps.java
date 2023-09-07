package Steps;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.*;

public class IDsortingSteps {

    DialogContent dc = new DialogContent();

    @And("User check if the ID sorting working correct")
    public void userCheckIfTheIdSortingWorkingCorrect() {

        List <WebElement> elementList = dc.waitVisibleListAllElement(dc.idList);
        List<String> normalList = new ArrayList<>();
        List<String> sortedList = new ArrayList<>();

        for (WebElement element : elementList) {
            normalList.add(element.getText());
        }
        System.out.println(normalList);

        for (int i = 0; i < normalList.size(); i++) {
            sortedList.add(normalList.get(i));
        }

        Collections.sort(sortedList,Collections.reverseOrder());
        //Collections.reverse(sortedList);
        System.out.println(sortedList);

        Assert.assertEquals(normalList,sortedList);
    }


}
