package com.flipkart.utilities;

import org.junit.Assert;

public class BrowserUtils {

    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void verifyTitleContains(String titleContains){
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains(titleContains));
    }
}
