package Runners;

import com.saucedemo.webdrivers.BrowserEnum;
import com.saucedemo.webdrivers.DriverFactory;
import com.saucedemo.webdrivers.DriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@CucumberOptions(
        plugin = {},
        features = {"src/test/resources/features/firstTest.feature"}, //caminho BDD
        glue = {"cucumber"} //nome de pacote
)

public class RunCucumber extends AbstractTestNGCucumberTests {

    @BeforeMethod
    public void setUp() {
        WebDriver driver = DriverFactory.createInstance(BrowserEnum.CHROME);
        DriverManager.setDriver(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}