//package pageobject.htmlelements;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
//
//public class LoginPage {
//    private By emailInput = By.name("email");
//    private By passwordInput = By.name("password");
//    private By loginButton = By.name("login");
//    private By errorMessage = By.cssSelector(".notice.errors");
//
//    public HeaderMenu headerMenu;
//    private WebDriver driver;
//
//    public LoginPage (WebDriver driver){
//        this.driver = driver;
//        HtmlElementLoader.populatePageObject(this,driver);
//    }
//
//    public void setEmail(String email){
//        driver.findElement(emailInput).sendKeys(email);
//    }
//
//    public void setPassword(String password){
//        driver.findElement(passwordInput).sendKeys(password);
//    }
//
//    public void clickLoginButton(){
//        driver.findElement(loginButton).click();
//    }
//
//    public void attemptLogin(String email, String password){
//        setEmail(email);
//        setPassword(password);
//        clickLoginButton();
//    }
//
//    public boolean loginErrorMessageIsVisible(){
//        return driver.findElement(errorMessage).isDisplayed();
//    }
//}
//
