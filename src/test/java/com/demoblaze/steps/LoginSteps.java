
package com.demoblaze.steps;


import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.modal.LoginModal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.demoblaze.base.Hooks.driver;

public class LoginSteps {


    //background
    @Given("click login link on the header")
    public void click_login_link_on_the_header() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getLoginLink().click();
        Thread.sleep(1000);
    }

    //enter username and password and click the login
    @And("enter {string} for username")
    public void enterForUsername(String username) {
        LoginModal loginModal = new LoginModal();
        loginModal.getLoginUsername().sendKeys(username);

    }
    @And("enter {string} for password")
    public void enterForPassword(String password) {
        LoginModal loginModal = new LoginModal();
        loginModal.getLoginPassword().sendKeys(password);
    }

    @And("click the login button")
    public void clickTheLoginButton() {
        LoginModal loginModal = new LoginModal();
        loginModal.getLoginButton().click();;
    }

    //verify
    @Then("verify that use is login successfully")
    public void verify_that_use_is_login_successfully() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.id("nameofuser")).isDisplayed());

    }


    //With Invalid Account
    @Then("verify that user is not login")
    public void verify_That_User_Is_Not_Login() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.switchTo().alert().getText(), "User does not exist.");
    }

    //With invalid password
    @Then("verify that user entered wrong password")
    public void verify_That_User_Entered_Wrong_Password() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.switchTo().alert().getText(), "Wrong password.");
    }

}
