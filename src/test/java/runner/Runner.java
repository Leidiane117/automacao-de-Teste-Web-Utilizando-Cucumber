package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            tags = {},
            glue = {"hooks", "steps"},
            plugin = {//"io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm",
                    "pretty", "json:target/json-cucumber-reports/cucumber.json",
                    "html:target/json-cucumber-reports-html/",
                    "junit:target/xml-junit/junit.xml"},
            features = {"src/test/resources/features"})
    public class Runner {}


