package tests;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest {


    @Test
    public void createContact() {
        loginPage.openPage();
        loginPage.login();
        contactListPage.openPage();
        contactListPage.clickNew();
        contactModalPage.create(contact);
        contactModalPage.clickSave();


    }
}
