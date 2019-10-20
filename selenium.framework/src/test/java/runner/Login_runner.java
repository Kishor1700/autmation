package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kisho\\eclipse-workspace3\\selenium.framework\\src\\test\\java\\feature\\login.feature", glue = {
		"step_definition" }
)
public class Login_runner {

}
