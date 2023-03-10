package com.flipkart.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(

            plugin = {
                    "html:target/cucumber-reports.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                    "json:target/cucumber.json"
            },
            publish = true,
            features = "src/test/resources/features",
            glue = "com/flipkart/step_defs",
            tags = "@soukaina",
            dryRun = false
    )

public class TestRunner {
}
