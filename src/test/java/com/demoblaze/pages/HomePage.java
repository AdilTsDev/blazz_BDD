package com.demoblaze.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class HomePage {


    @FindBy(css = "#navbarExample > ul > li:nth-child(2) > a")
    private WebElement contactLink;

    @FindBy(id = "login2")
    private WebElement loginLink;

    @FindBy(id = "cartur")
    private WebElement cartLink;

    @FindBy(id = "signin2")
    private WebElement signupLink;

    @FindBy(xpath = "//*[@id='tbodyid']/div[1]/div/a/img")
    private WebElement firstItem;

    public HomePage(){
        PageFactory.initElements(driver, this);

    }

    public WebElement getContactLink() {
        return contactLink;
    }

    public WebElement getLoginLink() {
        return loginLink;
    }

    public WebElement getCartLink() {
        return cartLink;
    }

    public WebElement getSignupLink() {
        return signupLink;
    }

    public WebElement getFirstItem() {
        return firstItem;
    }


}
