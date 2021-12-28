package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/firstTest.feature"},
        glue = {"cucumber"} //nome de pacote
)
public class Run extends AbstractTestNGCucumberTests {
}