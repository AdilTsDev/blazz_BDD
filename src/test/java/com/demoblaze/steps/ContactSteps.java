package com.demoblaze.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.demoblaze.base.Hooks.driver;

public class ContactSteps {
    @When("click contact button on the header")
    public void clickContactButtonOnTheHeader() throws InterruptedException {
        WebElement contactLink = driver.findElement(By.cssSelector("#navbarExample > ul > li:nth-child(2) > a"));
        contactLink.click();
        Thread.sleep(2000);

    }

    @And("enter {string} for contact_email")
    public void enterForContact_email(String contact_email) {
        driver.findElement(By.id("recipient-email")).sendKeys(contact_email);

    }

    @And("enter {string} for contact_name")
    public void enterForContact_name(String contact_name) {
        driver.findElement(By.id("recipient-name")).sendKeys(contact_name);
    }

    @And("enter {string} for message_Box")
    public void enterForMessage_Box(String message_box) {
        driver.findElement(By.id("message-text")).sendKeys(message_box);
    }

    @And("click the send Button")
    public void clickTheSendButton() throws InterruptedException {
        driver.findElement(By.cssSelector("#exampleModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
        Thread.sleep(2000);

    }

    @Then("verify that message send successfully")
    public void verifyThatMessageSendSuccessfully() {
        Assert.assertEquals(driver.switchTo().alert().getText(), "Thanks for the message!!");

    }
}
