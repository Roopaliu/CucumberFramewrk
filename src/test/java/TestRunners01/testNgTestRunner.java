package TestRunners01;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/features/Login.feature",
        glue = "stepDefinitions"
)

public class testNgTestRunner extends AbstractTestNGCucumberTests {


}
