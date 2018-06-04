package BrowsersTests;

import Pages.LoginPage;
import Pages.RecoverPass;
import Pages.RecoverSuccess;
import core.WebDriverTestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ErrorMessageTest { //extends WebDriverTestBase 

    @Test
    public void RecoveryPass(){
        System.out.println("RecoveryPass");
        /*
        driver.get(baseUrl);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.goForgetPage();
        RecoverPass recoverPass = PageFactory.initElements(driver, RecoverPass.class);
        assertTrue(recoverPass.isTextTitle());
        recoverPass.inputEmailToRecover();
        recoverPass.clickButton();
        RecoverSuccess recoverSuccess = PageFactory.initElements(driver, RecoverSuccess.class);
        assertTrue(recoverSuccess.checkRecoveredEmail());
        */
    }
}
