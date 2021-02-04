package co.com.myStore.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/myStore.feature",
        tags = "@stories",
        glue = "co.com.myStore.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
