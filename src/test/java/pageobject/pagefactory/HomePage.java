package pageobject.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobject.object.PageBase;

public class HomePage extends PageBase {

    @FindBy(css = ".notice.success")
    private WebElement successMessage;
    private WebDriver driver;

    public boolean successMessageIsVisible(){
        return successMessage.isDisplayed();
    }

    public boolean hasOpened(){
        return super.hasOpened(driver, "Online Store | My Store1");
    }
}
