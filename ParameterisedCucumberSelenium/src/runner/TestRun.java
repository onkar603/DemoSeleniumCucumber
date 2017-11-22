package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="Feature/ParameterisedFeature.feature", glue="stepDefinition", format = {"html:target/cucumber-pretty"})
public class TestRun {

}
