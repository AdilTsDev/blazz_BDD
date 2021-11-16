package com.demoblaze.pages.modal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoblaze.base.Hooks.driver;

public class SignUpModal {

    @FindBy(id = "sign-username")
    private WebElement signUpName;

    @FindBy(id = "sign-password")
    private WebElement signUpPassword;

    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    private WebElement submitButton;

    public SignUpModal(){
        PageFactory.initElements(driver, this);
    }

    public WebElement getSignUpName() {
        return signUpName;
    }

    public WebElement getSignUpPassword() {
        return signUpPassword;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}
