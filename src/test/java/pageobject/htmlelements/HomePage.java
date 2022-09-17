//package pageobject.htmlelements;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
//
//public class HomePage extends PageBase {
//
//    public HeaderMenu headerMenu;
//    private By successMessage = By.cssSelector(".notice.success");
//
//    private WebDriver driver;
//
//    public HomePage(WebDriver driver){
//        this.driver = driver;
//        HtmlElementLoader.populatePageObject(this,driver);
//    }
//
//    public boolean successMessageIsVisible(){
//        return driver.findElement(successMessage).isDisplayed();
//    }
//
//    public boolean hasOpened(){
//        return super.hasOpened(driver, "Online Store | My Store1");
//    }
//}
