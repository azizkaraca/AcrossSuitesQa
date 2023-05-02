package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/Features/TC01_Login.feature"},
        glue = {"Steps"},
        plugin = {"html:target//cucumber-reports.html"}
)

public class _01_LoginRunner extends AbstractTestNGCucumberTests {


}
