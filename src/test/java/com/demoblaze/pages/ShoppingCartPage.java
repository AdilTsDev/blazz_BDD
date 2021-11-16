package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class ShoppingCartPage {

    @FindBy(id = "totalp")
    private WebElement totalAmount;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[4]/a")
    private WebElement deleteButton;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[1]/img")
    private WebElement itemInCart;


    public ShoppingCartPage(){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTotalAmount() {
        return totalAmount;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getItemInCart() {
        return itemInCart;
    }
}
