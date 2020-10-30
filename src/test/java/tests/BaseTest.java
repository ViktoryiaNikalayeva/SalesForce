package tests;

import models.Account;
import models.Contact;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    ContactListPage contactListPage;
    AccountListPage accountListPage;
    AccountModalPage accountModalPage;
    ContactModalPage contactModalPage;
    LoginPage loginPage;

    public static final String URL = "https://d2w00000fag1aear.my.salesforce.com/";
    public static final String LOGIN = "vik.nik.09.11.1995-e6tt@force.com";
    public static final String PASSWORD = "password1!";

    Account account = new Account("Viktoryia",
            "tut.by", "Analyst", "Retail",
            "Account", "135625", "100",
            "500", "Description",
            "Baker", "London", "Heatthrow",
            "654", "UK");

    Contact contact = new Contact ("123456", "37589565", "Stan",
            "Pines","ret@gmail.com", "Title",
            "Address", "Street", "London",
            "Heatthrow", "456123", "UK",
            "456789", "Depart", "654987", "456123",
            "Jane", "Description", "Viktoryia");

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        accountListPage = new AccountListPage(driver);
        accountModalPage = new AccountModalPage(driver);
        contactListPage = new ContactListPage(driver);
        contactModalPage = new ContactModalPage(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
