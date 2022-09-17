//package pageobject.selenide;
//
//
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
//import static com.codeborne.selenide.Condition.*;
//
//public class SelenideTest {
//
//    @Test
//    public void selenideTest() {
//        open("https://litecart.stqa.ru/en/");
//        $("[name=email]").sendKeys("verusha.kotik@mail.ru");
//        $(By.name("password")).sendKeys("1234!");
//        $(By.name("login")).click();
//        $(".notice.success").shouldBe(visible).shouldHave(text(" You are now logged in as Vera Kot."));
//    }
//
//}
