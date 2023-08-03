package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/Test.Feature"},
        glue = {"StepDefinitions","Util"},
        tags = "",
        plugin = {"summary","pretty", "html:Reports/IMDb/Reports.html"}
)

public class runner {
}
