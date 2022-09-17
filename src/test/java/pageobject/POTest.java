package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.object.HomePage;
import pageobject.object.LoginPage;

import java.util.List;


public class POTest extends TestBase {

    @Test
    public void successfullLoginTest() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.attemptLogin("verusha.kotik@mail.ru", "1234!");
        Assert.assertTrue(homePage.successMessageIsVisible(), "Login was unsuccessfull");
    }

    @Test
    public void unsuccessfullLoginTest() throws Exception {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.attemptLogin("verusha.kotik@mail.ru", "123");
        Assert.assertTrue(loginPage.loginErrorMessageIsVisible(), "Logged in with incorrect creds");
    }

    @Test
    public void homePageLoadedTest() throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.attemptLogin("verusha.kotik@mail.ru", "1234!");
        Assert.assertTrue(homePage.hasOpened(), "Home page has been opened");
    }

    @Test
    public void subcategoryTest() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.className("category-1"));
        actions.moveToElement(element).perform();
        driver.findElement(By.className("category-2")).click();
    }

    @Test
    public void sortingNameTest() {
        // open subcategories
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.className("category-1"));
        actions.moveToElement(element).perform();
        driver.findElement(By.className("category-2")).click();

        // click name button
        driver.findElement(By.linkText("Name")).click();

        // create right array
        String[] rightNames = new String[2];
        rightNames[0] = "Green DucK";
        rightNames[1] = "Yellow Duck";

        //assert
        List<WebElement> buttons = driver.findElements(By.className("name"));

        Assert.assertEquals(buttons.get(0).getText(), rightNames[0]);
        Assert.assertEquals(buttons.get(1).getText(), rightNames[1]);
    }
}
