package projectName.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(


        features = "@target/rerun.txt",
        glue = "projectName/step_defs"

)

public class FailedTestsRunner {




}
