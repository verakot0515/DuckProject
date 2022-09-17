package pageobject;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.helpers.WebDriverContainer;
import pageobject.staticpo.HomePage;
import pageobject.staticpo.LoginPage;
import pageobject.staticpo.SubcategoryPage;
import pageobject.staticpo.TabSet;

public class SPOTest extends TestBase {

    @Test

    public static void successfullLoginTest(){
        LoginPage.attemptLogin(driver,"verusha.kotik@mail.ru", "1234!");
        Assert.assertTrue(HomePage.successMessageIsVisible(driver), "Login was unsuccessfull");
    }

    @Test

    public static void unsuccessfullLoginTest(){
        LoginPage.attemptLogin(driver,"verusha.kotik@mail.ru", "123");
        Assert.assertTrue(LoginPage.loginErrorMessageIsVisible(driver), "Logged in with incorrect creds");
    }


    @Test
    public static void deliveryTest() {
        TabSet.clickDeliveryInformationTab();
        String deliveryTitle = TabSet.assertDeliveryTitle();
        Assert.assertEquals(deliveryTitle,"Delivery Information | My Store1");
    }

    @Test
    public static void ducksInformationTest(){
        TabSet.clickRubberDucksInfotmationTab();
        String ducksTitle = TabSet.assertDucksTitle();
        Assert.assertEquals(ducksTitle, "Rubber Ducks | My Store1");
    }

    @Test
    public static void termsInformationTest(){
        TabSet.clickTermsInformationTab();
        String termsTitle = TabSet.assertTermsTitle();
        Assert.assertEquals(termsTitle, "Terms & Conditions | My Store1");
    }

    @Test
    public static void homeTest(){
        TabSet.clickHomeTab();
        String homeTitle = TabSet.assertHomeTitle();
        Assert.assertEquals(homeTitle, "Online Store | My Store1");
    }

    @Test
    public static void subcategoryTest() {
        Logger.getLogger(WebDriverContainer.class).info("log9");
        SubcategoryPage.clickSubcategory();
    }

    @Test
    public static void sortingTest() {
        SubcategoryPage.clickSubcategory();
        SubcategoryPage.clickNameButton();

        // create right array
        String[] rightNames = new String[2];
        rightNames[0] = "Green DucK";
        rightNames[1] = "Yellow Duck";

        Assert.assertEquals(SubcategoryPage.element1OfArray(), rightNames[0]);
        Assert.assertEquals(SubcategoryPage.element2OfArray(), rightNames[1]);
    }
}
