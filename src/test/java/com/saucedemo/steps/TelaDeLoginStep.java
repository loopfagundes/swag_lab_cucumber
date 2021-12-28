package com.saucedemo.steps;

import com.saucedemo.pageobjects.TelaDeLoginPageObject;
import org.openqa.selenium.WebDriver;

public class TelaDeLoginStep {
    private final WebDriver driver;
    private final TelaDeLoginPageObject telaDeLoginPageObject;

    public TelaDeLoginStep(WebDriver _driver) {
        driver = _driver;
        telaDeLoginPageObject = new TelaDeLoginPageObject(_driver);
    }

    public TelaDeLoginStep efeturaLogin(String user, String password) {
        loginESenha(user, password);
        return this;
    }

    private TelaDeLoginStep loginESenha(String user, String password) {
        telaDeLoginPageObject.loginUsuarioTextField().sendKeys(user);
        telaDeLoginPageObject.senhaUsuarioTextField().sendKeys(password);
        return this;
    }
}