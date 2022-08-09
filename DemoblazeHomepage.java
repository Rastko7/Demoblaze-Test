package page.Demoblaze;

import base.Demoblaze.com.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DemoblazeHomepage extends BaseTest {

    public DemoblazeHomepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Contact")
    WebElement contactButton;
    @FindBy(id = "recipient-email")
    WebElement contactEmailInputField;
    @FindBy(id = "recipient-name")
    WebElement contactNameInputField;
    @FindBy(id = "message-text")
    WebElement messageInputField;
    @FindBy(xpath = "//button[contains(text(),\"Send message\")]")
    WebElement sendMessageButton;


    public DemoblazeHomepage contactButtonClick() {
        wdWait.until(ExpectedConditions.elementToBeClickable(contactButton));
        contactButton.click();
        return this;
    }
    public DemoblazeHomepage contactEmailInputFieldSendKeys(String email){
        wdWait.until(ExpectedConditions.visibilityOf(contactEmailInputField));
        contactEmailInputField.clear();
        contactEmailInputField.sendKeys(email);
        return this;
    }
    public DemoblazeHomepage contactNameInputFieldSendKeys(String name){
        wdWait.until(ExpectedConditions.visibilityOf(contactNameInputField));
        contactNameInputField.clear();
        contactNameInputField.sendKeys(name);
        return this;
    }
    public DemoblazeHomepage messageInputFieldSendKeys(String message){
        wdWait.until(ExpectedConditions.visibilityOf(messageInputField));
        messageInputField.clear();
        messageInputField.sendKeys(message);
        return this;
    }
    public DemoblazeHomepage sendMessageButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(sendMessageButton));
        sendMessageButton.click();
        return this;
    }

}

