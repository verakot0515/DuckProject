import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class WebDriverTest {
    @Test
    public void doubleClickTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.pbclibrary.org/mousing/click3.htm");

        WebElement ieIcon = driver.findElement(By.name("icon1"));
        WebElement wordIcon = driver.findElement(By.name("icon2"));
        WebElement ppIcon = driver.findElement(By.name("icon3"));

        Actions builder = new Actions(driver);

        builder.doubleClick(ieIcon).doubleClick(wordIcon).doubleClick(ppIcon).perform();
    }

    @Test
    public void checkGoalTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://learn.javascript.ru/article/mouse-drag-and-drop/ball4/");

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement goal = driver.findElement(By.id("gate"));

        Actions win = new Actions(driver);

        win.dragAndDrop(ball, goal).perform();
    }

    @Test
    public void checkAlertTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.cssSelector("[onclick='jsAlert()']"));

        alertButton.click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        String resultText = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultText, "You successfully clicked an alert");
    }

    @Test
    public void checkConfirmTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confirmButton = driver.findElement(By.cssSelector("[onclick='jsConfirm()']"));

        confirmButton.click();

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
//        alert.dismiss();
        String resultText = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultText, "You clicked: Ok");
    }

    @Test
    public void checkPromptTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement promptButton = driver.findElement(By.cssSelector("[onclick='jsPrompt()']"));

        promptButton.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();
        String resultText = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultText, "You entered: Hello");
    }

    @Test
    public void frameTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String leftFrameText = driver.findElement(By.tagName("body")).getText();
        Assert.assertEquals(leftFrameText, "LEFT");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        String middleFrameText = driver.findElement(By.tagName("div")).getText();
        Assert.assertEquals(middleFrameText, "MIDDLE");

        driver.quit();
    }

    @Test
    public void handleTest() {
        WebDriver driver = new ChromeDriver();
//        SoftAssert softAssert = new SoftAssert();
        driver.get("https://the-internet.herokuapp.com/windows");

        String initalhandle = driver.getWindowHandle();
        driver.findElement(By.cssSelector("[href='/windows/new']")).click();

        String newTabHandle = driver.getWindowHandles().toArray()[1].toString();
        driver.switchTo().window(newTabHandle);

        String newWindow = driver.findElement(By.tagName("h3")).getText();

        driver.close();
        driver.switchTo().window(initalhandle);
        newWindow = driver.findElement(By.tagName("h3")).getText();
    }
}

