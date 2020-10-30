package tests;


import org.testng.annotations.Test;

public class AccountTest extends BaseTest {


    @Test
    public void createAccount() {
        loginPage.openPage()
                .login();
        accountListPage.openPage()
                .clickNew();
        accountModalPage.create(account);
        accountModalPage.clickSave();
    }

}
