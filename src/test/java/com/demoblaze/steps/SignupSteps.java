package com.demoblaze.steps;


import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.modal.SignUpModal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;


import static com.demoblaze.base.Hooks.driver;

public class SignupSteps {


    @And("click signup link on the header")
    public void clickSignupLinkOnTheHeader() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getSignupLink().click();
        Thread.sleep(1000);
    }

    //enter username and password
    @And("enter {string} for signup_username")
    public void enterForSignup_username(String username) {
        SignUpModal signUpModal = new SignUpModal();
        signUpModal.getSignUpName().sendKeys(username);
    }

    @And("enter {string} for signup_password")
    public void enterForSignup_password(String password) {
        SignUpModal signUpModal = new SignUpModal();
        signUpModal.getSignUpPassword().sendKeys(password);
    }

    //click sign up after input
    @And("click the SignUp Button")
    public void clickTheSignUpButton() throws InterruptedException {
        SignUpModal signUpModal = new SignUpModal();
        signUpModal.getSubmitButton().click();
        Thread.sleep(1000);

    }

    //new account verify
    @Then("verify that use is signUp successfully")
    public void verifyThatUseIsSignUpSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.switchTo().alert().getText(), "Sign up successful.");
    }


    //exciting account verify
    @Then("verify that alert with message")
    public void verifyThatAlertWithMessage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.switchTo().alert().getText(), "This user already exist.");
    }



}

