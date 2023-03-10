package com.flipkart.pages;

import com.flipkart.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProductPage {
    public BuyProductPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//div[contains(.,'APPLE iPhone 12 ')])[6]")
    public WebElement firstTopIphoneItem;

    @FindBy(xpath = "(//div[.='Availability'])[1]")
    public WebElement availability;

    @FindBy(xpath = "(//div[.='Exclude Out of Stock'])[1]")
    public WebElement excludeOutOfStock_Opt;


}
