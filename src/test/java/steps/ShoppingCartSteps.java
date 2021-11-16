package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import static steps.Hooks.driver;

public class ShoppingCartSteps {

    // first item added and go to cart verify
    @And("click the first item at homep page")
    public void clickTheFirstItemAtHomepPage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/a/img")).click();
        Thread.sleep(2000);
    }

    @And("click add to the cart button at product page")
    public void clickAddToTheCartButtonAtProductPage() throws InterruptedException {
        driver.findElement(By.cssSelector("#tbodyid > div.row > div > a")).click();
        Thread.sleep(2000);
    }

    @And("verify that system says Product added")
    public void verifyThatSystemSaysProductAdded() {
        Assert.assertEquals(driver.switchTo().alert().getText(), "Product added");

    }

    @And("click the cart button")
    public void clickTheCartButton() throws InterruptedException {
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(1000);
    }

    @Then("verify that item is displayed at cart page")
    public void verifyThatItemIsDisplayedAtCartPage() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[1]/img")).isDisplayed());

    }
}
