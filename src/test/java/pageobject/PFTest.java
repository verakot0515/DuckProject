package pageobject;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.pagefactory.HomePage;
import pageobject.pagefactory.LoginPage;

public class PFTest extends TestBase {

    @Test

    public void successfullLoginTest(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        loginPage.attemptLogin("verusha.kotik@mail.ru", "1234!");
        Assert.assertTrue(homePage.successMessageIsVisible(), "Login was unsuccessfull");
    }

    @Test

    public void unsuccessfullLoginTest(){
        LoginPage loginPage =PageFactory.initElements(driver, LoginPage.class);

        loginPage.attemptLogin("verusha.kotik@mail.ru", "123");
        Assert.assertTrue(loginPage.loginErrorMessageIsVisible(), "Logged in with incorrect creds");
    }
}
