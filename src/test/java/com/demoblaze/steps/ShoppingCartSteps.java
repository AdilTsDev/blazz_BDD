package com.demoblaze.steps;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.ProductPage;
import com.demoblaze.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.demoblaze.base.Hooks.driver;

public class ShoppingCartSteps {

    // first item added and go to cart verify
    @And("click the first item at homep page")
    public void clickTheFirstItemAtHomepPage() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getFirstItem().click();
        Thread.sleep(2000);
    }

    @And("click add to the cart button at product page")
    public void clickAddToTheCartButtonAtProductPage() throws InterruptedException {
        ProductPage productPage = new ProductPage();
        productPage.getAddToCartButton().click();
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
        HomePage homePage = new HomePage();
        homePage.getCartLink().click();
        Thread.sleep(1000);
    }

    @Then("verify that item is displayed at cart page")
    public void verifyThatItemIsDisplayedAtCartPage() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        Assert.assertTrue(shoppingCartPage.getItemInCart().isDisplayed());

    }


    // delete items
    @And("click delete button for delete")
    public void clickDeleteButtonForDelete() throws InterruptedException {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.getDeleteButton().click();
        Thread.sleep(2000);
    }

    @Then("verify that cart is empty")
    public void verifyThatCartIsEmpty() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        Assert.assertTrue(shoppingCartPage.getTotalAmount().getText().isEmpty());
    }
}
