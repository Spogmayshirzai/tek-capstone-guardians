package tek.capstone.framework.runner;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
    tags = "@userInfoUpdate",
    features =("classpath:features"),
    glue = "tek.capstone.framework",
    dryRun = true,
    plugin = {
            "pretty",

            "html:target/htmlReports/cucumber-pretty.html",
            "json:target/jsonReports/cucumber.json"
    },
    snippets = CAMELCASE,

    monochrome = true
    )









public class TestRunner {

}

