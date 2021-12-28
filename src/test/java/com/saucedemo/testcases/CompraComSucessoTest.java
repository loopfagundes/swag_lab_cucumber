package com.saucedemo.testcases;

import com.saucedemo.utils.BaseTest;
import com.saucedemo.utils.Property;
import com.saucedemo.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CompraComSucessoTest extends BaseTest {

    @Test()
    public void compraComSucessoTest() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url"));
    }
}