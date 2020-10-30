package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static tests.BaseTest.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage openPage() {
        driver.get(URL);
        return this;
    }

    public void login() {
        driver.findElement(By.id("username")).sendKeys(LOGIN);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).click();
    }
}
