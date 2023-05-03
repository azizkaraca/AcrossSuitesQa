package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends _Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[type='email']")
    private WebElement email;

    @FindBy(css = "[type='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    @FindBy(css = "[alt='DEH-logo']")
    private WebElement assertLogo;

    @FindBy(xpath = "//div[contains(text(),'invalid')]")
    private WebElement invalid;

    @FindBy(css = "[aria-controls='language-switcher']")
    private WebElement languageButton;

    @FindBy(xpath = "//h4[text()='English']")
    private WebElement english;

    @FindBy(css = "[data-testid='MenuIcon']")
    private WebElement burgerMenu;

    @FindBy(css = "[data-testid='ExpandMoreIcon']")
    private WebElement downArrow;

    @FindBy(xpath = "//div[(text()='Logout')]")
    private WebElement logout;

    @FindBy(xpath = "//div[text()='My Account']")
    private WebElement myAccount;

    @FindBy(xpath = "//label[text()='First Name']/following-sibling::div//input")
    private WebElement firstName;

    @FindBy(css = "[title='GAVDOS']")
    private WebElement gavdos;

    @FindBy(xpath = "//p[contains(text(),'GEN 1')]")
    private WebElement gen1;

    @FindBy(xpath = "//span[text()='MANAGEMENT']")
    private WebElement management;

    @FindBy(xpath = "//span[text()='INFRASTRUCTURE']")
    private WebElement infrastructure;

    @FindBy(xpath = "//span[text()='DEVICES']")
    private WebElement devices;

    @FindBy(xpath = "//div[text()='TEST']")
    private WebElement devicesTest;

    @FindBy(xpath = "//p[contains(text(),'POWER')]")
    private WebElement powerRight;

    @FindBy(xpath = "//p[text()='DASHBOARD']")
    private WebElement dashboard;

    @FindBy(css = "[data-testid='EditIcon']")
    private WebElement edit;

    @FindBy (xpath = "//label[text()='Register']/following-sibling::div//button")
    private WebElement edit2;

    @FindBy(xpath = "//h6[text()='Plants']")
    private WebElement plants;

    @FindBy(xpath = "//h6[text()='GAVDOS']")
    private WebElement gavdosIn;

    @FindBy(xpath = "//h6[text()='Devices']")
    private WebElement devicesIn;

    @FindBy(xpath = "//h6[text()='TEST']")
    private WebElement testIn;

    @FindBy(xpath = "//h5[text()='GAVDOS/TEST']")
    private WebElement gavdosTest;

    @FindBy(xpath = "//button[contains(text(),'Add')]")
    private WebElement addButton;

    @FindBy(xpath = "//div[text()='Solar Panel']")
    private WebElement solarPanel;

    @FindBy(xpath = "//button[text()='Confirm']")
    private WebElement confirm;

    @FindBy(xpath = "//button[text()='Yes']")
    private WebElement yes;

    @FindBy(xpath = "//button[text()='No']")
    private WebElement no;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "email": myElement = email;break;
            case "password": myElement = password;break;
            case "firstName": myElement = firstName;break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "loginButton": myElement = loginButton;break;
            case "languageButton": myElement = languageButton;break;
            case "english": myElement = english;break;
            case "burgerMenu": myElement = burgerMenu;break;
            case "downArrow": myElement = downArrow;break;
            case "logout": myElement = logout;break;
            case "myAccount": myElement = myAccount;break;
            case "gavdos": myElement = gavdos;break;
            case "gen1": myElement = gen1;break;
            case "management": myElement = management;break;
            case "infrastructure": myElement = infrastructure;break;
            case "devices": myElement = devices;break;
            case "dashboard": myElement = dashboard;break;
            case "edit": myElement = edit;break;
            case "edit2": myElement = edit2;break;
            case "plants": myElement = plants;break;
            case "gavdosIn": myElement = gavdosIn;break;
            case "devicesIn": myElement = devicesIn;break;
            case "testIn": myElement = testIn;break;
            case "addButton": myElement = addButton;break;
            case "solarPanel": myElement = solarPanel;break;
            case "confirm": myElement = confirm;break;
            case "yes": myElement = yes;break;
            case "no": myElement = no;break;
        }
        clickFunction(myElement);
    }

    public void findAndVerify(String strElement) {
        switch (strElement) {
            case "assertLogo": myElement = assertLogo;break;
            case "loginButton": myElement = loginButton;break;
            case "gavdosTest": myElement = gavdosTest;break;
        }
        verifyElementDisplayed(myElement);
    }

    public void findAndVerify(String strElement, String text) {
        switch (strElement) {
            case "devicesTest": myElement = devicesTest;break;
            case "solarPanel": myElement = solarPanel;break;
        }
        verifyContainsText(myElement, text);
    }

    public void rightClick(String strElement) {
        switch (strElement) {
            case "powerRight": myElement = powerRight;break;
        }
        mouseActions(myElement);
    }
}
