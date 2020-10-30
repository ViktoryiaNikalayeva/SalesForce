package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComboBox {

    WebDriver driver;
    String label;
    String locator = "//*[contains(text(),'Account Name')]/ancestor::div[contains(@class, 'uiInput')]//input";
    String optionLocator = "[title = '135625']";

    public ComboBox(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys("Viktoryia");
        driver.findElement(By.cssSelector(String.format(optionLocator, option))).click();
    }
}
