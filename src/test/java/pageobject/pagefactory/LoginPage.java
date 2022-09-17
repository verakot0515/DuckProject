package pageobject.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobject.object.PageBase;

public class LoginPage extends PageBase {
    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(name = "login")
    private WebElement loginButton;

    @FindBy(css = ".notice.errors")
    private WebElement errorMessage;
    private WebDriver driver;

    public void setEmail(String email){
        emailInput.sendKeys(email);
    }

    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void attemptLogin(String email, String password){
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }

    public boolean loginErrorMessageIsVisible(){
        return errorMessage.isDisplayed();
    }

    public boolean hasOpened(){
        return super.hasOpened(driver, "Online Store | My Store1");
    }
}

