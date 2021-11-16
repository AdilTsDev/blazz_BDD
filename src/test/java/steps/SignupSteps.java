package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import static steps.Hooks.driver;

public class SignupSteps {


    @And("click signup link on the header")
    public void clickSignupLinkOnTheHeader() throws InterruptedException {
        WebElement signupLink = driver.findElement(By.id("signin2"));
        signupLink.click();
        Thread.sleep(1000);
    }

    //enter username and password
    @And("enter {string} for signup_username")
    public void enterForSignup_username(String username) {
        driver.findElement(By.id("sign-username")).sendKeys(username);
    }

    @And("enter {string} for signup_password")
    public void enterForSignup_password(String password) {
        driver.findElement(By.id("sign-password")).sendKeys(password);
    }

    //click sign up after input
    @And("click the SignUp Button")
    public void clickTheSignUpButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
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

