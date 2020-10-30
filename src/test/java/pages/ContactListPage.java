package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage {

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    String URL = "https://d2w00000fag1aear.lightning.force.com/lightning/o/Contact/list?filterName=Recent";
    By newButton = By.cssSelector("[title=New]");


    public ContactListPage openPage() {
        driver.get(URL);
        return this;
    }

    public void clickNew() {
        driver.findElement(newButton).click();
    }
}
