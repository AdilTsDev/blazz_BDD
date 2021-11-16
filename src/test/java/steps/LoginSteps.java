package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static steps.Hooks.driver;

public class LoginSteps {


    //background
    @Given("click login link on the header")
    public void click_login_link_on_the_header() throws InterruptedException {
        WebElement loginLink = driver.findElement(By.id("login2"));
        loginLink.click();
        Thread.sleep(1000);
    }

    //enter username and password and click the login
    @And("enter {string} for username")
    public void enterForUsername(String username) {
        driver.findElement(By.id("loginusername")).sendKeys(username);

    }
    @And("enter {string} for password")
    public void enterForPassword(String password) {
        driver.findElement(By.id("loginpassword")).sendKeys(password);
    }

    @And("click the login button")
    public void clickTheLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
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
