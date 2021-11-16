package com.demoblaze.steps;

import com.demoblaze.pages.modal.ContactModal;
import com.demoblaze.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.demoblaze.base.Hooks.driver;

public class ContactSteps {
    @When("click contact button on the header")
    public void clickContactButtonOnTheHeader() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getContactLink().click();
        Thread.sleep(2000);

    }

    @And("enter {string} for contact_email")
    public void enterForContact_email(String contact_email) {
        ContactModal contactModal = new ContactModal();
        contactModal.getContactEmail().sendKeys(contact_email);

    }

    @And("enter {string} for contact_name")
    public void enterForContact_name(String contact_name) {
        ContactModal contactModal = new ContactModal();
        contactModal.getContactName().sendKeys(contact_name);
    }

    @And("enter {string} for message_Box")
    public void enterForMessage_Box(String message_box) {
        ContactModal contactModal = new ContactModal();
        contactModal.getMessageBox().sendKeys(message_box);
    }

    @And("click the send Button")
    public void clickTheSendButton() throws InterruptedException {
        ContactModal contactModal = new ContactModal();
        contactModal.getSendLink().click();
        Thread.sleep(2000);

    }

    @Then("verify that message send successfully")
    public void verifyThatMessageSendSuccessfully() {
        Assert.assertEquals(driver.switchTo().alert().getText(), "Thanks for the message!!");

    }
}
