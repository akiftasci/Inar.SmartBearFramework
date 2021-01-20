package inar.smartbear.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "Inar/inar.smartbear/step_definitions",
        tags= "@add_order",
        dryRun = false,
        plugin= "html:tager/default/default-report"
)

public class CumcumberRunner {

}
