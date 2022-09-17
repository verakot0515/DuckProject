package pageelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTest {

    @Test
    public void TableTest(){
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/tables");

        PageWithTable pageWithTable = new PageWithTable((WebElement) driver);
        int rows = pageWithTable.table1.getRowsCount();
        int columns = pageWithTable.table1.getColumnsCount();

        String textIn33 = pageWithTable.table1.getCell(3,3).getText();
    }
}
