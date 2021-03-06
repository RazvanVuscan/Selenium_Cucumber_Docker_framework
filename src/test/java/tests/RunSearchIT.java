package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by razvan.vuscan on 3/16/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/searchTests",
        plugin = {"pretty", "html:target/cucumberTestReport", "json:target/cucumberTestReport/ChromeSearchTest.json"},
        glue = {"steps"},
        tags = {"@Chrome or @Firefox"})
public class RunSearchIT {

}


