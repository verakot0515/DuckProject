package pageelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageWithTable {

    public Table table1;
    private By table1Locator = By.id("table1");

    private WebDriver driver;

    public PageWithTable(WebElement table){
        this.driver = driver;
        table1 = new Table(driver.findElement(table1Locator));

    }
}
