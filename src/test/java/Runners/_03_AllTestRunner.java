package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Features/TC01_Login.feature",
                    "src/test/java/Features/StatusCode01.feature"},
        glue = {"Steps"}
)

public class _03_AllTestRunner extends AbstractTestNGCucumberTests {


}
