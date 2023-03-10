package com.flipkart.pages;

import com.flipkart.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath= "//div[@class='xtXmba']")
    public List<WebElement> mainMenu;

    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    public WebElement closePop;

    public void mainMenuElement(String element){
        for (WebElement webElement : mainMenu) {
            if (webElement.getText().equals(element)){
                WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
                Actions actions = new Actions(Driver.getDriver());
                actions.moveToElement(webElement)
                        .pause(15).perform();;
            }
        }
    }

    @FindBy(xpath = "//a[@class='_6WOcW9 _2-k99T']")
    public WebElement subMenu;

    @FindBy(xpath = "//span[@class='_2I9KP_'][6]")
    public WebElement homeFurniture;

    @FindBy(xpath = "//div[@class='_1fwVde'][3]/a")
    public List<WebElement> furnitureList;


}
