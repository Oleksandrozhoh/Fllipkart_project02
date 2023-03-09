package com.flipkart.step_defs;

import com.flipkart.pages.MainPage;
import com.flipkart.utilities.BrowserUtils;
import com.flipkart.utilities.ConfigurationReader;
import com.flipkart.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.et.Ja;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class US15_Search_StepDefs {

    MainPage mainPage = new MainPage();
    Actions action = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        if (mainPage.closeLoginSugestionButton.isDisplayed()){
            mainPage.closeLoginSugestionButton.click();
        }
    }
    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        action.moveToElement(mainPage.searchBox).click().sendKeys(string).perform();

        //action.moveToElement(mainPage.searchBox).click().sendKeys(" ").perform();
       // BrowserUtils.sleep(2);

    }
    @Then("user should see {string} in the suggested options")
    public void user_should_see_in_the_suggested_options(String string) {
        wait.until(ExpectedConditions.visibilityOf(mainPage.searchBoxDropdownFirstOption));
        for (WebElement each : mainPage.suggestedOptionsBelowSearchBox) {
            if (each.getText().toLowerCase().contains(string.toLowerCase())){
                return;
            }
        }
        Assert.fail("There was no \""+ string+"\" option displayed");
    }
    @When("user selects {string} from the suggested options")
    public void user_selects_from_the_suggested_options(String string) {
        wait.until(ExpectedConditions.visibilityOf(mainPage.searchBoxDropdownFirstOption));
        for (WebElement each : mainPage.suggestedOptionsBelowSearchBox) {
            if (each.getText().toLowerCase().contains(string.toLowerCase())){
                action.moveToElement(each).click().perform();
                return;
            }
        }
    }
    @Then("user should be launched to the page that contains {string} in title")
    public void user_should_be_launched_to_the_page_that_contains_in_title(String string) {
        BrowserUtils.sleep(2);
            BrowserUtils.verifyTitleContains(string);
    }
}
