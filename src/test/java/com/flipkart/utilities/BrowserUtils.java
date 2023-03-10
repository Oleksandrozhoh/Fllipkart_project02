package com.flipkart.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static  void sleep(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
    public static void verifyTitle(String expectedInTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedInTitle);
    }

}
