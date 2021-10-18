package co.com.choucair.utestReto.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
        glue = "co.com.choucair.utestReto.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegisterUserRunner {
}
