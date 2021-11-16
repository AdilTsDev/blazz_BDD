package com.demoblaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class ProductPage {

    @FindBy(css = "#tbodyid > div.row > div > a")
    private WebElement addToCartButton;

    public ProductPage(){
        PageFactory.initElements(driver, this);

    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }
}
