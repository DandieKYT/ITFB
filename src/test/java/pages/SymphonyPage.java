package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;


public class SymphonyPage {
    private SelenideElement
            openSymphony = $x("//a[text()='Symphony']"),
            scroolToElement = $x("//*[contains(@class, 't142A__wraptwo')]/a");



    public SymphonyPage openIstructions() {
        step("Прокрутка старницы до необходимых разделов", () -> {
            scroolToElement.scrollIntoView(true);
        });
        return this;
    }

    public SymphonyPage openSymphony() {
        step("Открытие страницы симфонии", () -> {
            openSymphony.scrollIntoView(true).click();
        });
        return this;
    }
    CareerAndCompanyLocators locators = new CareerAndCompanyLocators();

    public SymphonyPage openTitle(String param) {
        step("Открытие вкладки с документом", () -> {
            locators.openTitlePDF(param).click();
        });
        return null;
    }

    public SymphonyPage checkTitle(String expectedText) {
        step("Проверка содержимого вкладки", () -> {
            locators.checkTittlePDF(expectedText).shouldBe(text(expectedText));
        });
        return null;
    }
    public class CareerAndCompanyLocators {
        public SelenideElement openTitlePDF(String param) {
            return $(byTagAndText("span", (param)));
        }

        public SelenideElement checkTittlePDF(String expectedText) {
            return $((byTagAndText("h1", (expectedText))));
        }
    }
}
