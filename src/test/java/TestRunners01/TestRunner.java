package TestRunners01;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/features/Login.feature",
        glue= "stepDefinitions",tags = "@SmokeTesting",
        plugin={ "pretty", "html:target/cucumber.html"}

)

public class TestRunner {
}
