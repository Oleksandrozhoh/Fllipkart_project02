package com.flipkart.pages;

import com.flipkart.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemIPhone12Page {
    public ItemIPhone12Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//button[text()='Add to cart']")
    public WebElement addToCart_btn;




}
