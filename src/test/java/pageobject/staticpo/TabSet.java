package pageobject.staticpo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.TestBase;

public class TabSet extends TestBase {
    private static WebElement deliveryInformationTab = driver.findElement(By.cssSelector(".page-2"));
    private static WebElement rubberDucksInfotmationTab = driver.findElement(By.cssSelector(".category-1"));
    private static WebElement termsInformationTab = driver.findElement(By.cssSelector(".page-4"));
    private static WebElement homeTab = driver.findElement(By.cssSelector(".general-0"));

    public static void clickDeliveryInformationTab(){
        deliveryInformationTab.click();
    }

    public static String assertDeliveryTitle(){
        String titleDelivery = driver.getTitle();
        return titleDelivery;
    }

    public static void clickRubberDucksInfotmationTab(){
        rubberDucksInfotmationTab.click();
    }

    public static String assertDucksTitle(){
        String titleDucks = driver.getTitle();
        return titleDucks;
    }

    public static void clickTermsInformationTab(){
        termsInformationTab.click();
    }

    public static String assertTermsTitle(){
        String titleTerms = driver.getTitle();
        return titleTerms;
    }

    public static void clickHomeTab(){
        homeTab.click();
    }

    public static String assertHomeTitle(){
        String titleHome = driver.getTitle();
        return titleHome;
    }
}
