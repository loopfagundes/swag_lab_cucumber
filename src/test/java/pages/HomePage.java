package pages;

import com.saucedemo.utils.Property;
import com.saucedemo.webdrivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessaDaTelaDeLoginESenha() {
        driver = DriverManager.getDriver();
        driver.get(Property.get("url"));
    }

    public void loginSenha() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    public void clicaBotaoLogin() {
        driver.findElement(By.id("login-button")).click();
    }

    public void escolheProduto() {
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.cssSelector("#shopping_cart_container > a")).click();
    }
}