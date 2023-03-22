package login;

import base.Basetests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import org.testng.Assert;

public class LoginTests extends Basetests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is incorrect");
    }
}
