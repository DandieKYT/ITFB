package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class EasyDocPage {
    private SelenideElement
            openEasyDoc = $x("//a[text()='EasyDoc']"),
            checkoutLogoEasyDoc = $x("//strong[text()='EASYDOC']");

    public EasyDocPage openEasyDoc() {
        step("Открытие раздела EasyDoc", () -> {
            openEasyDoc.scrollIntoView(true);
            openEasyDoc.click();
        });
        return this;
    }

    public EasyDocPage checkoutLogoEasyDoc() {
        step("Проверка видимости лого EasyDoc", () -> {
            checkoutLogoEasyDoc.shouldBe(Condition.visible);
        });
        return this;
    }
}
