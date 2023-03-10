package com.flipkart.pages;

import com.flipkart.utilities.ConfigurationReader;
import com.flipkart.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy (xpath = "//div[contains(@class,'row')]/../../button")
    public WebElement closeLoginSugestionButton;

    @FindBy(xpath = "//a[@title='KADENCE KXC KAD-SAX-KXB Alto Saxophone']") //US12
    public WebElement coolSax;

    @FindBy(xpath = "//div[normalize-space()='Price -- High to Low']") //US12
    public WebElement priceHighToLowBtn;

    @FindBy() //US12
    public WebElement addToCartBtn;

    @FindBy(xpath = "//div[@class='KK-o3G']")  //US12
    public WebElement goToCartBtn;

    @FindBy(xpath = "//a[contains(text(),'Roland PD-AE-05 AE-05 Aerophone GO Digital Wind In')]")
    public WebElement expectedText;


}
