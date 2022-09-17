package pageobject.flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    private By successMessage = By.cssSelector(".notice.success");

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage assertThatSuccessMessageIsVisible(){
        Assert.assertTrue(driver.findElement(successMessage).isDisplayed(), "Logged in with incorrect creds" );
        return this;
    }
}
