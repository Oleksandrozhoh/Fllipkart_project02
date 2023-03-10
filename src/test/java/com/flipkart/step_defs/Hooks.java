package com.flipkart.step_defs;


import com.flipkart.utilities.ConfigurationReader;
import com.flipkart.utilities.Driver;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.lang.module.Configuration;

public class Hooks {

    @Before
    public void beforeMethod(){
        ConfigurationReader.getProperties("url");
    }


    @After
    public void teardownMethod(Scenario scenario){
        if (scenario.isFailed()){
            byte[] sceenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sceenshot,"image/png",scenario.getName());
        }
        Driver.closeDriver();
    }
}
