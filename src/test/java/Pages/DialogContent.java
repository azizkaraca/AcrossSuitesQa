package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(xpath = "(//label[text()='Name']/following-sibling::div//input)[2]")
    private WebElement name;
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
    @FindBy(xpath = "//span[text()='Devices']")
    private WebElement devicesMas;
    @FindBy(xpath = "//span[text()='Units']")
    private WebElement unitMas;
    @FindBy(xpath = "//div[text()='TEST']")
    private WebElement devicesTest;
    @FindBy(xpath = "//p[text()='devices']")
    private WebElement devicesT;
    @FindBy(xpath = "(//*[text()='Message']/following-sibling::div//textarea)")
    private WebElement message;
    @FindBy(id = "item_ejv2svq3e3wft3dtu9")
    private WebElement blankArea;
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
    @FindBy(css = "[data-testid='AddIcon']")
    private WebElement addIcon;
    @FindBy(xpath = "//div[text()='Solar Panel']")
    private WebElement solarPanel;
    @FindBy(xpath = "//button[text()='Confirm']")
    private WebElement confirm;
    @FindBy(xpath = "//button[text()='Yes']")
    private WebElement yes;
    @FindBy(xpath = "//button[text()='No']")
    private WebElement no;
    @FindBy(xpath = "//span[text()='Asset Library']")
    private WebElement assetsLibrary;
    @FindBy(xpath = "//label[text()='Model']/following-sibling::div//input")
    private WebElement model;
    @FindBy(xpath = "//label[text()='Website']/following-sibling::div//input")
    private WebElement webSite;
    @FindBy(xpath = "//label[text()='Description']/following-sibling::div//textarea")
    private WebElement description;
    @FindBy(xpath = "(//label[text()='Manufacturer']/following::div)[1]")
    private WebElement manufacturer;
    @FindBy(xpath = "//span[text()='MAS']")
    private WebElement mas;
    @FindBy(xpath = "(//label[text()='Protocol']/following::div)[1]")
    private WebElement protocol;
    @FindBy(xpath = "//span[contains(text(),'Modbus')]")
    private WebElement modbus;
    @FindBy(xpath = "//h6[text()='Engine']")
    private WebElement engine;
    @FindBy(xpath = "//p[text()='Heat Engine']")
    private WebElement heatEngine;
    @FindBy(xpath = "(//label[text()='Country Origin']/following::input)[1]")
    private WebElement country;
    @FindBy(xpath = "//*[text()='Ukraine']")
    private WebElement ukraine;
    @FindBy(xpath = "(//label[text()='Year']/following::input)[1]")
    private WebElement year;
    @FindBy(xpath = "//*[text()='2023']")
    private WebElement y2023;
    @FindBy(xpath = "//button[text()='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//label[contains(text(),'Search')]/following-sibling::div//input")
    private WebElement search;
    @FindBy(xpath = "//div[text()='TestDEVICE']")
    private WebElement TestDEVICE;
    @FindBy(css = "[data-testid='DeleteIcon']")
    private WebElement delete;
    @FindBy(xpath = "(//*[@data-testid='DeleteIcon'])[2]")
    private WebElement delete2;
    @FindBy(xpath = "(//*[@data-testid='DeleteIcon'])[3]")
    private WebElement delete3;
    @FindBy(xpath = "//span[text()='Assets']")
    private WebElement assetsMas;
    @FindBy(css = "[data-testid='ArrowForwardIcon']")
    private WebElement arrowButton;
    @FindBy(id="edit-display-name")
    private WebElement displayName;
    @FindBy(id="edit-register-name")
    private WebElement registerName;
    @FindBy(id="edit-register-address")
    private WebElement registerAddress;
    @FindBy(id="edit-register-scanRate")
    private WebElement scanRate;
    @FindBy(xpath = "(//p[text()='Alarms'])[2]")
    private WebElement alarms;
    @FindBy(xpath = "//label[text()='Type']/following-sibling::div")
    private WebElement type;
    @FindBy(xpath = "//li[text()='Digital']")
    private WebElement digital;
    @FindBy(xpath = "//label[text()='Category']/following-sibling::div")
    private WebElement categoryA;
    @FindBy(xpath = "//span[text()='Category 1']/parent::li")
    private WebElement category1;
    @FindBy(xpath = "//label[text()='Focus Register']/following-sibling::div//button")
    private WebElement focusRegister;
    @FindBy(xpath = "//h6[text()='Across Library']")
    private WebElement acrossLibrary;
    @FindBy(xpath = "//h6[text()='TestDEVICE']")
    private WebElement TestDEVICEin;
    @FindBy(xpath = "//h6[text()='TestNameDisplayEdit']")
    private WebElement TestNameDevice;
    @FindBy(xpath = "//label[text()='Register']/following-sibling::div//button")
    private WebElement registerEdit;
    @FindBy(xpath = "//label[text()='Severity']/following-sibling::div")
    private WebElement severity;
    @FindBy(xpath = "//*[contains(text(),'Success')]")
    private WebElement success;
    @FindBy(xpath = "//*[text()='Alarm']")
    private WebElement alarmA;
    @FindBy(xpath = "//label[contains(text(),'Connections')]/following-sibling::div//input")
    private WebElement connections;
    @FindBy(xpath = "//a[contains(@href,'unit')]")
    private WebElement units;

