package com.flipkart.step_defs;

import com.flipkart.pages.MainPage;
import com.flipkart.utilities.BrowserUtils;
import com.flipkart.utilities.ConfigurationReader;
import com.flipkart.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.configuration.ConfigurationXMLReader;
import org.openqa.selenium.WebDriver;

public class US12_StepDefs {
    MainPage mainPage = new MainPage();
    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        if (mainPage.closeLoginSugestionButton.isDisplayed()){
            mainPage.closeLoginSugestionButton.click();
        }
    }
    @When("user adds a product to the cart")
    public void user_adds_a_product_to_the_cart() {
        mainPage.searchBox.sendKeys("saxophone");
        BrowserUtils.sleep(2);
        mainPage.searchButton.click();
        BrowserUtils.sleep(2);
        mainPage.priceHighToLowBtn.click();
        BrowserUtils.sleep(2);
        mainPage.coolSax.click();
        BrowserUtils.sleep(2);
        mainPage.addToCartBtn.click();
    }
    @Then("user sees the product in the cart")
    public void user_sees_the_product_in_the_cart() {
        BrowserUtils.sleep(2);
        mainPage.goToCartBtn.click();
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle("Roland PD-AE-05 AE-05 Aerophone GO Digital Wind In");

    }
}
