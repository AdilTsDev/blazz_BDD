package com.demoblaze.pages.modal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class ContactModal {

    @FindBy(id = "recipient-email")
    private WebElement contactEmail;

    @FindBy(id = "recipient-name")
    private WebElement contactName;

    @FindBy(id = "message-text")
    private WebElement messageBox;

    @FindBy(css = "#exampleModal > div > div > div.modal-footer > button.btn.btn-primary")
    private WebElement sendLink;


    public ContactModal(){
        PageFactory.initElements(driver, this);
    }

    public WebElement getContactEmail() {
        return contactEmail;
    }

    public WebElement getContactName() {
        return contactName;
    }

    public WebElement getMessageBox() {
        return messageBox;
    }

    public WebElement getSendLink() {
        return sendLink;
    }

}
