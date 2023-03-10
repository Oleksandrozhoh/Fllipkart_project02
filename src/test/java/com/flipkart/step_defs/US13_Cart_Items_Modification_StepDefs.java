package com.flipkart.step_defs;

import com.flipkart.pages.BuyProductPage;
import com.flipkart.pages.CartPage;
import com.flipkart.pages.ItemIPhone12Page;
import com.flipkart.pages.MainPage;
import com.flipkart.utilities.BrowserUtils;
import com.flipkart.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class US13_Cart_Items_Modification_StepDefs {
    MainPage mainPage = new MainPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
    Actions action = new Actions(Driver.getDriver());
    ItemIPhone12Page itemIPhone12Page = new ItemIPhone12Page();
    CartPage cartPage = new CartPage();
    BuyProductPage buyProductPage = new BuyProductPage();

    @Given("User click on item from the list {string}")
    public void user_click_on_first_from_the_list(String item) {
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[contains(@data-tkid, 'iphone 12')]")); // or //div[contains(@data-tkid, 'iphone 12')]

        wait.until(ExpectedConditions.visibilityOfAllElements(list));
        for (WebElement webElement : list) {
            if (webElement.getText().equals(item)) {
                webElement.click();
                break;
            }
        }


    }

    @Given("User click on first top option")
    public void user_click_add_to_cart() {
        buyProductPage.availability.click();

        buyProductPage.excludeOutOfStock_Opt.click();

        wait.until(ExpectedConditions.visibilityOf(buyProductPage.excludeOutOfStock_Opt));

        buyProductPage.firstTopIphoneItem.click();

    }

    @And("User clicks Add to cart")
    public void userClicksAddToCart() {
        Set<String> windows = Driver.getDriver().getWindowHandles();
        String firstWindow = Driver.getDriver().getWindowHandle();
        // BrowserUtils.sleep(3);
        for (String each : windows) {
            Driver.getDriver().switchTo().window(each);
            // wait.until(ExpectedConditions.titleContains("iPhone 12"));

            if (!(each.equals(firstWindow))) {
                break;
            }
        }

        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

        wait.until(ExpectedConditions.elementToBeClickable(itemIPhone12Page.addToCart_btn));
        itemIPhone12Page.addToCart_btn.click();
        BrowserUtils.sleep(3);

    }

    @Given("User click Cart and see {string}")
    public void user_click_card_and_see(String item) {
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.cart_btn));
        mainPage.cart_btn.click();
        // Assert.assertTrue(cartPage.addedItem.isDisplayed());

    }

    @Given("User clicks Remove item and sees pop up Remove window")
    public void user_clicks_remove_item_and_sees_pop_up_window() {
        // BrowserUtils.sleep(3);
        // wait.until(ExpectedConditions.visibilityOf(cartPage.remove_btn));
       /* if (cartPage.emptyCart_message.isDisplayed()){
            Driver.getDriver().navigate().back();
            wait.until(ExpectedConditions.elementToBeClickable(itemPage.addToCart_btn));
            itemPage.addToCart_btn.click();

        }

        */


        wait.until(ExpectedConditions.elementToBeClickable(cartPage.remove_btn));
        cartPage.remove_btn.click();

    }

    @When("user click Remove pop up window")
    public void user_click_remove() {
        wait.until(ExpectedConditions.visibilityOf(cartPage.remove_btn));
        cartPage.remove_btn.click();
    }


    @Then("User sees pop up window that {string} Successfully removed")
    public void userSeesPopUpWindowThatSuccessfullyRemoved(String arg0) {
        wait.until(ExpectedConditions.visibilityOf(cartPage.popUpRemovedMessage));
        Assert.assertTrue(cartPage.popUpRemovedMessage.isDisplayed());
    }

    @And("User clicks Save for later")
    public void userClicksSaveForLater() {
        cartPage.saveForLater_btn.click();
    }

    @Then("User sees save for later list with the item {string}")
    public void userSeesSaveForLaterListWithTheItem(String item) {
        Assert.assertTrue(cartPage.saveForLaterList.isDisplayed());

    /*
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.remove_btn));
        cartPage.remove_btn.click();
        cartPage.remove_btn.click();

     */
    }
}
