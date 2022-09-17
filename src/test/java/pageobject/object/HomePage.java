package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    private By successMessage = By.cssSelector(".notice.success");

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean successMessageIsVisible(){
        LOG.info("Checking success message");
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean hasOpened(){
        LOG.info("Getting Home Page loaded status");
        return super.hasOpened(driver, "Online Store | My Store1");
    }
}
