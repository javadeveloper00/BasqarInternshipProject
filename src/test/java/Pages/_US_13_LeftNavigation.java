package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_13_LeftNavigation extends _US_00_Parent {
    WebElement myElement;

    public _US_13_LeftNavigation() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;
    @FindBy(xpath = "//span[text()='Notifications']")
    private WebElement notifications;

    @FindBy(linkText = "Parameters")
    private WebElement parametersButton;

    @FindBy(linkText = "Document Types")
    private WebElement documentsTypesButton;

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {

            case "humanResources":
                myElement = humanResources;
                break;

            case "notifications":
                myElement = notifications;
                break;

            case "documentsTypesButton":
                myElement = documentsTypesButton;
                break;

        }
        clickFunction(myElement);
    }


}