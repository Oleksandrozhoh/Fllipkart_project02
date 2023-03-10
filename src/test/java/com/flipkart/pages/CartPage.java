package com.flipkart.pages;

import com.flipkart.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (css = "div[class='zab8Yh _10k93p']")
    public WebElement addedItem;
    @FindBy(xpath = "//div[.='Remove']")
    public WebElement remove_btn;

    @FindBy(xpath = "//div[.='Save for later']")
    public WebElement saveForLater_btn;

    @FindBy(xpath = "//div[contains(text(),'Successfully removed')]")
    public WebElement popUpRemovedMessage;

    @FindBy(xpath = "//div[.='Missing Cart items?']")
    public WebElement emptyCart_message;
}
