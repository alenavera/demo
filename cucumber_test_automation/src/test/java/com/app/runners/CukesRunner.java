package com.app.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features/",
        glue = "com/app/step_definitions/",
        dryRun = true,
        tags = "@lili",
        publish = true
)

public class CukesRunner {

}
