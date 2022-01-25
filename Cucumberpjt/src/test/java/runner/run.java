package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue="steps", plugin={"html:target/test_report","junit:target/junit_xml_report.xml","json:target/json_report.json"}) 
public class run {

}











//tags="not @Smoke" , tags="@Smoke and @Regression", tags= "@Smoke or @Regression"
//plugin={"pretty","html:Report1,jason:Report2,junit:Report3
