package com.saucedemo.pageobjects;

import com.saucedemo.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaDeLoginPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public TelaDeLoginPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement loginUsuarioTextField() {
        return waitElement.toBeClickable(By.id("user-name"));
    }

    public WebElement senhaUsuarioTextField() {
        return waitElement.toBeClickable(By.id("password"));
    }

    public WebElement loginButton() {
        return waitElement.toBeClickable(By.id("login-button"));
    }

}