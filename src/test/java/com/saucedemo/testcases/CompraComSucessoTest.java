package com.saucedemo.testcases;

import com.saucedemo.steps.TelaDeLoginStep;
import com.saucedemo.utils.BaseTest;
import com.saucedemo.utils.DataClass;
import com.saucedemo.utils.Property;
import com.saucedemo.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CompraComSucessoTest extends BaseTest {

    @Test(dataProvider = "dataLogin", dataProviderClass = DataClass.class)
    void compraComSucessoTest(String user, String password) {
            WebDriver driver = DriverManager.getDriver();
            driver.get(Property.get("url"));
            TelaDeLoginStep telaDeLoginStep = new TelaDeLoginStep(driver);
            telaDeLoginStep.efeturaLogin(user, password);
    }
}