package com.demoblaze.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/demoblaze"},
        tags = "",
        dryRun = false,
        publish = true

)

public class RunnerTest extends AbstractTestNGCucumberTests {


}
