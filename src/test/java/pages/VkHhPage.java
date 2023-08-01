package pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class VkHhPage {
    CareerAndCompanyLocators locators = new CareerAndCompanyLocators();

    public VkHhPage openTitle(String param) {
        step("Открытие вкладки", () -> {
            locators.openTitle(param).click();
        });
        return null;
    }

    public VkHhPage checkTitle(String expectedText) {
        step("Проверка содержимого вкладки", () -> {
            locators.checkTitle(expectedText).shouldBe(text(expectedText));
        });
        return null;
    }


    public class CareerAndCompanyLocators {
        public SelenideElement openTitle(String param) {
            return $(byTagAndText("a", (param)));
        }

        public SelenideElement checkTitle(String expectedText) {
            return (SelenideElement) $$(expectedText);
        }
    }
}
