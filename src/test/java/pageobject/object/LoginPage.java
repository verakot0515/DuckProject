package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginButton = By.name("login");
    private By errorMessage = By.cssSelector(".notice.errors");

    private WebDriver driver;

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email) throws Exception {
        LOG.debug("Setting email");
        driver.findElement(emailInput).sendKeys(email);
    }

    public void setPassword(String password) throws Exception {
        LOG.debug("Setting password");
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() throws Exception {
        LOG.debug("Clicking login button");
        driver.findElement(loginButton).click();
    }

    public void attemptLogin(String email, String password) throws Exception {
        LOG.info("Attempting login");
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }

    public boolean loginErrorMessageIsVisible() throws Exception {
        LOG.info("Checking login error message visibility");
        return driver.findElement(errorMessage).isDisplayed();
    }

    public boolean hasOpened() {
        LOG.info("Getting Login Page loaded status");
        return super.hasOpened(driver, "Online Store | My Store1");
    }
}

