package com.flipkart.step_defs;

import com.flipkart.pages.MainPage;
import com.flipkart.utilities.ConfigurationReader;
import com.flipkart.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SubMenuFurnishing {
    MainPage mainPage = new MainPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @Given("user should hover {string} menu")
    public void user_should_hover_menu(String element) {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        mainPage.closePop.click();
        mainPage.mainMenuElement(element);
        }
    @And("user click Home Furnishings")
    public void userClickHomeFurnishings() {
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.subMenu));
        mainPage.subMenu.click();
        mainPage.homeFurniture.click();
    }
    @Then("user able to see furnishing:")
    public void user_able_to_see_furnishing(List<String> dataTable) {
        List<String> actual = new ArrayList<>();
        for (WebElement element : mainPage.furnitureList) {
            actual.add(element.getText());
        }

        Assert.assertTrue(actual.containsAll(dataTable));
    }


}
