package pageobject;

import org.testng.annotations.Test;
import pageobject.flow.LoginPage;

public class FITest extends TestBase {

    @Test

    public void successfullLoginTest(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.
                loginWithCorrectCreds().
                assertThatSuccessMessageIsVisible();
    }

    @Test

    public void unsuccessfullLoginTest(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.
                loginWithIncorrectCreds().
                AsserLoginErrorMessageIsVisible();
    }
}
