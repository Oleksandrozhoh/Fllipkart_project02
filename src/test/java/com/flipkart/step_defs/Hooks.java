package com.flipkart.step_defs;


import com.flipkart.utilities.Driver;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void teardownMethod(Scenario scenario){
        if (scenario.isFailed()){
            byte[] sceenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sceenshot,"image/png",scenario.getName());
        }
        Driver.closeDriver();
    }
}
