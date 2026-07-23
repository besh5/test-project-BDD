package projectName.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt"
        },
        dryRun = false,
        publish = true,
        features = "src/test/resources/features",
        glue = "projectName/step_defs",
        tags = "@bing"
)
public class CukesRunner {
}
