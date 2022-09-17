package pageobject.staticpo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobject.TestBase;

public class SubcategoryPage extends TestBase {

    private static WebElement element1 = driver.findElement(By.className("category-1"));

    public static void clickSubcategory() {
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).perform();
        driver.findElement(By.className("category-2")).click();
    }

    public static void clickNameButton() {
        driver.findElement(By.linkText("Name")).click();
    }

    public static String element1OfArray() {
        String element1 = driver.findElements(By.className("name")).get(0).getText();
        return element1;
    }
    public static String element2OfArray() {
        String element2 = driver.findElements(By.className("name")).get(1).getText();
        return element2;
    }
}
