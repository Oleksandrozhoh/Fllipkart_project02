package com.flipkart.pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage{

    @FindBy (xpath = "//input[@name='q']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy (xpath = "//ul//li/div/a/div[2]")
    public List<WebElement> suggestedOptionsBelowSearchBox;



    @FindBy (xpath = "//div[contains(@class,'row')]/../../button")
    public WebElement closeLoginSugestionButton;

    @FindBy (xpath = "//span[.='wooden spoon stand']/..")
    public WebElement searchResultHeader;

    @FindBy (xpath = "//li")
    public WebElement searchBoxDropdownFirstOption;



    @FindBy (className = "_3SkBxJ")
    public WebElement cart_btn;



}
