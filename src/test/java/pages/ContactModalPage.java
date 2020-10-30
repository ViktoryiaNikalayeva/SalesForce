package pages;

import elements.ComboBox;
import elements.Input;
import elements.TextArea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage {
    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    public void create(Contact contact) {
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Title").write(contact.getTitle());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipPostalCode());
        new Input(driver, "Mailing State/Province").write(contact.getMailingStateProvince());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new TextArea(driver, "Description").write(contact.getDescription());
        new ComboBox(driver, "Account Name").select(contact.getViktoryia());

    }
    public void clickSave() {
        driver.findElement(By.cssSelector("[title='Save']")).click();

    }

}