//    @FindBy(xpath = "//div[contains(@class,'MuiDataGrid-row')]/div[2]")
//    private WebElement nameContains;

        @FindBy(xpath = "//div[@data-field='name']")
    private List<WebElement> nameList;

    @FindBy(xpath = "(//div[@data-field='name'])[2]")
    private WebElement nameContains;
    @FindBy(xpath = "//span[text()='Drop Image']")
    private WebElement dropImage;
    @FindBy (xpath = "//label[text()='Nominal Power']/following-sibling::div//input")
    private WebElement nominalPowerNum;
    @FindBy (xpath = "//label[text()='Nominal Power']/following-sibling::div//div")
    private WebElement nominalPowerArr;
    @FindBy (xpath = "//li[text()='Kilowatt (kW)']")
    private WebElement powerKW;
    @FindBy (xpath = "//label[text()='Potential Power']/following-sibling::div//input")
    private WebElement potentialPowerNum;
    @FindBy (xpath = "//label[text()='Potential Power']/following-sibling::div//div")
    private WebElement potentialPowerArr;
    @FindBy (xpath = "//label[text()='Tech Minimum']/following-sibling::div//input")
    private WebElement techMinimumNum;
    @FindBy (xpath = "//label[text()='Tech Minimum']/following-sibling::div//div")
    private WebElement techMinimumNArr;
    @FindBy (xpath = "//label[text()='Variable Running Costs']/following-sibling::div//input")
    private WebElement variableCostNum;
    @FindBy (xpath = "//label[text()='Variable Running Costs']/following-sibling::div//div")
    private WebElement variableCostArr;
    @FindBy (xpath = "//li[text()='Kilowatt-hour (kWh)']")
    private WebElement costKWh;
    @FindBy(xpath = "//a[contains(@href,'assets')]")
    private WebElement assets;
    @FindBy(css = "[data-testid='DesktopWindowsIcon']")
    private WebElement screenIcon;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "email": myElement = email;break;
            case "password": myElement = password;break;
            case "firstName": myElement = firstName;break;
            case "name": myElement = name;break;
            case "model": myElement = model;break;
            case "webSite": myElement = webSite;break;
            case "description": myElement = description;break;
            case "search": myElement = search;break;
            case "displayName": myElement = displayName;break;
            case "registerName": myElement = registerName;break;
            case "registerAddress": myElement = registerAddress;break;
            case "scanRate": myElement = scanRate;break;
            case "message": myElement = message;break;
            case "connections": myElement = connections;break;
            case "nominalPowerNum": myElement = nominalPowerNum;break;
            case "potentialPowerNum": myElement = potentialPowerNum;break;
            case "techMinimumNum": myElement = techMinimumNum;break;
            case "variableCostNum": myElement = variableCostNum;break;
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
            case "devicesMas": myElement = devicesMas;break;
            case "dashboard": myElement = dashboard;break;
            case "edit": myElement = edit;break;
            case "category": myElement = edit;break;
            case "edit2": myElement = edit2;break;
            case "plants": myElement = plants;break;
            case "gavdosIn": myElement = gavdosIn;break;
            case "devicesIn": myElement = devicesIn;break;
            case "testIn": myElement = testIn;break;
            case "addButton": myElement = addButton;break;
            case "addIcon": myElement = addIcon;break;
            case "solarPanel": myElement = solarPanel;break;
            case "confirm": myElement = confirm;break;
            case "yes": myElement = yes;break;
            case "no": myElement = no;break;
            case "assetsLibrary": myElement = assetsLibrary;break;
            case "manufacturer": myElement = manufacturer;break;
            case "mas": myElement = mas;break;
            case "protocol": myElement = protocol;break;
            case "modbus": myElement = modbus;break;
            case "engine": myElement = engine;break;
            case "heatEngine": myElement = heatEngine;break;
            case "country": myElement = country;break;
            case "ukraine": myElement = ukraine;break;
            case "year": myElement = year;break;
            case "2023": myElement = y2023;break;
            case "save": myElement = saveButton;break;
            case "devicesT": myElement = devicesT;break;
            case "assetsMas": myElement = assetsMas;break;
            case "arrowButton": myElement = arrowButton;break;
            case "blankArea": myElement = blankArea;break;
            case "alarms": myElement = alarms;break;
            case "type": myElement = type;break;
            case "digital": myElement = digital;break;
            case "categoryA": myElement = categoryA;break;
            case "category1": myElement = category1;break;
            case "focusRegister": myElement = focusRegister;break;
            case "acrossLibrary": myElement = acrossLibrary;break;
            case "TestDEVICEin": myElement = TestDEVICEin;break;
            case "TestNameDevice": myElement = TestNameDevice;break;
            case "delete2": myElement = delete2;break;
            case "delete3": myElement = delete3;break;
            case "registerEdit": myElement = registerEdit;break;
            case "severity": myElement = severity;break;
            case "alarmA": myElement = alarmA;break;
            case "unitMas": myElement = unitMas;break;
            case "units": myElement = units;break;
            case "dropImage": myElement = dropImage;break;
            case "nominalPowerArr": myElement = nominalPowerArr;break;
            case "powerKW": myElement = powerKW;break;
            case "potentialPowerArr": myElement = potentialPowerArr;break;
            case "techMinimumNArr": myElement = techMinimumNArr;break;
            case "variableCostArr": myElement = variableCostArr;break;
            case "costKWh": myElement = costKWh;break;
            case "assets": myElement = assets;break;
            case "screenIcon": myElement = screenIcon;break;
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
            case "TestDEVICE": myElement = TestDEVICE;break;
            case "success": myElement = success;break;
            case "nameContains": myElement = nameContains;break;

        }
        verifyContainsText(myElement, text);
    }

    public void rightClick(String strElement) {
        switch (strElement) {
            case "blankArea": myElement = blankArea;break;
        }
        mouseActions(myElement);
    }

    public void deleteItem(){
        clickFunction(delete);
    }

    public void verifyNotDisplayed(String strElement, String value) {
        switch (strElement) {
            case "nameContains": myElement = nameContains;break;
        }
        verifyElementNotDisplayed(myElement,value);
    }


}
