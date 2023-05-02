package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _Parent {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);
        waitUntilClickable(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
        waitUntilVisible(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsText(WebElement element, String text)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void verifyElementDisplayed(WebElement element)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.isDisplayed());
    }

    public void verifyCurrentUrl(String Text)
    {
        wait.until(ExpectedConditions.urlContains("http"));
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().toLowerCase().contains(Text.toLowerCase()));

    }

    //methods
    public void waitUntilVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void dragAndDropFunction (WebElement drag, WebElement drop)
    {
        Actions actions = new Actions(GWD.getDriver());
        waitUntilClickable(drag);
        waitUntilVisible(drop);
        actions.dragAndDrop(drag,drop).perform();
    }

    public void ctrlMM()
    {
        Actions actions = new Actions(GWD.getDriver());
        actions.keyDown(Keys.CONTROL).sendKeys("m").sendKeys("m").keyUp(Keys.CONTROL).perform();

    }

    public void mouseActions (WebElement element)
    {
        Actions actions = new Actions(GWD.getDriver());
        scrollToElement(element);
        waitUntilVisible(element);
        waitUntilClickable(element);
        actions.contextClick(element).perform();
    }

}
