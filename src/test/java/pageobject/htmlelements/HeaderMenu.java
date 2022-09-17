//package pageobject.htmlelements;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import pageobject.helpers.WebDriverContainer;
//import ru.yandex.qatools.htmlelements.annotations.Name;
//import ru.yandex.qatools.htmlelements.element.HtmlElement;
//
//@Name("Header menu")
//@FindBy(id="site-menu")
//public class HeaderMenu extends HtmlElement {
//
//    @Name("Home button")
//    @FindBy(css=".fa.fa-home")
//    WebElement homeButton;
//
//    @Name("Rubber ducks button")
//    @FindBy(css="[href='https://litecart.stqa.ru/en/rubber-ducks-c-1']")
//    WebElement rubberDucksButton;
//
//    @Name("Delivery information")
//    @FindBy(css="[href='https://litecart.stqa.ru/en/delivery-information-i-2']")
//    WebElement deliveryInformationButton;
//
//    @Name("Terms&Conditions button")
//    @FindBy(css="[href='https://litecart.stqa.ru/en/terms-conditions-i-4']")
//    WebElement termsConditinsButton;
//
//    @Name("Скидки и акции")
//    @FindBy(css="[href='https://litecart.stqa.ru/en/skidki-i-akcii-i-5']")
//    WebElement скидкиИакцииButton;
//
//    @Name("Subcategory menu item")
//    @FindBy(css="[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/']")
//    WebElement subcategoryMenuItem;
//
//    public void clickHomeButton() {
//        homeButton.click();
//    }
//
//    public void clickRubberDucksButton() {
//        rubberDucksButton.click();
//    }
//
//    public void clickDeliveryInformationButton() {
//        deliveryInformationButton.click();
//    }
//
//    public void clickTermsConditionsButton() {
//        termsConditinsButton.click();
//    }
//
//    public void clickСкидкиИакцииButton() {
//        скидкиИакцииButton.click();
//    }
//
//    public void clickSubcategoryMenuItem() {
//        Actions builder = new Actions(WebDriverContainer.getDriver());
//
//        builder.moveToElement(rubberDucksButton).click(subcategoryMenuItem).perform();
//    }
//}
