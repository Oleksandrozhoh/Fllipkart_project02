package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@title='urban platter Wooden Olive Spoon']") //US12
    public WebElement woodenOliveSpoon;

    @FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']") //US12
    public WebElement goToCartBtn;

    @FindBy(xpath = "//a[normalize-space()='urban platter Wooden Olive Spoon']")  //US12
    public WebElement spoonInTheCart;

    @FindBy(xpath = "//a[@title='urban platter Wooden Olive Spoon']")
    public WebElement expectedText;

}
