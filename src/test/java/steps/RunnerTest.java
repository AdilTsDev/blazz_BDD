package steps;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/hellocucumber"},
        glue = {"steps"},
        tags = "@smoke"

)

public class RunnerTest extends AbstractTestNGCucumberTests {


}
