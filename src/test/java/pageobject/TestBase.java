package pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobject.helpers.WebDriverContainer;

public class TestBase {

    protected static WebDriver driver;
    @BeforeMethod

    public void setup(){
        driver = WebDriverContainer.getDriver();

        driver.get("https://litecart.stqa.ru/en/");
    }

    @AfterMethod

    public void teardown(){
        WebDriverContainer.closeDriver();
    }
}
