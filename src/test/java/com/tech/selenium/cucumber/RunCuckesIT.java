package com.tech.selenium.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, strict = true,
        tags = {"@smoke-test"},
        features = "src/test/resources/com.tech.selenium.features/",
        format = {"html:target/cucumber"},
        glue = {"com/tech/selenium/step_def"}

)
public class RunCuckesIT extends Driver{
}
