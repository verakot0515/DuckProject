package pageobject.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginButton = By.name("login");
    private By errorMessage = By.cssSelector(".notice.errors");

    private WebDriver driver;

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    public LoginPage setEmail(String email){
        driver.findElement(emailInput).sendKeys(email);

        return this;
    }

    public LoginPage setPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);

        return this;
    }

    private void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public HomePage loginWithCorrectCreds (){
        setEmail("verusha.kotik@mail.ru");
        setPassword("1234!");
        clickLoginButton();

        return new HomePage(driver);
    }

    public LoginPage loginWithIncorrectCreds(){
        setEmail("verusha.kot@mail.ru");
        setPassword("124!");
        clickLoginButton();

        return this;
    }

    public LoginPage AsserLoginErrorMessageIsVisible(){
        Assert.assertTrue(driver.findElement(errorMessage).isDisplayed(), "Error Message not displayed");

        return this;
    }
}

