package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

        String URL = "https://d2w00000fag1aear.lightning.force.com/lightning/o/Account/list?filterName=Recent";
        By newButton = By.cssSelector("[title=New]");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

        public AccountListPage openPage() {
            driver.get(URL);
            return this;
        }

        public void clickNew() {
            driver.findElement(newButton).click();
        }
}
