package Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/Feature"},glue= {"StepDefinitions"},monochrome = true,tags= {"@Runs"})
public class Run {

}
